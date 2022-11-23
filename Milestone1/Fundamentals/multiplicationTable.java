package Milestone1.Fundamentals;
import java.util.Scanner;
public class multiplicationTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i,n,z;
		n=s.nextInt();
		i=1;
		s.close();
		if (n>=0 && n<=10000) {
			while(i<11) {
				z=n*i;
				i++;
				System.out.println(z);
			}
		}
		else {
			System.out.println("Please Enter any Integer between 0 and 10000");
		}
	}
}