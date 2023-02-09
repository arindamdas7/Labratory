package assignment;

import java.util.Scanner;

public class MinMaxArray 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,s;
		System.out.println("Enter the size of an array: ");
		s = sc.nextInt();
		int ar[] = new int[s];
		System.out.println("Enter elements: ");
		for(i=0; i<s; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Array: ");
		for(i=0;i<s;i++)
		{
			System.out.println(ar[i]+" ");
		}
		int min=ar[0];
		int max=ar[0];
		for(i=0;i<s;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			else if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println();
		System.out.println("Highest Element: "+max);
		System.out.println("Lowest Element: "+min);

	}

}
