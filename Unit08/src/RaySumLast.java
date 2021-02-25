//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
public static int go(int[] ray, int start, int stop)
{
	int sum = 0;
	for (int i=start; i<=stop;i++) {
		if (ray[i]>ray[stop]) {
			sum=sum+ray[i];
		if (ray[i]<=ray[stop]) {
			sum=-1;
	} 
} 
} return sum;
}
}