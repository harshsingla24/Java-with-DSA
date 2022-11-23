package Milestone1.OperatorsAndForLoops;
import java.util.Scanner;
public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		if(n>=0 && n<=100000000){

			int rev=0;
			while(n>0) {
				rev=(rev*10)+(n%10);
				n=n/10;


			}

			System.out.println(rev);
		}









	}

}
