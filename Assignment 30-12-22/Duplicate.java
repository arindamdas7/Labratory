package array;

import java.util.Scanner;

public class Duplicate
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count=0, i,s;
		System.out.println("Enter the size: ");
		s = sc.nextInt();
		int a1[] = new int [s];
		System.out.println("Enter the elements: ");
		for(i=0;i<s;i++)
		{
			a1[i]=sc.nextInt();
		}
		//printing the elements
		System.out.println("The elements are: ");
		for(i=0;i<s;i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		//finding duplicate items in an array
		for(i=0;i<s-1;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(a1[i]==a1[j])
				{
					System.out.println(a1[i]+" ");
					count++;
					break;
				}
			}
		}
		System.out.println("The no of duplicate item: "+count);

	}

}
