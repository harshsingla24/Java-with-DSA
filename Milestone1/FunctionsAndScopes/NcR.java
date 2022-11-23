package Milestone1.FunctionsAndScopes;
import java.util.Scanner;
public class NcR {
	public static int factorial(int num) {
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n=s.nextInt();
			int r=s.nextInt();
			
			
			int factN=factorial(n);
			int factR=factorial(r);
			int factNR=factorial(n-r);
			
//			
//			int factN=1;
//			for(int i=n;i>=1;i--)
//			{
//				factN*=i;
//			}
//
//			int factR=1;
//			for(int i=r;i>=1;i--)
//			{
//				factR*=i;
//			}
//			
//						
//			int factNR=1;
//			for(int i=n-r;i>=1;i--)
//			{
//				factNR*=i;
//			}
//			
			int result=factN/(factR*factNR);
			System.out.println(result);
			s.close();
					
			
	}

}
