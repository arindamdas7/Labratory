package basic;

public class Factorial
{

	public static void main(String[] args)
	{
		 int count;
	      long factorial = 1;
	      System.out.println("Factorials of 1 to 10:");
	      for(count = 1; count <= 10; count++)
	      {
	         factorial *= count;
	         System.out.println("Factorial of "+count+" is "+factorial);
	      }
	}
}
