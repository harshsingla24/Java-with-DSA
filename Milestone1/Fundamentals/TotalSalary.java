package Milestone1.Fundamentals;
import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {
	public static void main(String[] args) {
		double totalSalary,basic,hra,da,allow,pf;

		System.out.println("Enter Your Basic Salary");
		System.out.println("&");
		System.out.println("Your Allowance Grade[A,B,C]");

		basic=0;
		Scanner s= new Scanner(System.in);
		double input=s.nextInt();



		if(input>=0 && input <=7500000) 
		{
			basic=input;

			Scanner s1=new Scanner(System.in);
			char ch =s1.next().charAt(0);

			s1.close();


			hra=(basic*20)/100;
			da=(basic*50)/100;
			pf=(basic*11)/100;



			if(ch == 65) {
				System.out.println("You Typed 'A'  as the Option" );
				allow=1700;
				totalSalary=basic+hra+da+allow-pf;
				totalSalary=Math.round(totalSalary);
				System.out.println(Math.round(totalSalary));
			}
			else if (ch == 66) {
				System.out.println("You Typed 'B'  as the Option" );
				allow=1500;
				totalSalary=basic+hra+da+allow-pf;
				totalSalary=Math.round(totalSalary);
				System.out.println(Math.round(totalSalary));
			}
			else if (ch >= 67 && ch <=90) {
				System.out.println("You Typed " +"'"+ ch +"'"+ " as the Option" );
				allow=1300;
				totalSalary=basic+hra+da+allow-pf;
				totalSalary=Math.round(totalSalary);
				System.out.println(Math.round(totalSalary));
			}
			else {
				System.out.println("You have Typed Wrong input Please choose anyone of the above Options" );
			}


		}
		else {
			System.out.println("Your Basic Salary Should be in range of 0 to 7,500,000");
		}


		s.close();
		



	}

}
