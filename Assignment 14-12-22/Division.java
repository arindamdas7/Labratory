import java.util.*;
public class Division
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float a,b;
		float result;
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		if(a>b)
		{
			result = a/b;
			System.out.println("Result is: "+result);
		}
		else
		{
			result = b/a;
			System.out.println("Result is: "+result);
		}
	}
}
