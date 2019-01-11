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
		int n = rand.nextInt(5 - 3 + 1) + 3;//The amount of nodes/vertices
		PrintArray(RandomArray(n));
	}

	
	public static void PrintArray(double matrix [][]) //Replace Ints to double when creating a double, but since Exercise 3 asks for natural integer
	{
				for (int i = 0; i < matrix.length; i++) 
				{
				    for (int j = 0; j < matrix[i].length; j++) {
				        System.out.print(matrix[i][j] + " ");
				    }
				    System.out.println();
				}	
	}
	
	private static double[][] RandomArray(int n)
	{
			double RandomArray[][] = new double [n][n]; //Declaring an array with n by n elements.
			int row; int column;
			Random rand = new Random(); //Initialising the random function
			rand.setSeed(System.currentTimeMillis());
			
			for(row = 0; row < n; row++)
			{
				for(column = 0; column < n; column++)
				{
					if (row == column) //If row = column , 0,0, 1,1, 2,2 then it cannot have a route with itself.
					{
						RandomArray[row][column] = 0;
					}
					
					else 
					{
						int r = Math.abs(rand.nextInt() % 101); //This keeps the random value below 100.
						RandomArray[row][column] = r; //To make the array symmetrical I inverse the row and column and make it equal to the same random variable
						RandomArray[column][row] = r; 
					}
				}
				
			}
			return (RandomArray);
		}
	
}
	
