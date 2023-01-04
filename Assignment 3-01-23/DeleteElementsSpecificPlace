package array;

import java.util.Scanner;

public class DeleteElementsSpecificPlace
{

	public static void main(String[] args) 
	{
		int ar[]= new int[20];
		int pos;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want to enter: ");
		int ele = sc.nextInt();
		System.out.println("Enter the elemets: ");
		for(int i=0;i<ele;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		for(int i=0;i<ele;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("Enter which position elements you want to remove: ");
		pos = sc.nextInt();
		
		if(pos>ele+1 || pos<0)
		{
			System.out.println("Invalid position");
		}
		else
		{
			for(int i=pos-1;i>ele;i++)
			{
				ar[i]=ar[i+1];
			}
			ele--;
			
			System.out.println("Array after deletion: ");
			for(int i=0;i<ele;i++)
			{
				System.out.print(ar[i]+" ");
			}
		}
		
	}

}
