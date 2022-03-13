package recursion;

public class startWith {

	public static void main(String[] args) 
	{
		String s1="abcdefg";
		String s2="abc,";
		boolean startWith= true;
		if(s1.length()>=s2.length())
			startWith=myStartWith(s1,s2,0,startWith);
		else
			startWith=false;
			System.out.println(startWith);
		
	}

	private static boolean myStartWith(String s1, String s2, int i,
			boolean startWith)
	{
		if(i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{ 
				startWith=false;
				return startWith;
			}
			return myStartWith(s1, s2, i+1, startWith);
		}
		return startWith;
		
	}

}
