package basic;

import java.util.Scanner;

public class Calculator 
{
	public static int addition(int a, int b)
	{
		int result = a+b;
		return result;
	}
	public static int subtraction(int a, int b)
	{
		int c;
		if(a>b)
		{
			c = a-b;
		}
		else
		{
			c = b-a;
		}
		return c;
	}
	public static int multiplication(int a, int b)
	{
		int result = a*b;
		return result;
	}
	public static float division(float a, float b)
	{
		float result = a/b;
		return result;
	}
	public static void main(String[] args) 
	{
		int choice,num1,num2;
		float num3,num4,res;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Which operation do you want to perform:");
		System.out.println("1) Addition:");
		System.out.println("2) Subtraction:");
		System.out.println("3) Multiplication:");
		System.out.println("4) Division:");
		System.out.println("5) Exit");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter first digit:");
			num1 = sc.nextInt();
			System.out.println("Enter second digit:");
			num2 = sc.nextInt();
			res = Calculator.addition(num1, num2);
			System.out.println(num1+"+"+num2+" = "+res);
			break;
		case 2:
			System.out.println("Enter first digit:");
			num1 = sc.nextInt();
			System.out.println("Enter second digit:");
			num2 = sc.nextInt();
			res = Calculator.subtraction(num1, num2);
			System.out.println("Subtraction is: "+res);
			break;
		case 3:
			System.out.println("Enter first digit:");
			num1 = sc.nextInt();
			System.out.println("Enter second digit:");
			num2 = sc.nextInt();
			res = Calculator.multiplication(num1, num2);
			System.out.println(num1+"*"+num2+" = "+res);
			break;
		case 4:
			System.out.println("Enter first digit:");
			num3 = sc.nextFloat();
			System.out.println("Enter second digit:");
			num4 = sc.nextFloat();
			res = Calculator.division(num3, num4);
			System.out.println(num3+"/"+num4+" = "+res);
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Enter a valid input");
			}
		}while(choice!=5);
		
	}

}
