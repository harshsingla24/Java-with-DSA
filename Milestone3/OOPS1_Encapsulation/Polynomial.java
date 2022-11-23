package Milestone3.OOPS1_Encapsulation;

class Polynomial 
{
	DynamicArray degcoeff;

	public Polynomial() 
	{
		degcoeff =new DynamicArray();
	}

	public void setCoefficient(int degree,int coeff)
	{;
		
		degcoeff.setatIndex(degree, coeff);
		

		degcoeff.set(degree, coeff);	


	}
	public void print()
	{
		for(int i=0;i<degcoeff.size();i++)
		{
			System.out.print(degcoeff.get(i)+"x^"+i+" + ");
		}
	}



}
