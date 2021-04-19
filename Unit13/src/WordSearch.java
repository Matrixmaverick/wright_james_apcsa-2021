//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private static Character[][] matrix={{'A','P','P','L','E','X', 'Y', 'P'}, {'X','L','H','J','K','E', 'E', 'D'},
    		{'E','G','G','L','L','X', 'X', 'C'},{'G','F','P','D','G','O', 'G', 'N'},{'M','Y','N','T','A','H', 'U', 'U'},
    		{'P','U','Q','D','G','B', 'T', 'S'},{'B','T','H','I','G','H', 'M', 'S'},{'I','L','K','X','L','T', 'H', 'I'}};

    public WordSearch(int size, String str)
    {
    	
    }
    
    public boolean isFound( String word )
    {
    	if(word==null)
    		return false;

    		if(word.length() > matrix.length)
    		return false;

    		Character x=word.charAt(0);

    		for(int i=0;i<matrix.length;i++)
    		{
    			for(int j=0;j<matrix.length;j++)
    			{
    					if(matrix[i][j]==x) 
    					{
    						if(checkDiagUpRight(word,i,j) || checkDiagUpLeft(word,i,j) || checkRight(word,i,j) || checkDiagDownRight(word,i,j))
    					{
    							return true;
    					}
    				}
    			}
    		}
    		return false;
    }


	public boolean checkRight(String w, int r, int c)
    {
		if(c +w.length() > matrix.length)
			return false;
		
		int count=w.length()-1;
		int charcount=1;

		while(count!=0)
		{
			if(matrix[r][++c]==w.charAt(charcount)) 
			{
				count--;
				charcount++;
			}
			else
			{
				return false;
			}
		}
		System.out.println("Word found in method : checkRight" );
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if( r+w.length() > matrix.length || c +w.length() > matrix.length )
			{
				return false;
			}

		int count=w.length()-1;
		int charcount=1;

		while(count!=0)
		{
			if(matrix[++r][++c]==w.charAt(charcount))
				{
					count--;
						charcount++;
				}
			else
				{
					return false;
				}
		}
		System.out.println("Word found in method : checkRightDiagonal" );
		return true;
	}


	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if(c < w.length()-1)
		{
			return false;
		}

		int count=w.length()-1;
		int charcount=1;

		while(count!=0)
		{

			if(matrix[++r][--c]==w.charAt(charcount)) 
				{
					count--;
					charcount++;
				}
			else
				{
					return false;
				}
			}
		System.out.println("Word found in method : checkLeftDiagonal" );
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if(c + w.length() > matrix.length )
			return false;

		int count=w.length()-1;
		int charcount=1;

		while(count!=0)
		{

			if(matrix[++r][c]==w.charAt(charcount)) 
			{
				count--;
				charcount++;
			}
			else
			{
				return false;
			}
		}
		System.out.println("Word found in method : checkDown" );
		return true;
	}

    public String toString()
    {
    	String output="";
		for(int rows = 0; rows < m.length; rows++) {
			for(int cols = 0; cols < m[rows].length; cols++) {
				output += (m[rows][cols] + " ");
			}
			output += "\n";
		}
		return output;
	}
}

