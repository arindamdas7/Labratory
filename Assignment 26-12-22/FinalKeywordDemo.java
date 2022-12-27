package abstractiondemo;
class Vehicle
{
	final void speed()
	{
		System.out.println("The speed is: 100km/hr");
	}
}
public class FinalKeywordDemo extends Vehicle{

	final int a = 100;
	public static void main(String[] args) {
		FinalKeywordDemo demo = new FinalKeywordDemo();
		//demo.a = 50;
		System.out.println(demo.a);
		demo.speed();
	}

}
