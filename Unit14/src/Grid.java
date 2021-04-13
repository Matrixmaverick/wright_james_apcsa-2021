//(c) A+ Computer Science
//www.apluscompsci.com
//Name - James Wright

public class Grid
{
   private String[][] grid;
   private int[] counted = new int[8];
   private int count = 0;
   private int largest = 0;
   private int indexLarge = 0;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(rows = 0; rows < grid.length; rows++) {
			for (cols = 0; cols < grid[rows].length; cols++) {
				grid[rows][cols] = vals[(int)(Math.random()*7)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String out = "";
		for (int a = 0; a < vals.length; a++) {
			counted[a] = countVals(vals[a]);
		}
		
		largest = counted[0];
		indexLarge = 0;
		
		for (int b = 0; b < counted.length - 1; b++) {
			out += vals[b] + " count is " + counted[b] + "\n";
			if (counted[b] > counted[b + 1]) {
				largest = counted[b];
				indexLarge = b;
			}
		}
		out += "\n" + vals[indexLarge] + " occurs the most: " + counted[indexLarge];
		return out;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		count = 0;
		for (int r = 0; r <  grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				if (grid[r][c].equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int rows = 0; rows < grid.length; rows++) {
			for(int cols = 0; cols < grid[rows].length; cols++) {
				output += (grid[rows][cols] + " ");
			}
			output += "\n";
		}
		return output;
	}
}