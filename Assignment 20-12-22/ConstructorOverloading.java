package oops;

class Employee
{
	int id;
	String name,city,country,state,designation;
	final int aadhar;
	long phone,salary;
	
	public Employee(int id, String name, String city, int aadhar)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.aadhar=aadhar;
		
	}
	public Employee(int id, String name, String city, int aadhar, String country, String state)
	{
		this(id, name, city, aadhar);
		this.country=country;
		this.state=state;
	}
	public Employee(int id, String name, String city, int aadhar, String country, String state, long phone, long salary, String designation)
	{
		this(id, name, city, aadhar, country, state);
		this.phone=phone;
		this.salary=salary;
		this.designation=designation;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", designation=" + designation + ", aadhar=" + aadhar + ", phone=" + phone + ", salary=" + salary
				+ "]";
	}
	public void display()
	{
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
		System.out.println("City:" +city);
		System.out.println("Aadhar No.:" +aadhar);
	}
}

public class ConstructorOverloading 
{

	public static void main(String[] args) 
	{
		Employee employee1 = new Employee(1, "Shawin", "Darjeeling", 123456789);
		System.out.println(employee1);
		System.out.println();
		Employee employee2 = new Employee(2, "Sabdick", "Barasat", 987654321, "India", "West Bengal");
		System.out.println(employee2);
		System.out.println();
		Employee employee3 = new Employee(3, "Rahul", "Barasat", 869635123, "India", "West Benagal", 987321654, 35000, "Developer");
		System.out.println(employee3);
		
	}

}
