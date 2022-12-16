package basic;

import java.util.*;

public class StrongNumber 
{

	public static void main(String[] args) 
	{
		int num, temp, fact,rem,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		temp = num; // storing the value of num in temp variable
		while(num!=0) // checking whether the num is not equal to 0
		{
			rem=num%10;
			fact=1; //setting the value of fact as 1
			for(int i=1;i<=rem;i++)
			{
				fact = fact * i;
			}
			sum = sum+fact;
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a strong number");
		}
		else
			System.out.println(temp+" is not a strong number");
	}

}
