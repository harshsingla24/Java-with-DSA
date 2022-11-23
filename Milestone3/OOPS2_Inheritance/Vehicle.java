package Milestone3.OOPS2_Inheritance;

public abstract class Vehicle 
{
	private String color;
	protected int maxSpeed;
	public Vehicle()
	{
		
	}
	public Vehicle(int maxSpeed)
	{
	System.out.println("Vehicle Constructor");
	this.maxSpeed=maxSpeed;
	}

	public String getColor() 
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}


	public void print() 
	{
		System.out.println("Vehicle "+"color "+color+" maxSpeed "+maxSpeed);
	}


	public  abstract boolean isMotorized(); 
	public  abstract String CompanyName(); 


}


