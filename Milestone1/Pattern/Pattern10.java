package Milestone1.Pattern;
import java.util.Scanner;
public class Pattern10 {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		s.close();
		int n=s.nextInt();
		if(n>=0 && n<=50) {
			int i=1;
			while(i<=n) {
				int j=1;
				int p=1;
				p=i;
				while(j<=i) {
					
					System.out.print(p);
					p--;
					j++;
					}
				System.out.println(" ");
				i++;
			}
		}
	}

}
