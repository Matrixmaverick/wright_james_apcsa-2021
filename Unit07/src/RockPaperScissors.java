//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
    private char playChoice;
    private char compChoice;

    public RockPaperScissors()
    {

        playChoice='r';
        compChoice='p';

    }

    public RockPaperScissors(char player)
    {
        playChoice = player;
        // //         if (playChoice =="r" || playChoice =="p" || playChoice =="s"){
        // //             this.setPlayers(player);
        // //         }
        // //         else{
        // //             System.out.println("You have entered an incorrect response.");
        // //             this.restart();
        // //         }
        //out.print(playChoice);
        this.setPlayers(playChoice);
    }

    public void setPlayers(char player)
    {


        playChoice = player;
        out.println("player had " + playChoice);
        double cc2 = 3*Math.random();
        int cc = (int)cc2;
        if (cc==0)
            compChoice='R';
        else if (cc==1)
            compChoice='P';
        else
            compChoice='S';

        out.println("computer had " + compChoice);
        this.determineWinner();
    }

    public String determineWinner()
    {
        String winner="";
        
        
        //out.print("one " + playChoice);
        if(playChoice==compChoice){
            out.println("Draw Game!");
            winner = "Draw game!";
        }

        else if(playChoice == 'R'){
            switch(compChoice){
                case 'P': out.println("Computer wins! Paper covers rock."); winner = "Computer wins! Paper covers rock."; break;
                case 'S': out.println("Player wins! Rock breacks scissors."); winner = "Player wins! Rock breacks scissors."; break;
                default: out.print("faillllllll");
            }
        }

        else if(playChoice=='P'){
            switch(compChoice){
                case 'R': out.println("Player wins! Paper covers rock."); winner = "Player wins! Paper covers rock."; break;
                case 'S': out.println("Computer wins! Scissors cuts paper"); winner = "Computer wins! Scissors cuts paper."; break;
            }
        }

        else if(playChoice=='S'){
            switch(compChoice){
                case 'R': out.println("Computer wins! Rock breaks scissors."); winner = "Computer wins! Rock breaks scissors."; break;
                case 'P': out.println("Player wins! Scissors cut paper."); winner = "Player wins! Scissors cut paper."; break;
            }
   
        }
        else {
            out.println("fail");
        }
        return winner;
    }

    public String toString()
    {
        return determineWinner();
    }
}