package assignment;

public class PriorityThread extends Thread 
{
	
	public PriorityThread(String message)
	{
		super(message);
	}
	
	public void run()
	{
		System.out.println("Thread is running"+Thread.currentThread().getName()+"Priority"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		PriorityThread t1 = new PriorityThread("first-thread");
		PriorityThread t2 = new PriorityThread("second-thread");
		PriorityThread t3 = new PriorityThread("third-thread");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
