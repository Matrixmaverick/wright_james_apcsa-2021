//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed =5;
   }

   //add the other Paddle constructors

   public Paddle(int x, int y) {
	   super(x, y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int wid, int hgt) {
	   super(x, y, wid, hgt);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int wid, int hgt, Color c) {
	   super(x, y, wid, hgt, c);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int wid, int hgt, int spd) {
	   super(x, y, wid, hgt);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int wid, int hgt, Color c, int spd) {
	   super(x, y, wid, hgt, c);
	   speed = spd;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() - speed);
	   draw(window, super.getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() + speed);
	   draw(window, super.getColor());
   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
	   return super.toString() + " " + speed;
   }
}