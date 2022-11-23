package Try;

public class test
{
    public static int firstRepeated(int[] arr, int n) 
    {
        // Your code here
        int ans=0;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(arr[i]==arr[j])
                {
                    ans=i;
                    break;
                }                
                else
                {
                   ans=-1; 
                }
            }
        }
        return ans;
    }




    public static int firstRepeated2(int[] arr, int n) {
       
        // Your code here
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    
                    if(arr[i]==arr[j])
                    {
                        ans=i+1;
                        i=100;j=100;
                        break;
                    }                
                    else
                    {
                       ans=-1; 
                       i=100;j=100;
                       break;
                    }
                }
            }
            
        }
        return ans;
    }


    
}
