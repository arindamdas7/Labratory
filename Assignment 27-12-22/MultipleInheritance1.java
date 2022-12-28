package abstractiondemo;

abstract class B1
{
	abstract void display();
	public void demo()
	{
		System.out.println("Abstract class");
	}
}
interface C1
{
	void add(int a, int b);
}
class D extends B1 implements C1
{

	@Override
	public void add(int a, int b)
	{
		System.out.println("Sum: "+(a+b));
		
	}

	@Override
	void display() 
	{
		System.out.println("Multiple Inheritance achieved!");
		
	}
	
}
public class MultipleInheritance1 
{

	public static void main(String[] args) 
	{
		D d = new D();
		d.add(10,20);
		d.display();
		d.demo();

	}

}
