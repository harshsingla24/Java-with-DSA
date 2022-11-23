package Milestone1.Pattern;
import java.util.*;
public class Pattern15 {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		s.close();

		if(n>=0 && n<=26) {
			int i=1;
			while(i<=n) {
				char p='A';
				int j=1;
				while(j<=i) {
					System.out.print((char)(p+n-i));
					j++;
					p=(char)(p+1);
					
				}
				System.out.println(" ");
				i++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
