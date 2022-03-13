package recursion;

public class Array1 {
	static int []a={1,2,3};
	static int []b={1,2,3};
	static int count=0;
	public static void main(String []args)
	{
		int i=0;
		if(a.length==b.length)
		{
			check(i);
			if(count==0)
				System.out.println("same");
			else
				System.out.println("not same");
		
		}
		else
			System.out.println("not same");
	}
	private static void check(int i) 
	{
		if(i<a.length)
		{
			if(a[i]!=b[i])
			{
				count++;
			}
			i++;
			check(i);
		}
	}

}
