package array;

import java.util.Scanner;

public class SearchNumber
{

	public static void main(String[] args)
	{
		int size = 0,i;
		Scanner sc = new Scanner(System.in);
		//initializing the pos as -1 as the 1st element on an array is stored as index 0
		int pos=-1;
		//boolean flag = false;
		System.out.println("Enter the size of an array:");
		int ar[] = new int[size];
		System.out.println("Enter "+size+" elements:");
		for(i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter which element you want to search: ");
		int search = sc.nextInt();
		
		//searching an element
		
		for(i=0;i<size;i++)
		{
			if(ar[i]==search) //checking the search with index elements
			{
				//flag = true;
				pos=i;//storing the position of index in pos
				break; //if we find the number we break the loop
			}
			//if(flag == true)
			if(pos!=-1)
			{
				System.out.println("The element "+search+" is present in"+(pos+1)+" position");
			}
			else
			{
				System.out.println("Data not found in array!!");
			}
		}
	}

}
