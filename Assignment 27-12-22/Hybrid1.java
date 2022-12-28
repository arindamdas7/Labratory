package abstractiondemo;

interface A2
{
	public void msg();
}
interface B2
{
	public void msg();
}
class C2 implements A2,B2
{

	@Override
	public void msg()
	{
		System.out.println("This is my messege");
	}
	
}

class D2 extends C2
{
	public void display()
	{
		System.out.println("Hello");
	}
}


public class Hybrid1 
{

	public static void main(String[] args) 
	{
		C2 c = new C2();
		c.msg();
		D2 d = new D2();
		d.display();

	}

}
