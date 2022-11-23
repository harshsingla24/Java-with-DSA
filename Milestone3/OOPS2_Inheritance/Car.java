package Milestone3.OOPS2_Inheritance;

public abstract class Car extends Vehicle
{
	int numDoors;
	//int maxSpeed;

	public Car(int numDoors,int maxSpeed)
	{
		super(100); //super();
		System.out.println("Cars Constructor");	
		this.numDoors=numDoors;
	}

	
	
	public Car() {
	}

	public void print()
	{
		super.print();
		System.out.println("Car "+" numDoors "+numDoors);	
	}
	public void printMaxSpeed() {
		System.out.println(maxSpeed+" "+super.maxSpeed);
	}



	@Override
	public boolean isMotorized() 
	{
		return true;
	}


}
