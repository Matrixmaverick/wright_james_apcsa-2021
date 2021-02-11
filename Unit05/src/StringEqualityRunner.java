//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality("hello", "goodbye");
		out.println(test);
		
		test.assignWords("one", "two");
		out.println(test);
		
		test.assignWords("three", "four");
		out.println(test);
		
		test.assignWords("TCEA", "UIL");
		out.println(test);
		
		test.assignWords("State", "Champions");
		out.println(test);
		
		test.assignWords("ABC", "ABC");
		out.println(test);
		
		test.assignWords("ABC", "CBA");
		out.println(test);
		
		test.assignWords("Same", "Same");
		out.println(test);
	}
}