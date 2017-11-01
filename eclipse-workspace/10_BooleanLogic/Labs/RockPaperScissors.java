//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private String[] choices = {"rock", "paper", "scissors"};

	public RockPaperScissors(){}
	public RockPaperScissors(String player)
	{
		playChoice = player.toLowerCase();
	}

	public void setPlayers(String player)
	{
		playChoice = player.toLowerCase();
	}

	public String determineWinner()
	{
		String result = "";
		int randomComputerChoice = new Random().nextInt(choices.length);
		compChoice = choices[randomComputerChoice];
		
		if (compChoice.equals(playChoice)) {
			result = "tie";
		}
		else if (compChoice.equals("rock")) {
			result = playChoice.equals("paper") ? "Player wins!":"Computer wins!";
		}
		else if (compChoice.equals("paper")) {
			result = playChoice.equals("scissors") ? "Player wins!":"Computer wins!";
		}
		else if (compChoice.equals("scissors")) {
			result = playChoice.equals("rock") ? "Player wins!":"Computer wins!";
		}
		else {
			System.out.println("Error, invalid input!");
			System.exit(1);
		}
		return result;
	}

	public String toString()
	{
		return determineWinner();
	}
}