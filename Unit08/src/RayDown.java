//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown {

public static boolean go(int[] numArray)
{
	for(int i = 1; i < numArray.length; i++)
	{
		if(numArray[i - 1] <= numArray[i])
			return false;
	}
	return true;
}
}