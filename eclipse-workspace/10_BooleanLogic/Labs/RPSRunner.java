//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
	
		System.out.print("type in your prompt [rock, paper, scissors] :: ");
		
		//read in the player value
		String playerChoice = keyboard.next();
		
		RockPaperScissors game = new RockPaperScissors();
		do {
			game.setPlayers(playerChoice);
			game.determineWinner();
			System.out.println(game);
			playerChoice = keyboard.next();
			System.out.println("\n");
		} while (!(playerChoice.equals("exit")));
	}
}
