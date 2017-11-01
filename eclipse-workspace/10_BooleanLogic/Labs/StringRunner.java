//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		BiggestString biggestString = new BiggestString("abcd", "efgh", "stuff");
		System.out.println(biggestString);
		BiggestString biggerString = new BiggestString("uiop", "qwer", "asdf");
		System.out.println(biggerString);
	}
}