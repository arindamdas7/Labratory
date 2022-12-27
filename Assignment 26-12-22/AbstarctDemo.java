package abstractiondemo;

abstract class Bank
{
	abstract public void getLoanInterest();
	
	public void display()
	{
		System.out.println("This is a bank class...");
	}
}
class Sbi extends Bank
{

	@Override
	public void getLoanInterest()
	{
		System.out.println("SBI is providing 6.5% interest");
		
	}
	
}
class Hdfc extends Bank
{

	@Override
	public void getLoanInterest() 
	{
		System.out.println("HDFC is providing 8.5% interest");
		
	}
	
}

public class AbstarctDemo 
{

	public static void main(String[] args) 
	{
		Bank bank;
		bank = new Sbi();
		bank.getLoanInterest();
		bank.display();
		
		Hdfc hdfc = new Hdfc();
		hdfc.getLoanInterest();
		hdfc.display();

	}

}
