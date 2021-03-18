//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class WordPrinterRunner
{
	public static void main( String args[] )
	{
		Scanner kb = new Scanner(System.in);
		String choice = "";
		do
		{
			System.out.println("\nEnter the word to display :: ");
			String word = kb.next();

			System.out.println("Enter the times to display :: ");
			int times = kb.nextInt();
			
			WordPrinter test = new WordPrinter();
			test.printWord(word,times);

			System.out.println("\nDo you want to enter more sample input? ");
			choice = kb.next();
		}
		while(choice.equals("Y")||choice.equals("y"));	
	}
}