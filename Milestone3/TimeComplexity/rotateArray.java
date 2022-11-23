package Milestone3.TimeComplexity;


public class rotateArray 
{




    public static void main(String[] args) 
    {

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
        RotateArray(arr, 7);
        System.out.println();
        printArray(arr);
    }





    public static void RotateArray(int arr[],int d)
    {


        //Good Aproach
        reverse(arr);

   
        

        int arrNmD[]=new int[arr.length-d];
        int arrD[]=new int[d];

        for(int i=0;i<arrNmD.length;i++)
        {
            arrNmD[i]=arr[i];
        }
        
        for(int i=0;i<arrD.length;i++)
        {
            arrD[i]=arr[i+arrNmD.length];
        }



        

        reverse(arrNmD);
        reverse(arrD);

        for(int i=0;i<arrNmD.length;i++)
        {
            arr[i]=arrNmD[i];
        }

        
        for(int i=arrNmD.length;i<arr.length;i++)
        {
            arr[i]=arrD[i-arrNmD.length];
        }


    }
    

    public static void RotateArray2(int arr[],int d)
    {
        //Decent Aproach



      //created an array of d length to store first d numbers
        int[] arrNew=new int[d];

        for(int i=0;i<d;i++)
        {
           arrNew[i]=arr[i];
            
        }



      ////////////////////////////////////////////////////////////////////////


        for(int j=d;j<arr.length;j++)
        {
            arr[j-d]=arr[j];
        }

      //shifting all numbers by d position except first d numbers
        
        //or  (one and the same thing)

        for(int j=0;j<arr.length-d;j++)
        {
            arr[j]=arr[j+d];
        }       
        



      ////////////////////////////////////////////////////////////////////////



      //adding first d elemnts in the original array
        for(int k=0;k<d;k++)
        {
            arr[k+arr.length-d]=arrNew[k];
        }


    }


    

  
    
   

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    


	public static void reverse(int []arr)
	{
		int n=arr.length;
		
		
		int[]arr2=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			arr2[n-1-i]=arr[i];
			
			
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			arr[j]=arr2[j];
		}
		
		
	}


}
