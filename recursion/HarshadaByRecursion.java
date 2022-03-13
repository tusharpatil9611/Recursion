package recursion;

public class HarshadaByRecursion {
	static int n[]={1,2,4};
	static int a[]={1,1,1,1,1,2,2,3,4};
	public static void main(String[] args) 
	{
		LoopI(0);
		print(0);
	}
	private static void print(int i) 
	{
		if(i<a.length)
		{
		System.out.print(a[i]+" ");
		print(i+1);
		}
	}
	private static void LoopI(int i)
{
		if(i<n.length)
		{
			int count=0;
			count=findCount(i,0,count);
			if(count>2)
				count=2;
			int []newA=new int[a.length-count];
			count=0;
			int newIndex=0;
			addInewA(i,0,count,newA,newIndex);
			a=newA;
			LoopI(i+1);
		}
}	
	private static int findCount(int i, int j, int count) 
	{
		if(j<a.length)
		{
		if(a[j]==n[i])
			count++;
		return findCount(i, j+1, count);
		}
		
			return count;
	}
	private static void addInewA(int i, int j, int count, int[] newA,
			int newIndex) 
	{
		if(j<a.length)
		{
			if(a[j]==n[i] && count<2)
				count++;
			else
				newA[newIndex++]=a[j];
			addInewA(i, j+1, count, newA, newIndex);
			
		}
	}

}
