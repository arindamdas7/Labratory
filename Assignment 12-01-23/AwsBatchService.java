package batchCollection;

import java.util.Scanner;

public class AwsBatchService
{
	static Scanner sc = new Scanner(System.in);
	static Aws aws[] = new Aws[20];
	static int id;
	static long phone;
	static String name, email;
	static int awsindex=0;
	
	//student info taking java course
		public static void awsStudentInfo()
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
			
			aws[awsindex] = new Aws(id, name, phone, email);
			awsindex++;
			System.out.println("Update Successfull");
			
		}
	
		//get java student details
		public static void getAllAwsStudentDetails()
		{
			for(int i=0;i<awsindex;i++)
			{
				System.out.println("Student ID: "+aws[i].getStdId());
				System.out.println("Student Name: "+aws[i].getStdName());
				System.out.println("Student Email: "+aws[i].getEmail());
				System.out.println("Student Phone No. "+aws[i].getPhone());
				System.out.println("Course Name: AWS");
				System.out.println("=========================");
			}
		}
	
		//update student info
		public static void updateAwsStudentInfo()
		{
			System.out.println("Enter student id:");
			id = sc.nextInt();
			for(int i=0;i<awsindex;i++)
			{
				if(id==aws[i].getStdId())
				{
					System.out.println("Do you want to update your id:? y/n  ");
					char a = sc.next().charAt(0);
					if(a=='y'||a=='Y')
					{
						System.out.println("Enter id to update: ");
						id = sc.nextInt();

						System.out.println("Enter student name to update:");
						name = sc.nextLine();

						System.out.println("Enter student phone no. to update:");
						phone = sc.nextLong();
						
						sc.nextLine();
						System.out.println("Enter student email to update:");
						email = sc.nextLine();
						
						aws[i] = new Aws(id, name, phone, email);
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
