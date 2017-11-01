//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;
	private String max;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		one = a;
		two = b;
		three = c;
	}

	public void setStrings(String a, String b, String c)
	{
		one = a;
		two = b;
		three = c;
	}

	public String getBiggest()
	{
		String[] strings = {one, two, three};
		max = strings[0];
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].compareTo(max) > 0) {
				max = strings[i];
			}
		}
		return max;
	}

	public String toString()
	{
		System.out.println(one + " " + two + " " + three);
		return "biggest = " + max;
	}
}