 package Milestone2.Strings;

public class AllSubstrings {

	public static void SubString(String str)
	{
		int n=str.length();
		for (int i =0;i<n;++i)
		{
			for(int j=i;j<n;++j)
			{
				for(int k=i;k<=j;++k)
				{
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}

	public static void SubString1(String str)
	{
		for(int start=0;start<str.length();start++)
		{
			for(int end=start;end<str.length();end++)
			{
				System.out.println(str.substring(start,end+1));
			}
		}
	}

	public static void SubString2(String str)
	{
		for(int len=1;len<=str.length();len++)
		{
			for(int start=0;start<=str.length()-len;start++)
			{
				int end=start+len-1;
				System.out.println(str.substring(start,end));
			}
		}
	}

	public static void main(String[] args) {


		String str=new String("pqrst");

		SubString2(str);


	}

}
