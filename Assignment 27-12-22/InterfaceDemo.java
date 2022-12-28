package abstractiondemo;

interface Printable
{
	int x = 100;
	
	void display();
	void fun();
}
interface Drawable extends Printable
{
	void draw();
}
class Print implements Drawable
{

	@Override
	public void display() 
	{
		System.out.println("Hello");
	}

	@Override
	public void fun() 
	{
		System.out.println("This is fun");
	}

	@Override
	public void draw() 
	{	
		System.out.println("Drawing is fun");
	}
	
}
public class InterfaceDemo 
{

	public static void main(String[] args)
	{
		Print print = new Print();
		print.display();
		print.draw();
		print.fun();
		System.out.println("The value of x is: "+print.x);
	}

}
