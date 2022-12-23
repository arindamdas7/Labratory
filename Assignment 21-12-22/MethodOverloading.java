package oops;

class Addition
{
	public void add(int a)
	{
		System.out.println("Addition of one parameter: "+(a+10));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("Addition of one parameter: "+(a+b+c));
	}
	public void add(double a, double b)
	{
		System.out.println("Addition of one parameter: "+(a+b));
	}
	public void add(int a, double b)
	{
		System.out.println("Addition of one parameter: "+(a+b));

	}
}

public class MethodOverloadingDemo 
{

	public static void main(String[] args)
	{
		Addition a = new Addition();
		a.add(11);
		a.add(10, 11, 12);
		a.add(35.77, 42.68);
		a.add(56, 44.89);
	}

}
