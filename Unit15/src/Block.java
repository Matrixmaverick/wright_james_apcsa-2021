//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		xPos = x;
		yPos = y;
		width = 0;
		height = 0;
	}
	
	public Block(int x, int y, int wid, int hgt)
	{
		xPos = x;
		yPos = y;
		width = wid;
		height = hgt;
	}
	
	public Block(int x, int y, int wid, int hgt, Color c)
	{
		xPos = x;
		yPos = y;
		width = wid;
		height = hgt;
		color = c;
	}
	
   //add the other set methods

   public void setColor(Color col)
   {
	   color = col;
   }
   
   public void setX(int x) {
	   xPos = x;
   }
   
   public void setY(int y) {
	   yPos = y;
   }
   
   public void setPos(int x, int y) {
	   xPos = x;
	   yPos = y;
   }
   
   public void setDimensions(int wid, int hgt) {
	   width = wid;
	   height = hgt;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block some = (Block)obj;
		if (xPos == some.xPos && yPos == some.yPos && width == some.width && 
				height == some.height && color == some.color) {
			return true;
		}
		return false;
	}   
	
    //add the other get methods
	public int getX()
	{
		return xPos;
	}
	public int getY()
	{
		return yPos;
	}
	public int getWidth()
	{
		 return width;
	}
	public int getHeight()
	{
		 return height;
	}
	public Color getColor()
	{
		 return color;
	}
    

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		 return "(" + xPos + "," + yPos + "," + width + "," + height + "," + color + ")";
	}
}