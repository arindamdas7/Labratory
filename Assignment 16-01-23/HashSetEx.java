package collection;

import java.util.*;

public class HashSetEx 
{

	public static void main(String[] args) 
	{
		HashSet<String> hset = new HashSet<String>();
		
		System.out.println(hset.hashCode());
		
		hset.add("dog");
		hset.add("cat");
		hset.add("tiger");
		hset.add("monkey");
		//hset.add(null);
		System.out.println(hset);
		System.out.println(hset.hashCode());
		
		hset.add("horse");
		System.out.println(hset);
		Iterator itr = hset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//creating an array
		System.out.println("Array");
		String arr[] = new String [hset.size()];
		hset.toArray(arr);
		for(String s: arr)
		{
			System.out.println(s);
		}
		System.out.println("Elements in index 2:"+arr[2]);
		System.out.println();
		
		//creating an array list
		ArrayList<String> alist = new ArrayList<String>(hset);
		System.out.println("ArrayList:"+alist);
		
		TreeSet<String> tset = new TreeSet<String>(hset);
		System.out.println(tset);
		tset.add("ant");
		tset.add("zebra");
		System.out.println(tset);
		
		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
		lhset.add(44);
		lhset.add(36);
		lhset.add(27);
		lhset.add(99);
		lhset.add(1);
		System.out.println(lhset);
		
		
		
	}

}
