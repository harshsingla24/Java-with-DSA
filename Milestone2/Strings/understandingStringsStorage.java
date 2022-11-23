package Milestone2.Strings;

public class understandingStringsStorage {

	public static void main(String[] args) {


		//String str="abc";//String pool
		String str1="abc";//string pool 
		String str2=new String ("abc");//heap
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);

	}

}
