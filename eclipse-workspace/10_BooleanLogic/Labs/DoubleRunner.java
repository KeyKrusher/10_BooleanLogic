//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
//		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
		BiggestDouble run1 = new BiggestDouble(1.2,3.7,9.8,10.7);
		System.out.println(run1);
		BiggestDouble run2 = new BiggestDouble(2.7,3.56,5.74,7.00);
	}
}