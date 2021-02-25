//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;

public class SumLastRunner
{
	public static void main( String args[] )
	{
	int[] one = {-99,1,2,3,4,5,6,7,8,9,10,5};
	int[] two = {10,9,8,7,6,5,4,3,2,1,-99};
	int[] three = {10,20,30,40,50,-11818,40,30,20,10};
	int[] four = {32767};
	int[] five = {255,255};
	int[] six = {9,10,-88,100,-555,2};
	int[] seven = {10,10,10,11,456};
	int[] eight = {-111,1,2,3,9,11,20,1};
	int[] nine = {9,8,7,6,5,4,3,2,0,-2,6};
	int[] ten = {12,15,18,21,23,1000};
	int[] eleven = {250,19,17,15,13,11,10,9,6,3,2,1,0};
	int[] twelve = {9,10,-8,10000,-5000,-3000};

	System.out.println(RaySumLast.go(one,0,11));
	System.out.println(RaySumLast.go(two,0,10));
	System.out.println(RaySumLast.go(three,0,9));
	System.out.println(RaySumLast.go(four,0,0));
	System.out.println(RaySumLast.go(five,0,1));
	System.out.println(RaySumLast.go(six,0,5));
	System.out.println(RaySumLast.go(seven,0,4));
	System.out.println(RaySumLast.go(eight,0,7));
	System.out.println(RaySumLast.go(nine,0,10));
	System.out.println(RaySumLast.go(ten,0,5));
	System.out.println(RaySumLast.go(eleven,0,12));
	System.out.println(RaySumLast.go(twelve,0,5));
}
}