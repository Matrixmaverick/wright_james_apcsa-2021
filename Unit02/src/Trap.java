//© A+ Computer Science  -  www.apluscompsci.com
//Name - James Wright
//Date - 2/4/21
//Class - AP CSA
//Lab  - Trap Lab

public class Trap
{
	private double base1;
	private double base2;
	private double height;
	private double area;

	public void giveValues(int b1, int b2, int h)
	{
		base1=b1;
		base2=b2;
		height=h;
	}
	
	public void trapArea( )
	{
		area = (base1+base2)/2*height;
	}

	public void print( )
	{
		System.out.println(area);
	}
}