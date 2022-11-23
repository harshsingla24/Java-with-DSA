package Milestone1.Pattern;
import java.util.*;
public class Pattern12 {

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
			while(j<=i)
			
			{
				char ithChar=(char)('A'+i-1);
				System.out.print((ithChar));
				j++;
				
			}
			System.out.println(" ");
			i++;
		}
	}
	
	
	
	
	
	
	

	}

}
