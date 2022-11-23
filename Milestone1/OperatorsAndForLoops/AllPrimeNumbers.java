package Milestone1.OperatorsAndForLoops;
import java.util.Scanner;
public class AllPrimeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();

		if(n>=1 & n<=100) {
			for(int i=2;i<=n;i++) {
				boolean isPrime=true;
				for(int j=2;j<i;j++) 
				{
					if(i%j==0) 
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					System.out.println(i);
				}
								
			}
		}










	}

}


