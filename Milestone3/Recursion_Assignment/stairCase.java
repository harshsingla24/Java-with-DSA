package Milestone3.Recursion_Assignment;

import java.util.Scanner;

public class stairCase {

    public static int StairCase(int n) {
        if (n < 0) {
            return 0;

        }
        if (n == 0)
            return 1;
        return StairCase(n - 1) + StairCase(n - 2) + StairCase(n - 3);

    }

    
    public static int staircase(int n){
        if (n == 1 || n == 0)
              return 1;
          else if (n == 2)
              return 2;
   
          else
              return  staircase(n - 3) +  staircase(n - 2)
                  +  staircase(n - 1);
      
  
      }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(StairCase(n));

    }

}
