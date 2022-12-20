package basic;

import java.util.*;

public class Transaction 
{
	public static int deposite(int a, int b)
	{
		int result = a+b;
		return result;
	}
	public static int withdraw(int a, int b)
	{
		int result=0;
		if(a>b)
		{
			result = a-b;
			System.out.println("New balance: "+result);
		}
		else
		{
			System.out.println("Can't proceed your request");
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int choice,num1,num2,res;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Which operation do you want to perform:");
			System.out.println("1) Deposite:");
			System.out.println("2) Withdraw:");
			System.out.println("3) Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Your current balance:");
				num1 = sc.nextInt();
				System.out.println("Enter the amount you want to deposite:");
				num2 = sc.nextInt();
				res = Transaction.deposite(num1, num2);
				System.out.println("Now available balance is: "+res);
				break;
			case 2:
				System.out.println("Enter Your current balance:");
				num1 = sc.nextInt();
				System.out.println("Enter the amount you want to withdraw:");
				num2 = sc.nextInt();
				res = Transaction.withdraw(num1, num2);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Enter a valid input");
			}
		}while(choice!=3);
	}

}
