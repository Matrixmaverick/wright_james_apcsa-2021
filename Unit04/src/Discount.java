//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	double beforeDiscount;
	double afterDiscount;
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public double getDiscountedBill()
	   {
	       if ( beforeDiscount>2000) {
	    	   afterDiscount=(int)(beforeDiscount*.85);
	       }
	       if ( beforeDiscount<=2000) {
	    	   afterDiscount=beforeDiscount*1;
	       }
	       
	      return afterDiscount;
	}
}