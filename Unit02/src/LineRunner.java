//© A+ Computer Science  -  www.apluscompsci.com
//Name - James Wright
//Date - 2/4/21
//Class - AP CSA
//Lab  - Trap Lab

public class LineRunner
{
   public static void main( String[] args )
   {
		Line test = new Line(1,9,14,2);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.giveCoordinates(1,7,18,3);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.giveCoordinates(6,4,2,2);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.giveCoordinates(4,4,5,3);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.giveCoordinates(1,1,2,9);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.giveCoordinates(1,7,2,9);
	 	test.calculateSlope();
	 	test.print();
	}
}