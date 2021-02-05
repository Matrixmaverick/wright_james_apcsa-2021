//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - James Wright	
//Date - 2/4/21
//Class - AP CSA
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y2;
		xTwo=x2;
		yTwo=y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y2;
		xTwo=x2;
		yTwo=y2;
	}

	public void calcDistance()
	{
		double xDif;
		double yDif;
		double xSq;
		double ySq;
		double plusSq;
		
		xDif = xTwo-xOne;
		yDif = yTwo-yOne;
		
		xSq = Math.pow(xDif, 2);
		ySq = Math.pow(yDif, 2);
		plusSq = xSq+ySq;
		
		distance=Math.sqrt(plusSq);
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		out.print("distance == ");
		out.printf(String.format("%.3f", distance));
		out.print("\n\n");
	}
}