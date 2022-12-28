package abstractiondemo;

import java.util.Scanner;

abstract class Vaccine
{
	Scanner sc = new Scanner(System.in);
	String citizen, name;
	int age, price;
	public void firstDose()
	{
		//sc.nextLine();
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your citizenship:");
		citizen=sc.nextLine();
		if(citizen.equalsIgnoreCase("Indian"))
		{
			System.out.println("Enter your age:");
			age=sc.nextInt();
			if(age>=18)
			{
				System.out.println("Enter the price:");
				price = sc.nextInt();
				if(price==250)
				{
					System.out.println("First dose vaccinated done successfully");
				}
				else
				{
					System.out.println("The amount should be paid");
				}
			}
			else
			{
				System.out.println("Age must be above 18 years.");
			}
		}
		else
		{
			System.out.println("Vaccination is only for Indian Citizenship.");
		}
	}
	public void secondDose()
	{
		System.out.println("Have you received your first dose? y/n");
		char c = sc.next().charAt(0);
		if(c=='y'||c=='Y')
		{
			System.out.println("Has it been two months since your 1st vaccine? y/n");
			c = sc.next().charAt(0);
			if(c=='y'||c=='Y')
			{
				System.out.println("Enter the price:");
				price = sc.nextInt();
				if(price==250)
				{
					System.out.println("Second dose vaccinated done successfully");
				}
			}
			else
			{
				System.out.println("Please come after the completion of 2 months.");
			}
		}
		else
		{
			System.out.println("Please receive the first dose and come again!!");
		}
	}
	abstract public void booster();
}
class VaccinationSuccess extends Vaccine
{

	@Override
	public void booster() 
	{
		System.out.println("Have you received your second dose? y/n");
		char c = sc.next().charAt(0);
		if(c=='y'||c=='Y')
		{
			System.out.println("Has it been two months since your 2nd vaccine? y/n");
			c = sc.next().charAt(0);
			if(c=='y'||c=='Y')
			{
				System.out.println("Enter the price:");
				price = sc.nextInt();
				if(price==250)
				{
					System.out.println("Booster dose vaccinated done successfully");
				}
			}
			else
			{
				System.out.println("Please come after the completion of 2 months.");
			}
		}
		else
		{
			System.out.println("Please receive the second dose and come again!!");
		}
	}
	
}

public class Vaccination 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		VaccinationSuccess var = new VaccinationSuccess();
		do
		{
			System.out.println("Welcome to COVID-19 Vaccination Centre");
			System.out.println("1) First Dose\n2) Second Dose\n3) Booster\n4) Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				var.firstDose();
				System.out.println();
				break;
			case 2:
				var.secondDose();
				System.out.println();
				break;
			case 3:
				var.booster();
				System.out.println();
				break;
			case 4:
				System.exit(0);
			}
		}while(true);
	}

}
