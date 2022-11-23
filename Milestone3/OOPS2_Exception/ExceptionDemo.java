package Milestone3.OOPS2_Exception;

public class ExceptionDemo 
{

	public static int  divide (int a,int b) throws DivideByZeroException
	{
		if(b==0)
		{
			//throw new ArithmeticException();
			throw new DivideByZeroException();
		}
		return a/b;
	}
	
	
	public static int fact(int n) throws NegativeNumberException
	{
		if(n<0)
		{
			throw  new NegativeNumberException();
		}
		int ans=1;
		for(int i=2;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	 
	
	public static void main(String[] args) {
		//String s= null;
		//System.out.println(s.length());
//		System.out.println(4/0);
//		System.out.println("Main");
		try 
		{
			System.out.println(divide(50, 10));
			System.out.println("within try");
			System.out.println(fact(-5));
		}
		catch (DivideByZeroException e)
		{
			System.out.println("Divide by Zero Exception Raised");
			e.printStackTrace();
		}
		catch (NegativeNumberException e) {
			System.out.println("Negative Number Exception");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("Main");
	}

}