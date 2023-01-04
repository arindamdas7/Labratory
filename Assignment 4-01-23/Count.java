package array;

import java.util.Scanner;

public class Count 
{

	public static int countOccurrance(String str)
	{
		int count = 0;
		char c;
		for(int i=0;i<str.length();i++)
		{
			c = str.charAt(0);
			if(str.charAt(i) == c)
			{
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine().toLowerCase();
		System.out.println("Enter which occurrance to find:");
		char c = sc.next().charAt(0);
		System.out.println("The no. of occrrence"+c+ "in "+str+" is:"+countOccurrance(str));
	}
		

}
