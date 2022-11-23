package Milestone2.Strings;

public class moreFunctionsOnString 
{
	
	public static void main(String []args)
	{
	
		
		// Concatination Function
		
		
		String str1="Coding";
		String str2=" is fun";
		System.out.println(str1+str2);
		str1+=str2;
		System.out.println(str1);
		//or
		str1=str1.concat(str2);

		System.out.println("    ");
		System.out.println("    ");
		
		
		
		
		
		// Comparison Function
		System.out.println(str1.equals(str2));
	
		System.out.println("    ");
		System.out.println("    ");
		
		
		
		
		
		//CompareTo Function
		String str3="Coding";
		String str4="Coding";
		String str5="Aoding";
		String str6="Eoding";
		 
		
		
		System.out.println(str3.compareTo(str4));
		System.out.println(str3.compareTo(str5));
		System.out.println(str3.compareTo(str6));
		
		

		System.out.println("    ");
		System.out.println("    ");

		
		
		
		
		//Contains Function
		
		System.out.println(str3.contains("ing"));
		
		System.out.println("    ");
		System.out.println("    ");

		
		
		
		
		//Substring Function
		System.out.println(str3.substring(0));
		System.out.println(str3.substring(2));
		System.out.println(str3.substring(4));
		System.out.println(str3.substring(1,5));
		
		
	}
	
	
	
	
	
}
