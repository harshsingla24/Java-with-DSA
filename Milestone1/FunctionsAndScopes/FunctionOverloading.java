package Milestone1.FunctionsAndScopes;

public class FunctionOverloading {

	public static int sum(int a,int b) {
		return a+b;
	}

	public static double sum(double a,double b) {
		return a+b;
	}
	
	public static int sum(int a) {
		return a+1;
	}
	
	
	public static void main(String[] args) {
		int a=154;
		int b=56;
		System.out.println(sum(a,b));
		System.out.println(sum(a));
		System.out.println(sum(65.3,56.1));
	}

}
