//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees(long number)
	{
		int count = 0;
	    if (3 > number)
	    {
	        return 0;
	    }
	    else
	    {
	        if ( 3 == number % 10)
	        {
	            count = 1;
	        } else {
	            count = 0;
	        }
	    }
	    return count + luckyThrees(number / 10);  
	}
}