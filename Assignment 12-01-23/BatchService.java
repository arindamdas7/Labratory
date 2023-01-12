package batchCollection;

import java.util.Scanner;

public class BatchService 
{
	static Scanner sc = new Scanner(System.in);
	static Java java[] = new Java[20];
	static int id;
	static long phone;
	static String name, email;
	static int jindex=0;

	//student info taking java course
	public static void javastudentInfo()
	{
		System.out.println("Enter student id: ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter student name: ");
 		name = sc.nextLine();
		
 		sc.nextLine();
 		System.out.println("Enter student email: ");
		email = sc.nextLine();
			
		System.out.println("Enter student phone no.: ");
		phone = sc.nextLong();
		
		java[jindex] = new Java(id, name, phone, email);
		jindex++;
		System.out.println("Update Successfull");
		
	}
		
	//get java student details
	public static void getAllJavaStudentDetails()
	{
		for(int i=0;i<jindex;i++)
		{
			System.out.println("Student ID: "+java[i].getStdId());
			System.out.println("Student Name: "+java[i].getStdName());
			System.out.println("Student Email: "+java[i].getEmail());
			System.out.println("Student Phone No. "+java[i].getPhone());
			System.out.println("Course Name: Java");
			System.out.println("=========================");
		}
	}
	
	//update student info
	public static void updateJavaStudentInfo()
	{
		System.out.println("Enter student id:");
		id = sc.nextInt();
		for(int i=0;i<jindex;i++)
		{
			if(id==java[i].getStdId())
			{
				System.out.println("Do you want to update your id:? y/n  ");
				char b = sc.next().charAt(0);
				if(b=='y'||b=='Y')
				{
					System.out.println("Enter student id to update:");
					id = sc.nextInt();
				
					sc.nextLine();
					System.out.println("Enter student name to update:");
					name = sc.nextLine();
				
					System.out.println("Enter student phone no. to update:");
					phone = sc.nextLong();
				
					sc.nextLine();
					System.out.println("Enter student email to update:");
					email = sc.nextLine();
				
					java[i] = new Java(id, name, phone, email);
					System.out.println("Update successfull");
				}
				else
				{
					System.out.println("Updation Cancelled!!");	
				}
			}
			else
			{
				throw new StudentNotFoundException("Student details not found!!");
			}
		}	
	}
}
