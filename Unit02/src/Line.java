//(c) A+ Computer Science
//www.apluscompsci.com
//Name - James Wright
//Date - 2/4/21

public class Line
{
	private double xOne, yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		giveCoordinates(x1,y1,x2,y2);	
	}

	public void giveCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}
	
	public void calculateSlope( )
	{
		slope = (yTwo-yOne)/(xTwo-xOne);
	}

	public void print( )
	{
		System.out.print("Slope is :: ");
		System.out.printf("%.2f\n", slope);
		System.out.println();
	}
}