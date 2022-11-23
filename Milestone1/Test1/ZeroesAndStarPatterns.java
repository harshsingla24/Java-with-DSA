package Milestone1.Test1;
import java.util.*;
public class ZeroesAndStarPatterns {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); int a = (n*2)+1;
		s.close();
		int i = 1; int start = 1, mid=(a/2)+1, end = a ;
		while(i<=n){
			int j = 1; int p = a ;
			while(j<=p) {
				if(j==start || j==mid || j==end) {
					System.out.print('*');
				} else System.out.print('0');
				j++; }
			i++ ; start++; end--;
			System.out.println();





		}

	}

}
