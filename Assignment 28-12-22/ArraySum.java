package arrayexamples;

import java.util.Scanner;

public class ArraySum
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int sum = 0;
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of all the elements in the array: "+sum);
	}

}
