package java8features;

import java.util.ArrayList;
interface runnable
{
	void run();
}
public class LambdaEx {

	public static void main(String[] args) 
	{
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("Arindam");
		list.add("Bishnupriya");
		list.add("Chinmayee");
		list.add("Harshad");
		
		//for each method is available from Java 8
		list.forEach( (s)->System.out.println(s) );
		*/
		
		//without lambda expression
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1 is running!");
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		//using lambda
		Runnable r2 = ()->
		{
			System.out.println("Thread2 is running!");
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
	}

}
