package Milestone1.OperatorsAndForLoops;

public class BitwiseOperator {

	public static void main(String[] args) {

		int a=10;
		int b=2;
		int z=42;

		//		int c=a  & b;
		//		int c=a|b;

		System.out.println(a&b);    //  And
		System.out.println(a|b);    //  Or
		System.out.println(a^b);    //  X-OR
		System.out.println(~a);     //  Not 
		System.out.println(~z);     //  Not
		System.out.println(a<<1);   //  Left Shift
		System.out.println(a<<3);   //  Left Shift
        System.out.println(a>>1);   //  Right Shift
        System.out.println(a>>2);   //  Right Shift
		
		
		
        System.out.println(" ");
		System.out.println(Integer.toBinaryString(-20));
		System.out.println(Integer.toBinaryString(10));		
		System.out.println(Integer.toBinaryString(-20^10));
	}
}

//		
//		0000 1010   (10)
//		
//		0001 0100   (20)
//		
//		1110 1011   (1's Complement)
//			   +1   
//	    1110 1100  (2's Complement)(-20)
//		    
//		    
//		
//		
//		
//		
//		
//		0000 1010    (10)
//		1110 1100    (-20)
//		Xor
//		
//		1110 0110  ans 
//		
//		0001 1001  (1's Complement)
//		       +1
//		0001 1010  (2's Complement)
//		
//
//        26 		
//		
//		
//		
//	 