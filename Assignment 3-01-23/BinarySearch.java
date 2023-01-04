package array;
import java.util.*;

public class BinarySearch 
{

	public static void main(String[] args)
	{
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Enter element to search: ");
		int ele = sc.nextInt();
		int result = Arrays.binarySearch(arr, ele);
		if(result<0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element present in position: "+(result+1));
		}

	}

}
