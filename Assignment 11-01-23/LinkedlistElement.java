package collection;

import java.util.*;

public class LinkedlistElement 
{

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		names.add("Amrita");
		names.add("Priya");
		names.add("Rahul");
		names.add("Madhurima");
		System.out.println(names);

		System.out.println();
		
		System.out.println("Using for each loop");
		for(String s: names)
		{
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("Using while loop");
		int count=0;
		while(count<names.size())
		{
			System.out.println(names.get(count));
			count++;
		}
		System.out.println();
		
		System.out.println("Using iterator");
		Iterator itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		System.out.println("Performing adding operations");
		names.addFirst("Sunita");
		names.addLast("Subarno");
		names.add(2, "Lokesh");
		System.out.println(names);
		
		System.out.println();
		
		System.out.println("Performing removing operations");
		names.removeFirst();
		names.removeLast();
		names.remove(2);
		System.out.println(names.remove("Lokesh"));
		System.out.println(names);
		
		System.out.println();
		names.set(1, "Lokesh");
		System.out.println(names);
		String name = names.get(0);
		System.out.println(name);
		System.out.println(names);
		
		//names.removeAll(names);
		//System.out.println(names);
		
		//names.clear(); //it clears the linked list and make it empty
		//System.out.println(names);
		
		ListIterator listit = names.listIterator();
		System.out.println("Forward direction");
		while(listit.hasNext())
		{
			System.out.println(listit.next());
		}
		System.out.println();
		
		System.out.println("Backward direction");
		while(listit.hasPrevious())
		{
			System.out.println(listit.previous());
		}
		System.out.println();
		
		System.out.println("Printing in reverse using descending iterator");
		Iterator itr1 = names.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println();
	/*	Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//checking the contents using if loop using contains keyword
		if(names.contains(str))
		{
			System.out.println("Data is present");
		}
		else
		{
			System.out.println("Data is not present");
		}*/
		
		names.add("Sabdick");
		System.out.println(names);
		System.out.println(names.lastIndexOf("Rahul"));
		
		names.push("Priya");
		System.out.println("Element popped: "+names.pop());
		System.out.println(names);
		
		System.out.println("Element poll: "+names.poll());
		System.out.println(names);
		
		System.out.println("Element poll: "+names.pollFirst());
		System.out.println(names);
		
		System.out.println("Element poll: "+names.pollLast());
		System.out.println(names);
		
		names.push("Sandeep");
		names.push("Arnab");
		//convert linked list into array list
		List<String> arlist = new ArrayList<>(names);
		System.out.println(names);
		
		//convert linked list into array
		String array[] = names.toArray(new String[names.size()]);
		System.out.println("Converting linked list to array");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
		
		
		
	}

}
