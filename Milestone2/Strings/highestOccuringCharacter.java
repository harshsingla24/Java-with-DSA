package Milestone2.Strings;

public class highestOccuringCharacter
{

	public static char HighestOccuringCharacter(String str)
	{
		
		int frequency[]=new int[256];

		int max=-1;
		char maxChar=' ';

		for(int i=0;i<frequency.length;i++)
		{
			frequency[i]=0; 
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			frequency[ch]++;

		}
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(max<frequency[ch])
			{
				max=frequency[ch];
				maxChar=ch;
			}
		}
		return maxChar;
	}

	public static void main(String[] args) 
	{

		String str= "abcdeapapqarr";
		System.out.println(HighestOccuringCharacter(str));
	}

}
