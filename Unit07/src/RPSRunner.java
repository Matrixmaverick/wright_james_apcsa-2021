//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
	Scanner k = new Scanner(System.in);
    out.print("Would you like to play? [y, n] :: ");
    char res = k.next().charAt(0);
    if (res=='y'){
        Scanner keyboard = new Scanner(System.in);
        char response;
    
        String play;
        out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
        
        response = keyboard.nextLine().charAt(0);
    
        RockPaperScissors game = new RockPaperScissors(response);
        play=Character.toString(response);
    }
    
    out.println();
    out.print("Would you like to play? [y, n] :: ");
    char res1 = k.next().charAt(0);
    if (res1=='y'){
        Scanner keyboard = new Scanner(System.in);
        char response;
    
        String play;
        out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
        
        response = keyboard.nextLine().charAt(0);
    
        RockPaperScissors game = new RockPaperScissors(response);
        play=Character.toString(response);
    }
    
    out.println();
    out.print("Would you like to play? [y, n] :: ");
    char res2 = k.next().charAt(0);
    if (res2=='y'){
        Scanner keyboard = new Scanner(System.in);
        char response;
    
        String play;
        out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
        
        response = keyboard.nextLine().charAt(0);
    
        RockPaperScissors game = new RockPaperScissors(response);
        play=Character.toString(response);
    }
    
    out.println();
    out.print("Would you like to play? [y, n] :: ");
    char res3 = k.next().charAt(0);
    if (res3=='y'){
        Scanner keyboard = new Scanner(System.in);
        char response;
    
        String play;
        out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
        
        response = keyboard.nextLine().charAt(0);
    
        RockPaperScissors game = new RockPaperScissors(response);
        play=Character.toString(response);
    }
    
    out.println();
    out.print("Would you like to play? [y, n] :: ");
    char res4 = k.next().charAt(0);
    if (res4=='y'){
        Scanner keyboard = new Scanner(System.in);
        char response;
    
        String play;
        out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
        
        response = keyboard.nextLine().charAt(0);
    
        RockPaperScissors game = new RockPaperScissors(response);
        play=Character.toString(response);
    }
}
}



