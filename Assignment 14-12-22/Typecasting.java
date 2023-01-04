public class Typecasting
{
	public static void main(String[] args)
	{
		//widening(automatically)
		System.out.println("widening type casting");
		int a = 10;
		System.out.println("Integer: "+a);
		double b = a; //automatic widening: int to double
		System.out.println("Double: "+b);
		
		//narrowing(manually)
		System.out.println("narrowing type casting");
		double myDouble = 9.78d;
		System.out.println("Double: "+myDouble);
		int num = (int) myDouble;
		System.out.println("Integer: "+num);
	}
}
