package collection;

import java.util.ArrayList;
import java.util.List;

public class AddValue 
{

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());
		list.add(11); //adding elements in arraylist
		list.add(12);
		list.add(13);
		//System.out.println(list);
	//	System.out.println(list.size());
		list.add(14);
		list.add(15);
		System.out.println(list);
		list.add(1,16);
		System.out.println(list);

	}

}
