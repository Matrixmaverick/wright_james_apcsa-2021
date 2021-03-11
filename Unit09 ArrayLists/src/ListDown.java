//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[]numArray)
	{
		for (int num=0;num<numArray.length && num+1<numArray.length; num++) {
			if (numArray[num]>numArray[num+1]) {
				return true;
			} else if (numArray[num] == 1){
				return true;
			}
			return false;
			}
		return false;
	}	
}