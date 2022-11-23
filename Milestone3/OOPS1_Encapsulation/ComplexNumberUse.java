package Milestone3.OOPS1_Encapsulation;

public class ComplexNumberUse 
{

	
	public static void main(String[] args) 
	{

		ComplexNumbers c1= new ComplexNumbers(2,3);
		c1.print();
		c1.setReal(4);
		c1.setImaginary(10);
		c1.print();
		System.out.println();
		
		
		

		ComplexNumbers c2= new ComplexNumbers(2,3);
		c1.add(c2);
		c1.print();
		c2.print();
		System.out.println();
		
		

		ComplexNumbers c3= new ComplexNumbers(2,3);
		c3.multiply(c2);
		c3.print();
		c2.print();
		System.out.println();
		  
		

		ComplexNumbers c4= new ComplexNumbers(c1,c2);
		c1.print();
		c2.print();
		c4.print();
		System.out.println();
		
	}

}
