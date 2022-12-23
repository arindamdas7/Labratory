package oops;
class Company
{
	int comId;
	String compName;
	Address address;
	
	public Company(int comId, String compName, Address address)
	{
		super();
		this.comId = comId;
		this.compName = compName;
		this.address = address;
	}
	
	public void setComId(int comId)  
	{
		this.comId = comId;
	}

	public void setCompName(String compName) 
	{
		this.compName = compName;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}

	public int getComId() 
	{
		return comId;
	}
	public String getCompName() 
	{
		return compName;
	}
	public Address getAddress() 
	{
		return address;
	}
}
public class AggregationDemo
{

	public static void main(String[] args) 
	{
		Address address1 = new Address(1001, "Kolkata", "West Bengal", "India");
		Address address2 = new Address(2001, "New York City", "New York", "USA");
		
		Company company1 = new Company(101, "Anudip Foundation", address1);
		Company company2 = new Company(141, "Anudip Foundation USA", address2);
		
		System.out.println("First Company: "+company1.getCompName());
		System.out.println("Address: "+company1.getAddress().getCity());
		System.out.println();
		
		System.out.println("Second Company: "+company2.getCompName());
		System.out.println("Address: "+company2.getAddress().getCity());

	}

}
