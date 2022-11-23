package Milestone3.OOPS1_Encapsulation;

public class Poly 
{

	DynamicArray coefficients;

	public Poly() 
	{
		coefficients=new DynamicArray();
	}






	public void setCoefficient(int degree,int coeff)
	{
		if(degree>=coefficients.size())
		{
			for(int i=coefficients.size();i<degree;i++)
			{
				coefficients.set(i, 0);
			}

		}
		else 
		{
			coefficients.set(degree, coeff);
		}
	}
	public int degree()
	{
		return coefficients.size();
	}

	public void print()
	{


		for(int i=0;i<coefficients.size();i++)
		{
			if(coefficients.get(i)!=0) 
			{
			//	System.out.println("This is I :"+i+" ");
				System.out.print(coefficients.get(i)+"x^"+i);

				while(i<coefficients.size()-1)
				{
					System.out.print(" + ");	
				}
			}
			
		}
		System.out.println();
	}












}
