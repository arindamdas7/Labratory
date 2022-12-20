package oops;

class Student
{
	int id;
	String name, address;
	long phone;
	
	public void setData(int id, String name, String address, long phone)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	public void getData()
	{
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
		System.out.println("Address:" +address);
		System.out.println("Mobile No.:" +phone);
	}
}

public class ClassDemo 
{

	public static void main(String[] args) 
	{
		Student student = new Student();
		/*student.id = 101; //using instance of a class
		student.name = "Arindam";
		student.address = "Midnapore";
		student.phone = 9563908202l;
		System.out.println(student);*/
		student.setData(107, "Arindam", "Midnapore", 9563908202l);
		student.getData();
	}

}
