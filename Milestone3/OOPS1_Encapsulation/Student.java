package Milestone3.OOPS1_Encapsulation;

public class Student 
{

	//Proprties of Student Class

	public String name;
	final private int rollNumber;
	double cgpa;
	public final static  double CONVERSIONFACTOR=0.95;
	private static int numStudents;







	//constructor made by user //after creating it manually java abandons its own constructor

	//Constructor


	//it gives us choice to use any class as we want



	//we can pass name and roll number both
	public Student(String name)
	//Student(String s,int n)
	{
		this.name=name;

		numStudents++;
		this.rollNumber=numStudents;
	}

	public static int  getNumStudent()
	{
		return numStudents;
	}

	//	
	//	//we can pass name only
	//	public Student(String name)
	//	{
	//		this.name=name;
	//		
	//		
	//		//can't change conversionFactor as it is final
	//		//		conversionFactor=1;
	//		numStudents++;
	//
	//	}

	public Student()
	{
		this.name="";

		numStudents++;
		this.rollNumber=numStudents;
	}






	public void print()
	{
		System.out.println(name+" "+rollNumber);
	}

	//
	//
	//	//getters
	//	public int getRollNumber()
	//	{
	//		return rollNumber;
	//	}
	//
	//	//setters
	//	public void setRollNumber(int rollNumber)
	//	{
	//		if(rollNumber<=0)
	//		{
	//			return;
	//		}
	//		this.rollNumber=rollNumber;
	//
	//	}




}
