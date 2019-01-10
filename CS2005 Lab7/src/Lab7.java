import java.io.*;
import java.util.ArrayList;
import java.util.Random; 
public class Lab7 
{
	public static void main(String args[]) throws IOException 
	{
		/*double g[][] = {
				  { 0, 1, 2 },
				  { 1, 0, 3 },
				  { 2, 3, 0 }
				};
		*///Exercise 1
		/*double g[][] = {
				{0, 1, 2, 3, 3 },
				{1, 0, 6, 10, 5 },
				{2, 6, 0, 4, 1 },
				{3, 10, 4, 0, 2 },
				{3, 5, 1, 2, 0 }
			};
		double mst[][] = MST.PrimsMST(g);
		PrintArray(g);
		System.out.println("This is the Matrix!");
		PrintArray(mst);
		System.out.println("This is the Minimum Spanning Tree!");
		*///Exercise 2
		Random rand = new Random();
		int n = rand.nextInt(5 - 3 + 1) + 3;
		System.out.println(RandomArray(n));
	}

	
	public static void PrintArray(double matrix [][]) 
	{
				for (int i = 0; i < matrix.length; i++) 
				{
				    for (int j = 0; j < matrix[i].length; j++) {
				        System.out.print(matrix[i][j] + " ");
				    }
				    System.out.println();
				}	
	}
	
	private static /*ArrayList<Integer> RandomArray(int n)*/ double [][] RandomArray(int n)
	{

		/*ArrayList<Integer> randomarray = new ArrayList<Integer>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());

		for(int i = 0; i<n; i++)
			{
				Integer r = Math.abs(rand.nextInt() % 101);
				randomarray.add(r);
			}
		
		return randomarray;
		*/
		double [][] g = new double [n][n];
		Random random = new Random();
		for (int i = 0; i < n; i++)
		{
				for (int j = 0; j < n; j++)
				{
					g[i][j] = g[j][i];
					g[i][j] = random.nextInt(100);
				}
		}
	return g;
	}
}
	
