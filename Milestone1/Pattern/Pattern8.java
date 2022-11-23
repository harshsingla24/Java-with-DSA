package Milestone1.Pattern;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		if(n<=50 && n>=0)
		{
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
				
				
			}
			System.out.println(" ");
			i++;
		}
		}
		
	}
	

}
