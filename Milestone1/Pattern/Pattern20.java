package Milestone1.Pattern;
import java.util.*;
public class Pattern20 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();

		int i=1;

		while(i<=n) 
		{
			int spaces=1;
			while(spaces<=n-i) 
			{
				System.out.print(" ");
				spaces++;
				
		     }
			int num =1;
			while(num<=i)
			{
				System.out.print(num);
				num++;
				
			}
			int decnum=i-1;
			while(decnum>=1)
			{System.out.print(decnum);
			decnum--;
			}
			
			
			System.out.println();
			i++;
		}
		
	}
	
}

	


	
		
		
		
		
		
		
