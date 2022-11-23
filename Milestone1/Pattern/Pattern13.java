package Milestone1.Pattern;
import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();

			if (n>=0 && n<=26) 
			{
				int i=1;
				while(i<=n)
				{
					char p=(char)('A'+i-1);
					int j=1;
					while(j<=n)

					{

						System.out.print((p));
						p=(char)(p+1);
						j++;

					}
					System.out.println(" ");
					i++;
				}
			}
		}








	}

}
