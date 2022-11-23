package Milestone1.FunctionsAndScopes;

public class VoidFunction {
	
//	public static void printEvenNumbers() {
//		for(int i=2;i<=100;i++) {
//			System.out.println(i);
//		}
//	}
//	
//	public static void main(String[]args)
//	{
//		printEvenNumbers();
//	}

	
	
	public static void printEvenNumber(int start,int end)
	{
		if(start%2!=0)
		{
			start++;
		}
		for(int i=start;i<=end;i+=2)
		{
			System.out.
			
			 println(i);
		}
	}
	
	public static void main(String[]args)
	{
		printEvenNumber(3, 100);
	}
	
	
	
	
}
