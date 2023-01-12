package batchCollection;

import java.util.Scanner;

public class BatchMain
{

	public static void main(String[] args) 
	{
		int choice,ch,c;
		Scanner sc = new Scanner(System.in);
		BatchService batch = new BatchService();
		AwsBatchService awsbatch = new AwsBatchService();
		System.out.println("Welcome to Anudip Foundation");
		do
		{
			System.out.println("Please choose which course you want to pursue:\n"
					+ "1) JAVA\n2) AWS\n3) Others \n4) Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("----JAVA----");
				System.out.println("1) Enter student info. \n2) Show Student Info \n3) Update student info");
				ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					batch.javastudentInfo();
					System.out.println();
					break;
				case 2:
					batch.getAllJavaStudentDetails();
					System.out.println();
					break;
				case 3:
					batch.updateJavaStudentInfo();
					System.out.println();
					break;
				default:
					System.out.println("Wrong Input");
				}
				break;
			case 2:
				System.out.println("----AWS----");
				System.out.println("1) Enter student info. \n2) Show Student Info \n3) Update student info");
				c = sc.nextInt();
				switch(c)
				{
				case 1:
					awsbatch.awsStudentInfo();
					System.out.println();
					break;
				case 2:
					awsbatch.getAllAwsStudentDetails();
					System.out.println();
					break;
				case 3:
					awsbatch.updateAwsStudentInfo();
					System.out.println();
					break;
				default:
					System.out.println("Wrong Input");
				}
				break;
				
			case 3:
				System.out.println("---Other----");
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong choice!!");
			}
		}while(true);

	}

}
