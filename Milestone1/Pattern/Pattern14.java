package Milestone1.Pattern;
import java.util.*;
public class Pattern14 {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		if(n>=0 && n<=13) {
			int i=1;
			while(i<=n) {
				char p=(char)('A'+i-1);
				int j=1;
				while(j<=i) {
					System.out.print(p);
					j++;
					p=(char)(p+1);
					
				}
				System.out.println(" ");
				i++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
