package multithreading;

public class TestGarbageCollection 
{
	public void finalize()
	{
		System.out.println("All objects are collected..");
	}

	public static void main(String[] args) 
	{
		TestGarbageCollection t1 = new TestGarbageCollection();
		TestGarbageCollection t2 = new TestGarbageCollection();
		t1 = null; //setting t1 to be null or null referenceing
		t2 = null;
		System.gc();
		System.out.println("All are unrefernced..");
		
	}

}
