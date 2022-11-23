package Milestone1.Pattern;
import java.util.*;
public class Pattern23 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		
		int n1=(n+1)/2;
		int n2=n1-1;
	
	    int i=1;
	    while(i<=n1) 
	    {
	    	int spaces=1;
	    	while(spaces<=n1-i) {
	    		System.out.print(" ");
	    		spaces++;
	    		
	    	}
	    	
	    //	int star=i;
	    	int j=1;
	    	while(j<=(2*i)-1) {
	    		System.out.print('*');
	    		j++;
	   // 		star++;
	    	}
	    	
	    	
	    	System.out.println(" ");
	    	i++;
	    	
	    	}
	    
	    
	    
	    
	    int i1=n2;
	    while(i1>=1) 
	    {
	    	int spaces=1;
	    	while(spaces<=n2-i1+1) {
	    		System.out.print(" ");
	    		spaces++;
	    		
	    	}
	    	
	    ///	int star=i1;
	    	int j=1;
	    	while(j<=(2*i1)-1) {
	    		System.out.print('*');
	    		j++;
	    ///		star++;
	    	}
	    	
	    	
	    	System.out.println(" ");
	    	i1--;
	    	
	    	
	    	}
	    	
	    	
	    	
	    }
	}
