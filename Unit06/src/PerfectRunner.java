//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect();
				
		test.setNum(496);
		test.isPerfect();
		out.println(test);
		
		test.setNum(45);
		test.isPerfect();
		out.println(test);
		
		test.setNum(6);
		test.isPerfect();
		out.println(test);
		
		test.setNum(14);
		test.isPerfect();
		out.println(test);
		
		test.setNum(8128);
		test.isPerfect();
		out.println(test);
		
		test.setNum(1245);
		test.isPerfect();
		out.println(test);
		
		test.setNum(33);
		test.isPerfect();
		out.println(test);
		
		test.setNum(28);
		test.isPerfect();
		out.println(test);
		
		test.setNum(27);
		test.isPerfect();
		out.println(test);
		
		test.setNum(33550336);
		test.isPerfect();
		out.println(test);
	}
}