package Milestone1.Fundamentals;
import java.util.Scanner;
public class Factors {
	public static void main(String[]args) 
	{
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int i=2;
		s.close();
		while(i<=n/2) 
		{
			if(n%i==0) 
			{
				System.out.println(i+" ");
			}
			i++;
		}
	}

}
