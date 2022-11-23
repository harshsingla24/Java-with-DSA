package Milestone3.OOPS1_Encapsulation;

public class DynamicArray {

	private int data[];
	private int nextElementIndex;

	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}

	public int size()

	{
		return nextElementIndex;

	}

	public boolean isEmpty() {
		return nextElementIndex == 0;
	}

	public int get(int index) {
		if (index >= nextElementIndex) {
			// Throw Error
			return -1;
		}
		return data[index];
	}

	// set,remove,add

	public void addAtLast(int ele) 
	{
		if (nextElementIndex == data.length) {
			doublecapacity();
		}
		data[nextElementIndex] = ele;
		nextElementIndex++;

	}


	public void addAndShift(int index, int ele) {
		int temp[] = data;
		data = new int[1 + temp.length];
		for (int i = 0; i < index; i++) {
			data[i] = temp[i];
		}
		data[index] = ele;
		for (int i = index; i < temp.length; i++) {
			data[i + 1] = temp[i];
		}
		nextElementIndex++;
	}

	public int removeAndShift(int index) {
		if (nextElementIndex == 0) {
			return -1;
		}

		int temp[] = data;
		data = new int[temp.length - 1];

		for (int i = 0; i < index; i++) {
			data[i] = temp[i];
		}
		for (int i = index; i < data.length; i++) {
			data[i] = temp[i + 1];
		}
		int temp1 = temp[index];
		nextElementIndex--;

		return temp1;

	}

	public int removeLast() {
		if (nextElementIndex == 0) {
			return -1;
		}
		int temp = data[nextElementIndex - 1];
		data[nextElementIndex - 1] = 0;
		nextElementIndex--;
		return temp;
	}

	public void set(int index, int ele) 
	{

		data[index] = ele;
//		nextElementIndex++;

	}
	public void increaseCapacityByOne()
	{
		int temp[]=data;
		data=new int [temp.length+1];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
		nextElementIndex++;
	}

	protected void doublecapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for (int i = 0; i < temp.length; i++)
		{
			data[i] = temp[i];
		}
	}

	public void setatIndex(int degree, int coeff) 
	{
		while(degree >= data.length) 
		{
			doublecapacity();
		}
		data[degree] = coeff;
		nextElementIndex++;
        	
	}

}
