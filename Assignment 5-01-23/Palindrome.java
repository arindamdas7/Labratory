package array;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s , reverseStr = "" ;
		System.out.println("Enter the string: ");
		s=sc.nextLine();
		int strLength = s.length();
		for(int i=strLength-1;i>=0;i--)
		{
			reverseStr = reverseStr + s.charAt(i);
		}
			if(s.equals(reverseStr))
			{
				System.out.println("It is a palindrome");
			}
			else
			{
				System.out.println("It is not a palindrome");
			}
		
		

	}

}
