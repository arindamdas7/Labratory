package array;

import java.util.*;
public class AddElementsSpecificPosition 
{

	public static void main(String[] args) 
	{
		int ar[]= new int[20];
		int num,pos;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want to enter: ");
		int ele = sc.nextInt();
		System.out.println("Enter the elenets: ");
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
		
		System.out.println("Enter element you want to insert:");
		num = sc.nextInt();
		System.out.println("Enter which position you want to insert: ");
		pos = sc.nextInt();
		
		if(pos>ele+1 || pos<0)
		{
			System.out.println("Invalid position");
		}
		else
		{
			for(int i=ele;i>=pos;i--)
			{
				ar[i]=ar[i-1];
			}
			ar[pos-1]=num;
			ele++;
			
			System.out.println("Array after insertion: ");
			for(int i=0;i<ele;i++)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}

}
