package array;

import java.util.Scanner;

public class AddElements 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int i;
		int a[] = new int [size];
		System.out.println("Enter "+size+" elements in 1st array:");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("First array:");
		/*for(int var:a)
		{
			System.out.println(var);
		}*/
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int b[]= new int [size];
		System.out.println("Enter "+size+" elements of 2nd array:");
		for(i=0; i<size;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Second array:");
		/*for(int var:b)
		{
			System.out.println(var);
		}*/
		for(i=0;i<size;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		int c[]= new int[size];
		for(i=0; i<size; i++)
		{
			c[i]=a[i]+b[i];
		}
		System.out.println("Printing the added values:");
		for(i=0;i<size;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
