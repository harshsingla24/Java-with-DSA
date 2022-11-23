package Milestone1.Pattern;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		if(n>=0 && n<=50) 
		{
			int i=1;
			while(i<=n)
			{
				int j=1;
				while(j<=i)
				{
				System.out.print(i);	
				j++;
				}
				System.out.println(" ");
				i++;
				
			}
		}
		
	}

}
