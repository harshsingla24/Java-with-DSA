package Milestone1.Pattern;
import java.util.Scanner;
public class Pattern24 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		
		int i=1;
		while(i<=n) 
		{
			int spaces=1;
			while(spaces<=i-1) 
			{
				System.out.print(" ");
				spaces++;
			}

			int j=1;
			while(j<=n)
			{
				System.out.print("*");
				j++;

			}
			System.out.println(" ");
			i++;
			
		}

	}

}
