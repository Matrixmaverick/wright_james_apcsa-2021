//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter first monster's name : ");
		String name1 = keyboard.next();
		out.println("Enter first monster's size : ");
		int size1 = keyboard.nextInt();
		keyboard.nextLine();
		
		out.println("Enter second monster's name : ");
		String name2 = keyboard.next();
		out.println("Enter second monster's size : ");
		int size2 = keyboard.nextInt();
		keyboard.nextLine();
		
		Skeleton monster1 = new Skeleton(name1, size1);
		Skeleton monster2 = new Skeleton(name2, size2);
		
		out.println(monster1);
		out.println(monster2);
		out.println();
		
		if(monster1.isBigger(monster2)) {
			out.println("Monster one is bigger than Monster two.");
		} else {
			out.println("Monster one is smaller than Monster two.");
		}
		if(monster1.namesTheSame(monster2)) {
			out.println("Monster one has the same name as Monster two.");
		} else {
			out.println("Monster two does not have the same name as Monster two.");
		}	
	}
}