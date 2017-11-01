//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double[] doubles = {one, two, three, four};
		double max = doubles[0];
		for (int i = 0; i < doubles.length; i++) {
			if (doubles[i] >= max) {
				max = doubles[i];
			}
		}
		return max;
	}

	public String toString()
	{
	   return "biggest = " + getBiggest() + "\n";
	}
}