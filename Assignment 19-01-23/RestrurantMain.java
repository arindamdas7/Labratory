package restrurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestrurantMain
{

	public static void main(String[] args)
	{
		int id;
		Scanner sc = new Scanner(System.in);
		Map<Integer, Restrurant> map = new HashMap<Integer, Restrurant>();
		
		map.put(1, new Restrurant("Chicken Biryani", 130));
		map.put(2, new Restrurant("Paneer Butter Masala", 120));
		map.put(3, new Restrurant("Fried Chicken Momo", 80));
		map.put(4, new Restrurant("Chicken Manchurian", 110));
		map.put(5, new Restrurant("Sprcial MasalaDosa", 70));
		map.put(6, new Restrurant("Mushroom Chili", 140));
		
		System.out.println("Welcome to C3805 Restaurant");
		System.out.println("=============================");
		System.out.println("MENU");
		System.out.println("====");
		System.out.println("ITEMS\t\tPRICE");
		
		for(Map.Entry em:map.entrySet())
		{
			Restrurant rest = (Restrurant) em.getValue();
			System.out.print(em.getKey()+")");
			rest.display();
		}
		System.out.println("\nOrder abouve Rs.400 and get 50% off");
		
		System.out.println();
		do
		{
			System.out.println("Enter food id:");
			id = sc.nextInt();
			Restrurant rest = map.get(id);
			Billing.order(rest.getFname(), rest.getPrice());
			
			Billing.cont();
			
		}while(true);
		
		
	}

}
