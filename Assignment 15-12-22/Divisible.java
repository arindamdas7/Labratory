package basic;

import java.util.Scanner;

public class Divisible
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		if(n%5==0 && n%11==0)
		{
			System.out.println("The no is divisible by 5 and 11");
		}
		else
		{
			System.out.println("The no is not divisible by 5 and 11");

		}
	}

}
