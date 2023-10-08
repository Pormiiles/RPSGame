package rpsgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class RPSGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] rps = {"rock", "paper", "scissors"};
        String pcMove = rps[new Random().nextInt(rps.length)];
        String playerMove;
        
        while(true) {
            System.out.println("Enter your move (rock, paper, scissors): ");
            playerMove = input.nextLine();
            if(playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) 
                break;
            System.out.println(playerMove + " is not a valid move.");
        }
        
        System.out.println("Computer move was: " + pcMove);
        
        if(playerMove.equals(pcMove)) {
            System.out.println("The game was a tie.");
        } else {
            if(playerMove.equals("rock")) {
                if(pcMove.equals("paper"))
                    System.out.println("You lose.");
                else if(pcMove.equals("scissors"))
                    System.out.println("You won.");   
            }
            if(playerMove.equals("paper")) {
                if(pcMove.equals("scissors"))
                    System.out.println("You lose.");
                else if(pcMove.equals("rock"))
                    System.out.println("You won.");   
            }
            if(playerMove.equals("scissors")) {
                if(pcMove.equals("rock"))
                    System.out.println("You lose.");
                else if(pcMove.equals("paper"))
                    System.out.println("You won.");   
            }
        }
    } 
}
