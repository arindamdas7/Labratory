package bookmanagementsystem;

public class Book 
{
	private int bookId;
	private String bookname;
	private String author;
	private double bookPrice;
	public Book()
	{
		super();
		
	}
	public int getBookId() 
	{
		return bookId;
	}
	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}
	public String getBookname() 
	{
		return bookname;
	}
	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public double getBookPrice()
	{
		return bookPrice;
	}
	public void setBookPrice(double bookPrice)
	{
		this.bookPrice = bookPrice;
	}
	public Book(int bookId, String bookname, String author, double bookPrice) 
	{
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.author = author;
		this.bookPrice = bookPrice;
	}

}
