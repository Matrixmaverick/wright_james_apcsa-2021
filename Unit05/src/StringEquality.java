//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String firstString, secondString;

	public StringEquality(String one, String two)
	{
		assignWords(one, two);
	}

	public void assignWords(String one, String two)
	{
		firstString = one;
		secondString = two;
	}

	public boolean checkEquality( )
	{
		if (firstString.charAt(0) == secondString.charAt(0)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString()
	{
		if (checkEquality() == true) {
			return firstString + " has the same letters as " + secondString + "\n";
		} else {
			return firstString + " does not have the same letters as " + secondString + "\n";
		}
	}
}