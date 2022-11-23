package Milestone2.Strings;

public class reverseEachWord {

	public static String ReverseEachWord(String str)
	{
		String ans="";

		int CurrentStartWord=0;
		int i=0;
		for (;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				int CurrentEndWord=i-1;
				String reverseWord="";
				for(int j=CurrentStartWord;j<=CurrentEndWord;j++)
				{
					reverseWord=str.charAt(j)+reverseWord;
				}
				ans=ans+reverseWord+" ";
				CurrentStartWord=i+1;
			}
		}
		int CurrentEndWord=i-1;
		String reverseWord="";
		for(int j=CurrentStartWord;j<=CurrentEndWord;j++)
		{
			reverseWord=str.charAt(j)+reverseWord;
		}
		ans=ans+reverseWord+" ";




		return ans;

	}

	public static void main(String[] args) {

		String str="abc def ghi jkl mno pqr stu vwx";
		System.out.println(ReverseEachWord(str));


	}

}






