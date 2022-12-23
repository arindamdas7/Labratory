package oops;

class Abhijit
{
	public void display()
	{
		System.out.println("I am the father of all three sons");
	}
}
class Arijit extends Abhijit
{
	public void display()
	{
		System.out.println("I am the 1st son of my father");
	}
}
class Abhinandan extends Abhijit
{
	public void display()
	{
		System.out.println("I am the 2nd son of my father");
	}
}
class Abhishek extends Abhijit
{
	public void display()
	{
		System.out.println("I am the 3rd son of my father");
	}
}
public class HierarchicalInheritence
{

	public static void main(String[] args)
	{
		Abhijit ab = new Abhijit();
		ab.display();
		Arijit ar = new Arijit();
		ar.display();
		Abhinandan abh = new Abhinandan();
		abh.display();
		Abhishek ask = new Abhishek();
		ask.display();
	}

}
