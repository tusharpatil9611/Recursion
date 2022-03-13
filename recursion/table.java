package recursion;
import java.util.*;
public class table {
	static int counter=0;
	static int num;
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
		 num=sc.nextInt();
		m1();	
	}
	private static void m1() {
		counter++;
		System.out.println(counter*num);
		if(counter<10)
			m1();
	}
}
