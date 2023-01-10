package collection;
import java.util.*;
public class ArrayListString 
{

	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str;
		//alist.add("Arindam");
		//System.out.println(alist);
		
		System.out.println("Enter the Strings:");
		for(int i=0;i<5;i++)
		{
			str=sc.next();
			alist.add(str);
		}
		System.out.println("String are: "+alist);
		
		System.out.println("Printing using for loop:");
		for(int i=0;i<alist.size();i++)
		{
			System.out.print(alist.get(i));
		}
		//Sorting in ascending order
		Collections.sort(alist);
		System.out.println("After sorting: "+alist);
		//Sorting in descending order
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("After sorting(reverse): "+alist);
		
		//adding a value using index
		alist.add(2, "Bishupriya");
		System.out.println(alist);
		System.out.println("Enter the index where you want to add:");
		int index = sc.nextInt();
		System.out.println("Enter the string:");
		str = sc.next();
		alist.add(index, str);
		System.out.println(alist);
		
		//replace a string
		alist.set(0, "Sunita");
		alist.set(5, "Rahul");
		System.out.println(alist);
		
		//remove a string from a index
		alist.remove(0);
		System.out.println(alist);
		
		//remove a string from object
		System.out.println(alist.remove("Sunita")); // if it is found in the arraylist then it will remove
		
		System.out.println("Original arraylist: "+alist);
		ArrayList<String> alist2 = new ArrayList<String>();
		alist2.addAll(alist);
		System.out.println("Copied arraylist: "+alist2);
		
		//convert from array to arraylist
		String arr[] = {"Arnab","Sabdick","Subarno","Arindam","Pritam"};
		ArrayList<String> alist3 = new ArrayList<String>(Arrays.asList(arr));
		
		//we can add new elements also
		alist3.add("Sunita");
		alist3.add("Bishupriya");
		System.out.println(alist3);
		
		//convert from arraylist to array
		String arr1[] = new String[alist3.size()];
		for(int i=0;i<alist3.size();i++)
		{
			arr1[i] = alist3.get(i);
		}
		System.out.println("Array: ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		
		
	}
}
