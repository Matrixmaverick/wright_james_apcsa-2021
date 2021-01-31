//© A+ Computer Science
//www.apluscompsci.com

//Name - James Wright
//Date - 1/30/21
//Class - AP CSA
//Lab  - Stars and Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   // creating methods to prepare to execute lines of code
   public void printTwentyStars()
   {
   	for(int i = 0; i < 20; i++)
    {
      out.print("*");
    }
    out.println();
   }

   public void printTwentyDashes()
   {
   	for(int i = 0; i < 20; i++)
    {
      out.print("-");
    }
    out.println();
   }
   
   public void printTwentyDegrees()
   {
   	for(int i = 0; i < 20; i++)
    {
      out.print("°");
    }
    out.println();
   }

   public void printTwoBlankLines()
   {
   	out.println("\n\n");
   }

   public void printOneLayer()
   {
     printTwentyDashes();
     printTwentyStars();
   }

   
   // section of code for printing lines
   public void printSmallBox1()
   {
   	printOneLayer();
    printOneLayer();
    printOneLayer();
   }
   
   public void printSmallestBox1()
   {
	printTwoBlankLines();
   	printTwentyDegrees();
   	printTwentyDegrees();
   }

   public void printBigBox()
   {

	   for(int i = 0; i < 3; i++)
	   {
		   printOneLayer();
	   }
    
	   for(int i = 0; i < 3; i++)
	   {
		   printOneLayer();
	   }
   	}
   
   public void printSmallestBox2()
    {
 	printTwoBlankLines();
    printTwentyDegrees();
    printTwentyDegrees();
    }
    
   public void printSmallBox2()
    {
    printTwoBlankLines();
    printOneLayer();
    printOneLayer();
    printOneLayer();
    }
  }