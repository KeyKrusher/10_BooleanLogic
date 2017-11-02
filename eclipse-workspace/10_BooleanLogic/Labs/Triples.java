//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Arrays;
import java.util.Collections;

// Max value

public class Triples {
   private int number;

	public Triples() {
		this(0);
	}

	public Triples(int num) {
		number = num;
	}

	public void setNum(int num) {
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c) {
		
		
		return 1;
	}
	
	public static int gcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcf(b, a % b);
	}

	public static int gcf(int a, int b, int c) {

		return gcf(gcf(a, b), c);

	}
	
	// Use Euclid's formula, it's faster
//	private static void p5(int sum) {
//	    // a = m^2 - n^2
//	    // b = 2mn
//	    // c = m^2 + n^2
//	    int a, b, c;
//	    int sqrt = (int)Math.sqrt(sum);
//	    for (int n = 1; n <= sqrt; n++) {
//	        for (int m = n+1; m <= sqrt; m++) {
//	            a = m*m - n*n;
//	            b = 2*m*n;
//	            c = m*m + n*n;
//	            if ( a + b + c == 1000 ) {
//	                System.out.print(a * b * c);
//	                return;
//	            }
//	        }
//	    }
//	}

	public String toString() {
		String output="";






		return output+"\n";
	}
}
