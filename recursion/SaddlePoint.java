
package recursion;

public class SaddlePoint {
	static int count=0; 
	public static void main(String[] args) 
	{
		int [][]a={{5,2,0},{8,6,7},{1,2,4}};
		LoopI(a,0);
		if(count==0)
			System.out.println("NOt found");
	}
	private static void LoopI(int[][] a, int i) 
	{
		if(i<a.length)
		{
			LoopJ(a,i,0);
			LoopI(a,i+1);
		}
	}
	private static void LoopJ(int[][] a, int i, int j) 
	{
		if(j<a[i].length)
		{
			boolean isSmallestInRow=true;
			boolean isLargestInCol=true;
			isSmallestInRow=chechInRow(a,i,j,isSmallestInRow,0);
			isLargestInCol=checkInCol(a,i,j,isLargestInCol,0);
			if(isSmallestInRow==true && isLargestInCol==true)
			{
				System.out.println(a[i][j]);
				count++;
			}
			LoopJ(a, i, j+1);
		}
	}
	private static boolean checkInCol(int[][] a, int i, int j,
			boolean isLargestInCol, int k)
	{
		if(k<a.length)
		{
		if(a[k][j]>a[i][j])
		{
			isLargestInCol=false;
			return isLargestInCol;
		}
		return checkInCol(a, i, j, isLargestInCol, k+1);
		}
		else
			return isLargestInCol;
	}
	private static boolean chechInRow(int[][] a, int i, int j,
			boolean isSmallestInRow, int k)
	{
		if(k<a.length)
		{
			if(a[i][k]<a[i][j])
			{
				isSmallestInRow=false;
				return isSmallestInRow;
			}
			return chechInRow(a, i, j, isSmallestInRow, k+1);
		}
		else
			return isSmallestInRow;
	}

}
