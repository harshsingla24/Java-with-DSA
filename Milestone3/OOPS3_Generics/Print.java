package Milestone3.OOPS3_Generics;





public class Print 
{
    
    public static <T extends printInterface> void printArray(T arr[])
    {
        
        for(int i=0;i<arr.length;i++)
        {
          arr[i].print();
          
          
           // System.out.print(arr[i]+"  ");
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        Integer arr[]=new Integer[5];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i*i+1;
        }



        String arr2[]=new String[5];

        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]="abc";
        }


        //  // printArray(arr2);


        Vehicle v []=new Vehicle[5];
        for(int i=0;i<v.length;i++)
        {
            v[i]=new Vehicle(10*i+50,"Audi");
        }
        
        printArray(v);

    }
}
