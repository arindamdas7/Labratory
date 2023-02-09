package exceptionhandling;

import java.util.Scanner;

public class AgeException 
{

	static void ageEligibility(int age) throws AgeIsNotEligibleException
	{
		if(age>=18)
		{
			System.out.println(age+" You are eligible");
			
		}
		else
		{
			throw new AgeIsNotEligibleException(age+" You are not eligible!!");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age1 = sc.nextInt();
		try
		{
			ageEligibility(age1);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
