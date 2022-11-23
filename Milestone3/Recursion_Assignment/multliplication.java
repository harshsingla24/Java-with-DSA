package Milestone3.Recursion_Assignment;

public class multliplication {
    public static void main(String[] args) {
        System.out.println(Multiplication(5,9));
      
    }
    public static int Multiplication(int m, int n){
        if(n==1)
        {
            return m;
        }
        if(m==0||n==0)
        {
            return 0;
        }
        

        return m+ Multiplication(m,n-1);
    }
   

    
}
