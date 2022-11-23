package Milestone1.FunctionsAndScopes;
import java.util.Scanner;

public class CheckPrime {

	public static boolean checkPrime(int n) {
		int div=2;

	//	boolean isPrime=true;

		while(div <= n-1) {
			if(n%div==0) {
				return false;
			}

			div=div+1;			
		}
		return true;


	}


	public static void main(String[] args) {

		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		s.close();
		boolean isPrime= checkPrime(n);
		System.out.println(isPrime);

	}

}
