package oops;

class Student2
{
	int id;
	String name, address;
	long phone;
	static String institute="Anudip Foundation";
	
	/*public Student1()
	{
		id=0;
		name=null;
	}*/
	public Student2(int id, String name, String address, long phone)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	public void display()
	{
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
		System.out.println("Address:" +address);
		System.out.println("Mobile No.:" +phone);
		System.out.println("Institute:"+institute);
	}
	public static void changeInstituteName()
	{
		institute="Anudip Foundation for West Bengal";
	}
}

public class Student1 
{

	public static void main(String[] args) 
	{
		Student2 student2 = new Student2(107, "Arindam", "Midnapore", 9563908202l);
		student2.display();
		System.out.println();
		Student2.changeInstituteName();
		Student2 student3 = new Student2(108, "Abhijit", "Kolkata", 8617069095l);
		student3.display();
		System.out.println();
	}

}
