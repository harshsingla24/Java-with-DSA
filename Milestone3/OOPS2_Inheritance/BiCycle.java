package Milestone3.OOPS2_Inheritance;

public abstract class  BiCycle extends Vehicle
{
	public BiCycle() 
	{
		
		

		
	}

	public BiCycle(int maxSpeed) 
	{
		super(maxSpeed);

		
	}

	@Override
	public boolean isMotorized() 
	{
		return false;
	}
	
	
}
