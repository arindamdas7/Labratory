package arrayexamples;

import java.util.Scanner;

public class ArrayCreation
{

	public static void main(String[] args)
	{
		int arr[]= {2,6,5,7,9};
		String name[]= {"abc", "bcd", "def"};
		char c[]= {'a', 'b','c'};
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int [5];
		System.out.println("Enter the array elements:");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Printing using for loop:");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("Printing using for-each loop:");
		for(int var: arr1)
		{
			System.out.println(var);
		}
	}

}
