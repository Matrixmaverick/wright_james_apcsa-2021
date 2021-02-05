//(c) A+ Computer Science
// www.apluscompsci.com
//Name - James Wright
//Date - 2/4/21

public class Cube
{
	private double side;
	private double SA;

	public void giveSide(double s)
	{
		side = s;	
	}

	public void calculateSA( )
	{
		SA = (double)6 * Math.pow(side, (double)2);
	}

	public void print( )
	{
		System.out.print("Cube area is :: ");
		System.out.print(SA);
		System.out.println();
	}
}