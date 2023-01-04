import java.util.*;
public class SimpleInterest
{
	public static void main(String[] args)
	{
		int p,r,t,si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the principal:");
		p = sc.nextInt();
		System.out.println("Enter the rate:");
		r = sc.nextInt();
		System.out.println("Enter the time:");
		t = sc.nextInt();
		si = (p*r*t)/100;
		System.out.println("Simple Interest is: " +si);
	}
}
