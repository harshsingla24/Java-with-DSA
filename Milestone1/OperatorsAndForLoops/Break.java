package Milestone1.OperatorsAndForLoops;

public class Break {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		while(i<=n) {
			if(i==n) {
				break;
			}
			
			System.out.print(i);
			i++;
		}
		System.out.println(" ");

		
		
		for(int j=1;j<=5;j++) {
			if(j==4) {
				break;	
			}
			System.out.print(j);
		}
		
		System.out.println("\nBreak Keyword");
		
		
		
		
		
		
		
		
		
	}

}
