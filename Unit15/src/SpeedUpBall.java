//(c) A+ Computer Science
//www.apluscompsci.com
//Name - James Wright

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

	public SpeedUpBall()
	   {
		   super();
	   }

	   public SpeedUpBall(int x, int y)
	   {
		   super(x, y);
	   }


	   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
	   {
		   super(x, y, xSpd, ySpd);
	   }
	   
	   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	   {
		   super(x, y, wid, ht, col, xSpd, ySpd);
	   }

	   public void setXSpeed(int xSpd)
	   {
		   int adder = 1;
		   if (xSpd < 0) {
			   adder = -1;
		   }
		   super.setXSpeed(xSpd + adder);
	   }

	   public void setYSpeed(int ySpd)
	   {
		   int adder = 1;
		   if (ySpd < 0) {
			   adder = -1;
		   }
		   super.setYSpeed(ySpd + adder);
	   }
}

