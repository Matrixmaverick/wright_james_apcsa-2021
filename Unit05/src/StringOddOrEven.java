//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void assignString(String s)
	{
		word = s;
	}

 	public boolean OddOrEven()
 	{
 		if(word.length() % 2 == 0) {
 			return true;
 		} else {
 			return false;
 		}
	}

 	public String toString()
 	{
 		String answer="";
 		if (OddOrEven( ) == true) {
 			answer += word + " is even.";
 		} else { 
 			answer += word + " is odd.";
 		}
 		return answer;
	}
}