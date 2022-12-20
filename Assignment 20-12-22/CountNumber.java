package oops;
import java.util.*;
class Count
{
	  int num;

	  
	  public void getNum(int x) 
	  {
	    num = x;
	  }

	  
	  public int countDigits() 
	  {
	    int n, count;
	    n = num; 
	    count = 0; 
	    while (n > 0) 
	    {
	      n /= 10;
	      count++;
	    }
	    return count;
	  }
}

public class CountNumber 
{

	public static void main(String[] args) 
	{
		Count cn = new Count();
	    int n;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a positive integer number: ");
	    n = sc.nextInt();
	    cn.getNum(n);
	    System.out.println("Total number of digits are: " + cn.countDigits());
	}

}
