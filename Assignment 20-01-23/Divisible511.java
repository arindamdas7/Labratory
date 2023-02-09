package exceptionhandling;

import java.util.Scanner;

public class Divisible511
{
	static void numdivisible(int n)
	{
		if((n%5==0)&&(n%11==0))
		{
			System.out.println(n+" is divisible by both 5 and 11");
			
		}
		else
		{
			throw new NumDivisibleException(n+" is not divisible by both 5 and 11.");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number:");
		int num = sc.nextInt();
		try
		{
			numdivisible(num);
		}
		catch(NumDivisibleException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
