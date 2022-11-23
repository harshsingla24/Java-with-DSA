package Milestone3.Recursion_Assignment;

public class geometricSum 
{
    public static double GeometricSum(int k) 
    {
        
        if(k==0)
        {
            return 1;
        }
        return GeometricSum(k-1)+1/Math.pow(2,k);
        
    }




    public static void main(String[] args)
    {
        System.out.println(GeometricSum(6554));
    }
}
