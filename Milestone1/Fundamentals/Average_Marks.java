package Milestone1.Fundamentals;
import java.util.Scanner;
public class Average_Marks {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);

		String str=s.nextLine();
		char ch=str.charAt(0);
		
		
		
		
		int m1,m2,m3,average;
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		average=(m1+m2+m3)/3;
		
		System.out.println(str);
		System.out.println(ch);
		System.out.println("Average"+" = "+average);
		s.close();
	}

}
