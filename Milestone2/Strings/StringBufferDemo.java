package Milestone2.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer str= new StringBuffer("abc");
		str.setCharAt(0, 'x');
		System.out.println(str);
		str.append("def");
		System.out.println(str);


	}

}
