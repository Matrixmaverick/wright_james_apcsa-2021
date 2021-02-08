//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
	    Discount bill = new Discount();
	    out.print("Enter the original bill amount :: ");
	    bill.beforeDiscount = keyboard.nextDouble();

	    double discount;
	    
	    discount=bill.getDiscountedBill();

	    System.out.printf("%.2f", discount);
	}
}