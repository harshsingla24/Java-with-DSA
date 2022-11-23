package Milestone1.OperatorsAndForLoops;
import java.util.Scanner;
public class TermsofAP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		s.close();

		int term=0;
		for(int n=1;n<=x;n++) 
		{
			term=(3*n)+2;
			if (term%4!=0) 
			{
				System.out.print(term);
				
				if(n!=x) 
				{
					System.out.print(",");
				}
			}

			else {
				x++;
			}

		}


	}
}
