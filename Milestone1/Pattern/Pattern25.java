package Milestone1.Pattern;
import java.util.Scanner;
public class Pattern25 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		s.close();
		
		int i=1;		
		while(i<=n) 
		{
			int sum=0;
		    int j=1;
		    while(j<=i) 
		    	{
		    	sum=sum+j;
		    	System.out.print(j);
		    	if (j!=i) 
		    	{
		    		System.out.print('+');
		    	}
		    	j++;
		    	}
		    System.out.println("="+sum);
		    i++;
		}
	}

}
