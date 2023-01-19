package restrurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Billing
{
	static ArrayList<Bill> list = new ArrayList<Bill>();
	static Scanner sc = new Scanner(System.in);
	
	static void order(String fname, int amt)
	{
		System.out.println("Enter the quantity for "+fname+" :");
		int qty = sc.nextInt();
		list.add(new Bill(fname, qty, qty*amt));
	}
	
	static void cont()
	{
		System.out.println("Do you want to continue: y/n");
		char ch = sc.next().charAt(0);
		if((ch!='y') && (ch!='Y'))
		{
			System.out.println();
			totalbill();
			//print total bill
			System.exit(0);
		}
		System.out.println();
		
		
	}
	
	static void totalbill()
	{
		System.out.println("BILL");
		System.out.println("=====");
		System.out.println("  ITEM\t\tQUANTITY    AMOUNT");
		System.out.println("=====================================");
		double total = 0.0;
		for(Bill i: list)
		{
			System.out.println(i.fname+"\t"+i.qty+"\t"+i.amt);
			total = total + i.amt;
			if(total>=400)
			{
				total=total/2;
			}
			else
			{
				total= total-(total*0.10);
			}
		}
		
		System.out.println();
		System.out.println("Amount:    Rs."+total);
		
		double gst = total*0.05;
		System.out.println("GST: \tRs."+gst);
		double cst = total*0.05;
		System.out.println("CST: \tRs."+cst);
		System.out.println("-----------------");
		double famount = gst + cst +total;
		System.out.println("Total: \tRs."+famount);
	}

	
	
}
