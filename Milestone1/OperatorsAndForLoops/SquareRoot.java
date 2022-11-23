package Milestone1.OperatorsAndForLoops;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int out=0;
		for(;out*out<=n;out++) {
			out++;

		}
		out--;
		System.out.println(out);

	}
}
