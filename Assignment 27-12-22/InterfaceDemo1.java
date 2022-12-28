package abstractiondemo;

interface Printable1
{
	int x = 100;
	
	void display();
	void fun();
}
interface Drawable1 extends Printable1
{
	void draw();
}
interface Sayable
{
	void say();
	int x=10;
}
class Print1 implements Drawable1
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
class Messege implements Drawable,Sayable
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
	public void say()
	{
		System.out.println("Speaking is fun");
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing is fun");
	}
	
}
public class InterfaceDemo1 
{

	public static void main(String[] args)
	{
		Print1 print = new Print1();
		print.display();
		print.draw();
		print.fun();
		System.out.println("The value of x is: "+print.x);
		
		Messege messege = new Messege();
		messege.display();
		messege.draw();
		messege.fun();
		messege.say();
		System.out.println("The value of x is "+Sayable.x);
	}

}
