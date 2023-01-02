package array;

import java.util.Arrays;

public class ArraySort 
{

	public static void main(String[] args)
	{
		int a[] = {12,10,9,5,43};
		Arrays.sort(a);
		System.out.println("Sorting elements:(ascending order)");
		for(int var: a)
		{
			System.out.println(var+" ");
		}
	}

}
