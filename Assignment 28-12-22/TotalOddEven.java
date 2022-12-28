package arrayexamples;

import java.util.Scanner;

public class TotalOddEven
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int sumEven= 0, sumOdd= 0, even=0, odd=0;
		System.out.println("Enter the elements of an array: ");
		for(int i=0; i<s; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<s; i++)
        {
            if(a[i]%2 == 0)
            {
            	even= even+1;
                sumEven = sumEven + a[i];
            }
            else
            {
            	odd= odd+1;
                sumOdd = sumOdd + a[i];
            }
        }
        System.out.println("Even numbers are: "+even);
        System.out.println("Sum of the Even numbers:"+sumEven);
        
        System.out.println("Odd numbers are: "+odd);
        System.out.println("Sum of the Odd numbers:"+sumOdd);
	}

}
