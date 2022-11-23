package Milestone1.OperatorsAndForLoops;

import java.util.Scanner;

public class BinaryTodecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		if(n>=0 &n<=1111111111) {
			int ans=0;
			for(int i=1;n>0;i*=2)
			{
				ans=(ans+((n%10)*i));
				n=n/10;
			}
			System.out.println(ans);

		}

	}
}
