package Milestone3.OOPS1_Encapsulation;

class ComplexNumbers 
{
	//objects of class
	private int real,imaginary;

	
	
	
	//constructor
	public ComplexNumbers(int real ,int imaginary) 
	{
		this.real=real;
		this.imaginary=imaginary;

	}

	
	//constructor 
	public ComplexNumbers(ComplexNumbers c1 ,ComplexNumbers c2) 
	{
		this.real=c1.real+c2.real;
		this.imaginary=c1.imaginary+c2.imaginary;

	}
	
	
	//multiply function
	void multiply(ComplexNumbers c)
	{
		int tempReal=this.real*c.real-this.imaginary*c.imaginary;
		int tempImaginary=this.real*c.imaginary+this.imaginary*c.real;
		this.real=tempReal;
		this.imaginary=tempImaginary;
		
	}
	
	//addition functon
	void add(ComplexNumbers c)
	{		
		this.real=this.real+c.real;
		this.imaginary=this.imaginary+c.imaginary;
	}

	
	
	//print function
	public void print()
	{
		System.out.println(this.real+"+"+this.imaginary+"i");
	}
	
	public void setReal(int r)
	{
		this.real=r;
	}
	public void setImaginary(int i)
	{
		this.imaginary=i;
	}






}
