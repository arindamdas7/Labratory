package abstractiondemo;

public class BlankFinalStaticVar 
{
	static final int data;
	static
	{
		data = 5;
	}
	public int cube(final int n)
	{
		//n = n+2;
		return n*n*n;
	}
	public static void main(String[] args) 
	{
		BlankFinalStaticVar blank = new BlankFinalStaticVar();
		System.out.println(blank.cube(data));

	}

}
