package Milestone1.Fundamentals;
import java.util.Scanner;
public class FahrenheitToCelcius {

	public static void main(String[] args) {
	
		int S,E,W, temp;
		Scanner s = new Scanner(System.in);
		
		S=s.nextInt();
		E=s.nextInt();
		W=s.nextInt();
		
		s.close();
		while(S<=E) 
		{temp=((S-32)*5)/9;
		System.out.println("    ");
		System.out.println(S);
		
		System.out.println(temp);
		System.out.println("    ");
		System.out.println("    ");
		S=S+W;}
			
		}
		
	}


