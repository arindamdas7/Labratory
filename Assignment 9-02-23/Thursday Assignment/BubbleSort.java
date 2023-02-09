package assignment;

import java.util.Scanner;

public class BubbleSort 
{
	static void bubbleSort(int arr[])
	{
		int n=arr.length;
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,s;
		System.out.println("Enter the size of an array: ");
		s = sc.nextInt();
		int arr[] = new int[s];
		System.out.println("Enter elements: ");
		for(i=0; i<s; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before sorting: ");
		for(i=0;i<s;i++)
		{
			System.out.print(arr[i]+" ");
		}
		bubbleSort(arr);
		System.out.println();
		System.out.println("Array after sorting: ");
		for(i=0;i<s;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
