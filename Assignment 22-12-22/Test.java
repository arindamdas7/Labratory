package oops;

public class Test {

	public static void main(String[] args)
	{
		StudentNew student1 = new StudentNew();
		student1.setId(1);
		student1.setFirstName("Arindam");
		student1.setLastName("Das");
		student1.setAddress("Midnapore");
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getAddress());
		StudentNew student2 = new StudentNew();
		student2.setId(2);
		student2.setFirstName("Abhijit");
		student2.setLastName("Ghosh");
		student2.setAddress("Kolkata");
		System.out.println(student2.getFirstName());
		System.out.println(student2.getLastName());
		System.out.println(student2.getAddress());
	}

}
