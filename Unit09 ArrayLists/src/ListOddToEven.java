//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for (int i=0;i<ray.size();i++) {
			if (ray.get(i)%2>0) {
				for (int even = ray.size()-1; even > ray.indexOf(i); even--)
					if (ray.get(even)%2==0) {
						return (ray.lastIndexOf(ray.get(even)) - ray.indexOf(ray.get(i)));
					}
			}
		}
		return -1;
	}
}