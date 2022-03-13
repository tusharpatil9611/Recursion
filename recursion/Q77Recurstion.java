package recursion;

public class Q77Recurstion {

	public static void main(String[] args)
	{
		int count=1;
		loopI(count,0);
	}

	private static void loopI(int count, int i) 
	{
		if(i<=4)
		{
			int start=count;
			int diff=4;
			loopJ(start,diff,i,0);
			count++;
			System.out.println();	
			loopI(count, i+1);
		}
	}

	private static void loopJ(int start, int diff, int i, int j)
	{
		if(j<=4)
		{
			if(j-i<=0)
			{
				System.out.print(start+" ");
				start=start+diff;
				diff--;
			}
			loopJ(start, diff, i, j+1);	
		}
	}

}
