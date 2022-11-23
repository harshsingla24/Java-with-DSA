package Milestone3.OOPS1_Encapsulation;

public class Fraction 
{

	private int numerator,denominator;

	public Fraction(int numerator,int denominator) 
	{
		if(denominator==0)
		{
			//Throw Error
			denominator=1;
		}
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();

	}


	public void increment()
	{
		numerator=numerator+denominator;
		simplify();
	}


	 void simplify() {
		//greatest common divisor
		int gcd=1;
		int smaller=Math.min(numerator, denominator);
		for(int i=2;i<=smaller;i++)
		{
			if(numerator%i==0 && denominator%i==0)
			{
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;



	}


	public int getNumerator()
	{
		return numerator;
	}


	public void setNumerator(int numerator)
	{
		this.numerator=numerator;
		simplify();
	}


	public void print() 
	{
		System.out.println(numerator +"/"+ denominator);
	}

	public int getDenomirator()
	{

		return denominator;
	}


	public void setDenominator(int denominator)
	{
		if(denominator==0)
		{
			//Throw Error
			return;
		}

		this.denominator=denominator;
		simplify();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public void add(Fraction f) 
	{

		//First Fraction is the fraction on which function is called
		// Second fraction is passed as argument
		this.numerator=this.numerator*f.denominator+this.denominator*f.numerator;
		this.denominator=this.denominator*f.denominator;
		simplify();
	}

	public static  Fraction additon(Fraction f1, Fraction f2)
	{
		Fraction f=new Fraction(1,1);
		f.numerator=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
		f.denominator=f1.denominator*f2.denominator;

		return f;

	}
	
	
	
	
	
	
	
	
	public void sub(Fraction f)
	{
		this.numerator=this.numerator*f.denominator-this.denominator*f.numerator;
		this.denominator=this.denominator*f.denominator;
		simplify();
	}
	public static Fraction subtraction(Fraction f1, Fraction f2)
	{
		Fraction f=new Fraction(1,1);
		f.numerator=f1.numerator*f2.denominator-f1.denominator*f2.numerator;
		f.denominator=f1.denominator*f2.denominator;
		
		return f;
		
	}
	
	
	
	
	
	
	
	
	public void mul(Fraction f)
	{
		this.numerator=this.numerator*f.numerator;
		this.denominator=this.denominator*f.denominator;
		simplify();
	}
	public static Fraction multiplication(Fraction f1, Fraction f2)
	{
		Fraction f=new Fraction(1,1);
		f.numerator=f1.numerator*f2.numerator;
		f.denominator=f1.denominator*f2.denominator;
		return f;
		
	}

	public void div(Fraction f)
	{
		//reverse f2
		Fraction fReciprocal= new Fraction(1,1);
		fReciprocal.numerator=f.denominator;
		fReciprocal.denominator=f.numerator;
		
		//perform multiplication
		this.numerator=this.numerator*fReciprocal.numerator;
		this.denominator=this.denominator*fReciprocal.denominator;
		simplify();
	}

	public static Fraction division(Fraction f1, Fraction f2)
	{
		//reverse f2
		Fraction fReciprocal= new Fraction(1,1);
		fReciprocal.numerator=f2.denominator;
		fReciprocal.denominator=f2.numerator;
		
		//perform multiplication
		Fraction f= new Fraction(1,1);
		f.numerator=f1.numerator*fReciprocal.numerator;
		f.denominator=f1.denominator*fReciprocal.denominator;
		return f;
		
		
	}

}
