package task02;
/**
 * @author interzone
 * */
public class Factorial {
	public static int reverseFactorial(int numb) {
		if (numb < 0) {
			return 0;
		} 
		if (numb == 0  ) {
			return 1;
		}
		
		int factorial = 1;

	    while (numb > 1)
	    	numb /= ++factorial;
	    
		return factorial; 
	}
}
