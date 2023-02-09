package multithreading;

public class DeadlockDemo
{

	public static void main(String[] args)
	{
		
		final String resource1 = "paper";
		final String resource2 = "pen";
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Thread1 locked resource1: Paper");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(resource2)
					{
						System.out.println("Wanted to lock resource2: Pen");
					}
				}
			}
		};

		Thread t2 = new Thread()
				{
			public void run()
			{
				synchronized(resource2)
				{
					System.out.println("Thread1 locked resource1: Pen");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(resource1)
					{
						System.out.println("Wanted to lock resource2: Paper");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
