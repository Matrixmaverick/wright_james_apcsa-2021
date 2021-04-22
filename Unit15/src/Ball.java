//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;
	private Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.pink};

	//constructors
	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y)
	{
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei)
	{
		super(x, y, wid, hei);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei, Color col)
	{
		super(x, y, wid, hei, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei, Color col, int xS, int yS)
	{
		super(x, y, wid, hei, col);
		xSpeed = xS;
		ySpeed = yS;
	}
	
    //add the set methods
   
	public void setXSpeed(int xS)
	{
		xSpeed = xS;
	}
    public void setYSpeed(int yS)
    {
	   ySpeed = yS;
    }
    public void setAll(int x, int y, int wid, int hei, Color col, int xS, int yS)
    {
	   super.setPos(x, y);
	   super.setDimensions(wid, hei);
	   super.setColor(col);
	   xSpeed = xS;
	   ySpeed = yS;
    }

    
    public void moveAndDraw(Graphics window)
    {
 	   //draw a white ball at old ball location
 	   draw(window, Color.white);

 	   setX(getX()+xSpeed);
 	   //setY
 	   setY(getY()+ySpeed);
 	   
 	   //draw the ball at its new location
 	   draw(window, super.getColor());
    }
    
 	public boolean equals(Object obj)
 	{
 		Ball other = (Ball)obj;
 		if(super.equals(other) && xSpeed == other.xSpeed && ySpeed == other.ySpeed)
 		{
 			return true;
 		}
 		return false;
 	}
 	
   //add the get methods
 	public int getXSpeed()
	{
		return xSpeed;
	}
	public int getYSpeed()
	{
		return ySpeed;
	}
	
   //add a toString() method
	public String toString()
	{
		return super.toString() + " " + xSpeed + " "+ ySpeed;
	}
	
	
	public void changeColor()
	{
		super.setColor(colors[randInt(0, colors.length-1)]);
	}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}