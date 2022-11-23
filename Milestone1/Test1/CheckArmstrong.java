package Milestone1.Test1;
import java.util.Scanner;

public class CheckArmstrong 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int numb,rem,ans=0;
		int num=String.valueOf(n).length();
		numb=n;
		while(numb>0)
		{
			rem=numb%10;
			ans+=(int)(Math.pow(rem,num));
			numb=numb/10;
		}
		if(ans==n)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}





	}

}
