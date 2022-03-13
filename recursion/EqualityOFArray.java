package recursion;

public class EqualityOFArray {
	
	public static void main (String [] args)
	{
		int []a={1,2,3};
		int []b={1,2,3};
		int different=0;
		int i=0;
		if(a.length==b.length)
		{
			different=check(i,a,b,different);	//Recived Different count. 
			if(different==0)
				System.out.println("same");
			else
				System.out.println("not same");
		
		}
		else
			System.out.println("not same");
	}
	private static int check(int i, int []a, int []b,int different) 
	{
		if(i<a.length)
		{
			if(a[i]!=b[i])
			{
				different++;
			}
			i++;
		return	check(i,a,b,different);	
		}
		return different;			//return different to main method
	}
}
