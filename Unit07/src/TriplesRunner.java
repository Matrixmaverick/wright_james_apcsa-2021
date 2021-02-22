//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(Triples.findTriples(num));
	}
}