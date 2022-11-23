package Milestone1.Fundamentals;

public class TypeConversion {

	public static void main(String[] args) {
		
		char ch='a';
		int i=ch;
		System.out.println(i);
	
		
/*		ch=i;      not allowed because
		           integer is of 4 bytes 
		           and character is of 2
		           bytes so 4 bytes can't 
		           be stored in 2 bytes space
 */
		
		
		ch=(char)i;
		System.out.println(ch);
		
		
		
		
/*		ch=ch+1       not allowed as ch+1 result
                      should be in integer with 
                      4 bytes but char is of 2 bytes
 */
		
		ch=(char)(ch+1);   //
		System.out.println(ch);
		
	}
    

}
