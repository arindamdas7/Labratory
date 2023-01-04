import java.util.*;
public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = sc.nextInt();
		 if (n % 2 == 0) 
		{
            System.out.println("Entered Number is Even");
		}
 
        else
		{
            System.out.println("Entered Number is Odd");
        }
	}
}
