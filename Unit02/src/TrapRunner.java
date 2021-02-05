//© A+ Computer Science  -  www.apluscompsci.com
//Name - James Wright
//Date - 2/4/21
//Class - AP CSA
//Lab  - Trap Lab 

public class TrapRunner
{
	public static void main( String[] args )
	{
		Trap test = new Trap();
		test.giveValues(3,3,3);
		test.trapArea();
		test.print();
		
		test.giveValues(5,6,7);
		test.trapArea();
		test.print();
		
		test.giveValues(5,6,7);
		test.trapArea();
		test.print();
		
		test.giveValues(7,10,6);
		test.trapArea();
		test.print();
		
		test.giveValues(13,9,3);
		test.trapArea();
		test.print();
		
		test.giveValues(6,11,4);
		test.trapArea();
		test.print();
		
		test.giveValues(11,8,5);
		test.trapArea();
		test.print();
	}
}