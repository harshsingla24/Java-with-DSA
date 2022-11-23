package Milestone3.OOPS2_Inheritance_temp;

import Milestone3.OOPS2_Inheritance.Vehicle;

public abstract class Truck extends Vehicle
{  
	public Truck(int maxSpeed) 
	{
		super(maxSpeed);
	
		
	}

	int maxLoadingCapacity;

	public void print() 
	{
		System.out.println("Vehicle "+"color "+getColor()+" maxSpeed "+ maxSpeed+"maxLoadingCapacity"+maxLoadingCapacity);
	}

	@Override
	public boolean isMotorized() {
		
		return true;
	}
}
