package Milestone1.Fundamentals;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		
		int n;
	    Scanner s =new Scanner(System.in);
	    n=s.nextInt();
	    s.close();
	    int i=1;  // number which is to be added
	    int sum=0;
	    
	    while(i<=n)
	    {
	    	sum=sum+i;
	    	i++;
	    }
	    
	    System.out.println(sum);
	    
		
		
		
	}

}
