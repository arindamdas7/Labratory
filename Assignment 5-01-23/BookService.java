package bookmanagementsystem;

import java.util.Scanner;

public class BookService
{
	static Book book[] = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int index=0;
	
	//create book method
	public static void createBook()
	{
		System.out.println("Enter Book ID:");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Book Name:");
		String bname = sc.nextLine();
		
		//sc.nextLine();
		System.out.println("Enter Author's Name:");
		String author = sc.nextLine();
		
		System.out.println("Enter Book Price:");
		double price = sc.nextDouble();
		
		book[index] = new Book(id, bname, author, price);
		index++;
		System.out.println("Book details added!");
	}
	
	//get all book details
	public static void getAllBookDtails()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Book ID: "+book[i].getBookId());
			System.out.println("Book Name: "+book[i].getBookname());
			System.out.println("Book Author Name: "+book[i].getAuthor());
			System.out.println("Book Price: "+book[i].getBookPrice());
		}
	}
	
	//get book details using id
	public static void getBookDetailsUsingId()
	{
		boolean flag = false;
		System.out.println("Enter Book ID to search: ");
		int id = sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(id==book[i].getBookId())
			{
				System.out.println("Book ID: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookname());
				System.out.println("Book Author Name: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getBookPrice());
				flag=true;
				break;
			}
			else
			{
				
				if(flag==false)
				{
					 System.out.println("Book Not Found!!"); 
				}
				
			}
		}
	}
	
	//get book details using book name
	public static void getBookDetailsUsingBookName()
	{
		boolean flag = false;
		sc.nextLine();
		System.out.println("Enter Book Name to search: ");
		String bookname = sc.nextLine();
		for(int i=0;i<index;i++)
		{
			if(bookname.equalsIgnoreCase(book[i].getBookname()))
			{
				System.out.println("Book ID: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookname());
				System.out.println("Book Author Name: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getBookPrice());
				flag=true;
				break;
			}
			
		}
			if(flag==false)
			{
				 System.out.println("Book Not Found!!"); 
			}
		
	}
	
	//get book details using author name
	public static void getBookDetailsUsingAuthorName()
	{
		boolean flag = false;
		sc.nextLine();
		System.out.println("Enter Author Name to search: ");
		String authorname = sc.nextLine();
		for(int i=0;i<index;i++)
		{
			if(authorname.equalsIgnoreCase(book[i].getAuthor()))
			{
				System.out.println("Book ID: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookname());
				System.out.println("Book Author Name: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getBookPrice());
				flag=true;
				break;
			}
			
		}
			if(flag==false)
			{
				 System.out.println("Book Not Found!!"); 
			}
		
	}
	
}
