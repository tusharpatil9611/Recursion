package recursion;

public class table2 {
	
	static int num=5;
	static int i = 1;
	public static void main(String[] args) 
	{		
		table();
	}
	private static void table()
	{	
		if(i<=10)
		{
			System.out.println(i*num);
			i++;
			table();
		}
	}

}
