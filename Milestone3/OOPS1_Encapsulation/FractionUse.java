package Milestone3.OOPS1_Encapsulation;

public class FractionUse 
{

	public static void main(String[] args) 
	{
		Fraction f1=new Fraction(5,6);
		System.out.print("F1:- ");
		f1.print();


		Fraction f2=new Fraction(1,4);
		System.out.print("F2:- ");
		f2.print();

			

		Fraction f3=Fraction.additon(f1, f2);
		System.out.print("Addition:- ");
		f3.simplify();
		f3.print();

		Fraction f4=Fraction.subtraction(f1, f2);
		System.out.print("Subtraction:- ");
		f4.simplify();
		f4.print();
		
		
		
		
		Fraction f5=Fraction.multiplication(f1, f2);
		System.out.print("Multiplication:- ");
		f5.simplify();
		f5.print();

		Fraction f6=Fraction.division(f1, f2);
		System.out.print("Division:- ");
		f6.simplify();
		f6.print();



 
//		f1.add(f2);
//		f1.sub(f2);
//		f1.mul(f2);
//		f1.div(f2);
//		
//	f1.print();
		
		
		//		f1.setNumerator(12);
		//		f1.getNumerator();
		//    	f1.increment();

	}

}
