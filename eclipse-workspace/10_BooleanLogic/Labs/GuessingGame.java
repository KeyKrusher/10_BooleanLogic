//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int playerInput;
	private boolean gameResult;

	public GuessingGame(int stop)
	{
		playerInput = stop;
	}

	public void playGame()
	{
//		int randomComputerChoice = new Random().nextInt(choices.length);
		int computerGuess = new Random().nextInt(5);
		gameResult = computerGuess == playerInput;
		System.out.println(computerGuess);
	}

	public String toString()
	{
		String output="";
		return output;
	}
}