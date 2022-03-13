package recursion;

public class ContainByRecursion {

	public static void main(String[] args) 
	{
		String s="abcdefghi";
		String s1="bcde";
		boolean result=myCompareTo(s,s1);
		if(s.length()>s1.length())
		{
			int count=0;
			for (int i = 0; i <s.length()-s1.length()+1; i++)
			{
				for (int j = i; j <i+s1.length(); j++) 
				{	String subString="";
					if(s.charAt(i)==s1.charAt(0))
					{
						subString=subString+s.charAt(j);
						
					}	
					
					if(subString.compareTo(s1)==0)
					{
						count++;
						break;
					}
						
				}
				if(count==0)
					System.out.println(false);
				else
					System.out.println(true);
			}
		}
		else
			System.out.println(false);
	}

	private static boolean myCompareTo(String s, String s1)
	{	
		int count=0;
		if(s.length()>s1.length())
		{
			count=checkMyString(s,s1,count,0);
		}
		if(count==0)
			return false;
		else
			return true;
	}

	private static int checkMyString(String s, String s1, int count, int i) 
	{
		if(i<s.length()-s1.length()+1)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				String sTemp="";
				int j=i;
				sTemp=buildMyString(s,s1,i,j,sTemp);
				if(sTemp.compareTo(s1)==0)
				{
					count++;
					return count;
				}
			}
			return checkMyString(s, s1, count, i+1);
		}
		else
			return count;
		
	}

	private static String buildMyString(String s, String s1, int i, int j,
			String sTemp) 
	{
		if(j<i+s1.length())
		{
			sTemp=sTemp+s.charAt(j);
			return buildMyString(s, s1, i, j+1, sTemp);
		}
		else
			return sTemp;
	}

}
