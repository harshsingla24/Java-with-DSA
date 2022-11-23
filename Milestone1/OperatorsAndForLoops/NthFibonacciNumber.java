package Milestone1.OperatorsAndForLoops;
import java.util.Scanner;
public class NthFibonacciNumber {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int a=1;
		int b=1;
		
		
		for (int i=1; i<=n; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(a);

			
		}
		
	}

}
