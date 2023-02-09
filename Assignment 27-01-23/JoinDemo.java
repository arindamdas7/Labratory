package multithreading;

public class JoinDemo extends Thread 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"Priority"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		JoinDemo jd1 = new JoinDemo();
		JoinDemo jd2 = new JoinDemo();
		JoinDemo jd3 = new JoinDemo();
		jd1.setName("Thread 1");
		jd1.start();
		try
		{
			jd1.join(400);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		jd2.setName("Thread 2");
		jd3.setName("Thread 3");
		jd3.setPriority(MAX_PRIORITY);
		jd2.start();
		/* try
		{
			jd2.join(400);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}*/
		jd3.start();
		
	}

}
