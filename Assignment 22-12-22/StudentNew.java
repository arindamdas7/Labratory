package oops;

public class StudentNew 
{
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	
	public StudentNew() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	
	public StudentNew(int id, String firstName, String lastName, String address) 
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}


	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
}
