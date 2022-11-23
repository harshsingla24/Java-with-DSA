package Milestone1.Pattern;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();

		int i=1;
        int p=1;
		while(i<=n) 
		{
			p=i;
			int j=1;
			while(j<=i) {
				System.out.print(p+"  ");
				p++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
