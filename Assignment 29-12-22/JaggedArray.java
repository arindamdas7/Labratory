package array;

import java.util.Scanner;

public class JaggedArray
{
	public static void main(String[] args) 
	{
		int arr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		int count=1;
		//System.out.println("enter the elements of jagged array:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				//arr[i][j]=sc.nextInt();
				arr[i][j]=count++;
			}
		}
		System.out.println("Jagged Array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
