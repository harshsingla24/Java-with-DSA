package Milestone3.Recursion_Assignment;

public class countZeroes
{
    public static int CountZeroes(int n)
    {
        if(n<10)
        {
            if(n==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(n%10==0)
        {
            return CountZeroes(n/10)+1;
        }
        else
        {
            return CountZeroes(n/10);
        }
       
        
        

    }
    
    public static void main(String[] args) 
    {
        System.out.println(CountZeroes(304040080));
        
    }
    
}
