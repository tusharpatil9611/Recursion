package recursion;
public class Harshada {
	public static void main(String[] args)
	{
		int n[]={1,2,4};
		int a[]={1,1,1,1,1,2,2,3,4};
		
		for (int i = 0; i < n.length; i++)
		{
			int count=0;
			for (int j = 0; j < a.length; j++)
			{
				if(a[j]==n[i])
					count++;
			}
			if(count>2)
				count=2;
			int []newA=new int[a.length-count];
			count=0;
			int index=0;
			for (int j = 0; j <a.length; j++)
			{
				if(a[j]==n[i] && count<2)
					count++;
				else
					newA[index++]=a[j];
			}
			a=newA;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
