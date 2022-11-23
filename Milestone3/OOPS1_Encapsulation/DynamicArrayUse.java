package Milestone3.OOPS1_Encapsulation;

public class DynamicArrayUse 
{



	public static void main(String[] args) 
	{
		//All Seprate Functions to check functions at backend
		dynamicArrayAllFunctions();
		System.out.println("\n\n\n\n\n"+"Testing Add Function\n");
		testingAddAndShiftFunction();
		System.out.println("\n\n\n\n\n"+"Testing Remove Function\n");
		testRemoveFunction();
		
	}
	
	



public static void dynamicArrayAllFunctions()
{

	DynamicArray d=new DynamicArray();
	for (int i=0;i<99;i++)
	{
		d.addAtLast(1000 + i);
	}
	System.out.print("Size of Array:- ");
	System.out.println(d.size());
	System.out.println(d.get(98));
	d.set(3, 170);
	System.out.println(d.get(3));
	System.out.println();
	System.out.println();

	while(!d.isEmpty())
	{
		System.out.println("Value- "+d.removeLast());
		System.out.println("Size of array - "+d.size());
		System.out.println();
	}
}



	public static  void testingAddAndShiftFunction() 
	{

		//Testing of addAndShift Function with index and element


		DynamicArray d=new DynamicArray();  
		System.out.print("Size of Array:- ");
		System.out.println(d.size());
		for (int i=0;i<5;i++)
		{
			d.addAtLast(i*i);
		}
		System.out.print("Size of Array:- ");
		System.out.println(d.size());
		System.out.println();

		for(int i=0;i<d.size();i++)
		{
			System.out.print(d.get(i)+" ");
		}

		d.addAndShift(2, 30);
		System.out.println();
		for(int i=0;i<d.size();i++)
		{
			System.out.print(d.get(i)+" ");
		}

	}


public static void testRemoveFunction()
{

	DynamicArray d=new DynamicArray();  
	System.out.print("Size of Array:- ");
	System.out.println(d.size());
	for (int i=0;i<5;i++)
	{
		d.addAtLast(i*i);
	}
	System.out.print("Size of Array:- ");
	System.out.println(d.size());
	System.out.println();

	for(int i=0;i<d.size();i++)
	{
		System.out.print(d.get(i)+" ");
	}
	d.removeAndShift(1);
	System.out.println();
	for(int i=0;i<d.size();i++)
	{
		System.out.print(d.get(i)+" ");
	}


}








}
