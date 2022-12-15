package basic;

import java.util.Scanner;

public class AlpaDigit
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Enter a character: ");
		c  = sc.next().charAt(0);
		if ((c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
			System.out.println("The character is an alphabet");
		}
		else if(c>= '0' && c<= '9')
		{
			System.out.println("The characte is a digit");
		}
		else
		{
			System.out.println("The characte is a special character");
		}
	}

}
