package oops;

import java.util.*;
class Book
{
	int bookId;
	String bookName, authorName;
	double bookPrice;
	public static String libraryName = "Kolkata National Library";
	String availability;
	
	public void createBook(int bookId, String bookName, String authorName, double bookPrice, String availability)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookPrice=bookPrice;
		this.availability=availability;
	}
	public void display()
	{
		System.out.println("Book ID:" +bookId);
		System.out.println("Book Name:" +bookName);
		System.out.println("Author Name:" +authorName);
		System.out.println("Book Price:" +bookPrice);
		System.out.println("Book is Available or Not:" +availability);
		System.out.println("Institute:"+libraryName);
	}
	public void displayByName()
	{
		System.out.println("Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", bookPrice="
				+ bookPrice + ", availability=" + availability + "]");
	}
	/*@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", bookPrice="
				+ bookPrice + ", availability=" + availability + "]";
	}*/
	public void borrowBook()
	{
		if(availability.equals("available")||availability.equals("Available"))
		{
			System.out.println("Book is available");
		}
		else
			System.out.println("Book is not available");
	}
	public void name()
	{
		System.out.println(bookName);
	}
}

public class BookManagementSystem 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		Book book1 = new Book();
		book1.createBook(1001, "Don Quixote", "Miguel de Cervantes", 290, "Available");
		book1.name();
		//System.out.println();
		Book book2 = new Book();
		book2.createBook(1002, "Lord of the Rings", "J.R.R. Tolkien", 456, "Not Available");
		book2.name();
		//System.out.println();
		Book book3 = new Book();
		book3.createBook(1003, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 786, "Available");
		book3.name();
		//System.out.println();
		Book book4 = new Book();
		book4.createBook(1004, "And Then There Were None", "Agatha Christie", 986, "Available");
		book4.name();
		//System.out.println();
		Book book5 = new Book();
		book5.createBook(1005, "Alice's Adventures in Wonderland", "Lewis Carroll", 865, "Available");
		book5.name();
		do
		{
			System.out.println("\nEnter your choice");
			System.out.println("1) All Book Details:");
			System.out.println("2) Check Availability:");
			System.out.println("3) Exit");
			choice = sc.nextInt(); 
			if(choice==1)
			{
				System.out.println("Enter Which book you the details:");
				System.out.println();
				System.out.println("1)"+book1.bookName+"\n2)"+book2.bookName+"\n3)"+book3.bookName+"\n4)"+book4.bookName+"\n5)"+book5.bookName);
				int ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					book1.display();
					break;
				case 2:
					book2.display();
					break;
				case 3:
					book3.display();
					break;
				case 4: 
					book4.display();
					break;
				case 5:
					book5.display();
					break;
				default:
					System.out.println("Enter a valid input");
				}
			}
			else if(choice==2)
			{
				System.out.println("Enter the book number:");
				System.out.println();
				System.out.println("1)"+book1.bookName+"\n2)"+book2.bookName+"\n3)"+book3.bookName+"\n4)"+book4.bookName+"\n5)"+book5.bookName);
				int ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					book1.borrowBook();
					break;
				case 2:
					book2.borrowBook();
					break;
				case 3:
					book3.borrowBook();
					break;
				case 4:
					book4.borrowBook();
					break;
				case 5:
					book5.borrowBook();
					break;
				default:
					System.out.println("Enter a valid input");
				}
			}
			else 
			{
				System.exit(0);
			}
		}while(true);
	}

}
