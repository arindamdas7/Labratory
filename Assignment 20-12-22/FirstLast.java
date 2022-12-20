package oops;

import java.util.Scanner;

public class FirstLast 
{

	public static void main(String[] args) 
	{
		 
		int number;
		int firstDigit = 0;
		int lastDigit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		lastDigit = number%10;
		System.out.println("Last digit: "+lastDigit);
		
		while(number!=0) 
		{
			firstDigit = number%10;
		    number /= 10;
        }
		System.out.println("First digit: "+firstDigit);
	}

}
