package array;

import java.util.Arrays;
import java.util.Collections;

public class DescSort 
{

	public static void main(String[] args) 
	{
		int a[] = {12,10,9,5,43};
		int temp = 0;
		System.out.println("Original Array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted array: (descending order)");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
		System.out.println("Second method");
		Integer arr[]= {12,55,99,35,9};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Sorted array(2nd method):(descending order)");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
