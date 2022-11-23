package Milestone3.OOPS1_Encapsulation;

class Poly1
{
	DynamicArray coefficients;

	public Poly1() 
	{
		coefficients=new DynamicArray();	
	}

	public void setCoefficient(int degree,int coeff)
	{
		coefficients.set(degree, coeff);
		if(degree>=coefficients.size())
		{
			coefficients.doublecapacity();
		}
		
	}

	public void print() 
	{
		
		for(int i=0;i<coefficients.size();i++)
		{
			System.out.println(coefficients.get(i)+"x^"+i);
			System.out.print("+");
		}
		System.out.println();
	}







}
