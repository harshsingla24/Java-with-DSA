package Milestone1.Fundamentals;

public class RelationalLogicalOperator {
	public static void main(String[]args) {
		
		//Realtional Operators
		System.out.println("Relational Operator");
		int a=10 ,b=10;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println (a>=b);
		
//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,


		System.out.println("      ");
		System.out.println("      ");
		System.out.println("      ");

//		Logical Operators
		System.out.println("Logical Operators");
/*		AND (&&) 
             
         A B   OUTPUT
         0 0   0
         0 1   0
         1 0   0
         1 1   1
         
         
		OR  (||)
		
         A B   OUTPUT
         0 0   0
         0 1   1
         1 0   1
         1 1   1
          
			
		
		NOT (!)
		
         A B   OUTPUT
         0 0   0
         0 1   0
         1 0   0
         1 1   1
         
         
*/		
		
	System.out.println(true && false);
	System.out.println(false || true);
		
	System.out.println("      ");
	
	
	System.out.println(a>10 && b>10);	
	System.out.println(a>10 || b>10);	
		
	System.out.println("      ");
		

	System.out.println(a>=10 && b>10);	
	System.out.println(a>=10 || b>10);	
		
	System.out.println("      ");
	
	System.out.println(!true);
	System.out.println(!false);
		
	
	System.out.println("      ");
	
		
	System.out.println(!(a>b));	
		
		
		
	}
 
}
