package Milestone1.Fundamentals;

public class TypeConversion1 {
	public static void main(String[] args) {
		
		short s=17;	
		int i=s;
		System.out.println(i);
		
/*		s=i;       not allowed int is 4 bytes and short is 2 bytes
		
*/	    
		
		s=(short)i;
		System.out.println(s);
		
		int i1=(int)10.6;
		System.out.println(i1);
		
		
		float f = 1.7f;
		
		//or
	//float f =(float)1.7;
		 System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
