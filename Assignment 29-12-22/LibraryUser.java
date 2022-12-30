package abstractiondemo;

import java.util.Scanner;

interface LibraryUser
{
	void registerAccount();
	void requestBook();
}
class KidUser implements LibraryUser
{
	int age;
	String bookType;
	Scanner sc = new Scanner(System.in);
	@Override
	public void registerAccount()
	{
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		if(age<=12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid”");
		}
		
	}

	@Override
	public void requestBook()
	{
		System.out.println("Enter your Book Type:");
		bookType=sc.nextLine();
		if(bookType.equalsIgnoreCase("kids"))
		{
			System.out.println("Book Issued successfully please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}
	
}
class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	Scanner sc = new Scanner(System.in);
	@Override
	public void registerAccount()
	{
		System.out.println("Enter your age:");
		age = sc.nextInt();
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook() 
	{
		System.out.println("Enter your Book Type:");
		bookType=sc.nextLine();
		if(bookType.equalsIgnoreCase("fiction"))
		{
			System.out.println("Book Issued successfully please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	
}

public class LibraryInterfaceDemo 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		KidUser kid = new KidUser();
		AdultUser adult = new AdultUser();
		do
		{
			System.out.println("Welcome Midnapore Central Library");
			System.out.println("1) Kids\n2) Adults\n3) Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("1) Register Account\n2) Borrow Books\n3) Exit");
				int ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					kid.registerAccount();
					break;
				case 2:
					kid.requestBook();
					break;
				case 3:
					System.exit(0);
				}
			}
				break;
			case 2:
			{
				System.out.println("1) Register Account\n2) Borrow Books\n3) Exit");
				int c = sc.nextInt();
				switch(c)
				{
				case 1:
					adult.registerAccount();
					break;
				case 2:
					adult.requestBook();
					break;
				case 3:
					System.exit(0);
				}
			}	
				break;
			case 3:
				System.exit(0);
			}
		}while(true);
		

	}

}
