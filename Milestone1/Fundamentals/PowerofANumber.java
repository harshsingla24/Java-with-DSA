package Milestone1.Fundamentals;

import java.util.Scanner;

public class PowerofANumber {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		
		int x,n,ans;
		x=s.nextInt();
		n=s.nextInt();
		ans=1;
		s.close();
		while(n>0) {
			ans=ans*x;
			n--;
		}
		System.out.println(ans);
		
		
	}

}
