package oops;

class Rbi
{
	public void loanInterest()
	{
		System.out.println("(9% loan interest");
	}
}
class Sbi extends Rbi
{
	public void loanInterest()
	{
		System.out.println("SBI: 5% loan interest");
	}
}
class Hdfc extends Rbi
{
	public void loanInterest()
	{
		System.out.println("HDFC: 8.5% loan interest");
	}
}

public class Overriding 
{

	public static void main(String[] args)
	{
		Rbi rbi;
		rbi = new Sbi();
		rbi.loanInterest();
		
		rbi = new Hdfc();
		rbi.loanInterest();
	}

}
