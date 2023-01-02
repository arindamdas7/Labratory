package array;

public class Wrapper 
{
	public static void check(int a)
	{
		System.out.println(a+" is an integer.");
	}
	public static void check(char c)
	{
		System.out.println(c+" is a character.");
	}

	public static void main(String[] args)
	{
		int a = 20;
		Integer b = Integer.valueOf(a);//converting int into integer manually
		Integer c = a;//autometic
		System.out.println(a+" "+b+" "+c);
		
		//unboxing
		Integer x = 7;
		int y = x.intValue();
		int z = x;
		System.out.println(y+" "+z);
		
		System.out.println();
	}

}
