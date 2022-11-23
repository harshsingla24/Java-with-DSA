package Milestone1.Pattern;
import java.util.Scanner;
public class Pattern26
{
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int i = 1;
		while(i<=n) {
			int ValueToPrint=((2*i)-1);
			int j=n;

			while(j>0) {
				System.out.print(ValueToPrint);
				ValueToPrint+=2;
				if (ValueToPrint>(2*n)+1) {
					ValueToPrint=1;
				}
				j--;
			}
			System.out.println(" ");
			i++;



		}
	}
}