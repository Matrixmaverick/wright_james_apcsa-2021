//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{Scanner kb = new Scanner(System.in);
	String choice = "";

	do
	{
		out.print("Enter a word : ");
		String word = kb.next();

		TriangleWord test = new TriangleWord();
		TriangleWord.printTriangle(word);

		out.println("Do you want to play again?");

		choice = kb.next();
	}
	while (choice.equals("yes")||choice.equals("Yes"));
	}
}
