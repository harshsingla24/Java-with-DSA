package Milestone1.Pattern;
import java.util.*;
public class Pattern11 {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int n=s.nextInt();
	s.close();
	if (n>=0 && n<=26) 
	{
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				char jthChar=(char)('A'+j-1);
				System.out.print((jthChar));
				j++;
				
			}
			System.out.println(" ");
			i++;
		}
	}
	
	
	
	
	
	
	

	}

}
