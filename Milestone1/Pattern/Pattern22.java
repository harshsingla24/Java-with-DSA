package Milestone1.Pattern;
import java.util.*;
public class Pattern22 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
	
	    int i=1;
	    while(i<=n) 
	    {
	    	int spaces=1;
	    	while(spaces<=n-i) {
	    		System.out.print(" ");
	    		spaces++;
	    		
	    	}
	    	
	    	int increasingnumber=i;
	    	int j=1;
	    	while(j<=i) {
	    		System.out.print(increasingnumber);
	    		j++;
	    		increasingnumber++;
	    	}
	    	int decreasingnumber=increasingnumber-2;
	    	int k=1;
	    	while(k<=i-1) {
	    		System.out.print(decreasingnumber);
	    		decreasingnumber--;
	    		k++;
	    	}
	    	
	    	System.out.println(" ");
	    	i++;
	    	
	    	
	    	
	    }
	}
}