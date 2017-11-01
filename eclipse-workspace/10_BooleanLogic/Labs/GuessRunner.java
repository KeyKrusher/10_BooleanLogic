//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 5 ");
		int response = keyboard.nextInt();
		GuessingGame guesser = new GuessingGame(response);
		guesser.playGame();
		System.out.println(guesser);
	}
}