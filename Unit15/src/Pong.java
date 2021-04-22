//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private String str1;
	private String str2;
	public static int left;
	public static int right;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(200, 200, 10, 10, Color.green, 2, 2);
		leftPaddle = new Paddle(10, 20, 10, 100, Color.black, 5);
		rightPaddle = new Paddle(780, 20, 10, 100, Color.black, 5);
		keys = new boolean[4];

    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   	paint(window);
	   	str1 = "Left Score: " + left;
	   	str2 = "Right Score: " + right;
	   	window.drawString(str1, 50, 50);
	   	window.drawString(str2, 650, 50);
	   	ball.moveAndDraw(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		render(graphToBack);
		twoDGraph.drawImage(back, null, 0, 0);
   }

   public void render(Graphics window) 
   {
	    leftPaddle.draw(window, Color.black);
	    rightPaddle.draw(window, Color.black);
	    
	    //see if ball hits left wall or right wall
	 	if(!(ball.getX()>=10))
	 	{
	 		ball.setXSpeed(0);
	 		ball.setYSpeed(0);
	 		right++;
	 		ball.setAll(700, 500, 10, 10, Color.green, -2, -2);
	 	}
	 
	 	if(!(ball.getX()<=780)) 
	 	{
	 		ball.setXSpeed(0);
	 		ball.setYSpeed(0);
	 		left++;
	 		ball.setAll(200, 200, 10, 10, Color.green, 2, 2);
	 	}
	 		
	 	//see if the ball hits the top or bottom wall 
	 	if(ball.getY()<0 || ball.getY()>570)
	 	{
	 		ball.setYSpeed(-ball.getYSpeed());
	 	}

	 	//see if the ball hits the left paddle
	 	if ((ball.getX()<=leftPaddle.getX()) && ((leftPaddle.getY()<=ball.getY()) && 
	 			(ball.getY()<=leftPaddle.getY() + leftPaddle.getHeight())))
	 	{
	 		ball.setXSpeed(-ball.getXSpeed());
	 		ball.changeColor();
	 	}
	 		
	 	//see if the ball hits the right paddle
	 	if ((ball.getX()>=rightPaddle.getX()) && ((rightPaddle.getY()<=ball.getY()) && 
	 			(ball.getY()<=rightPaddle.getY() + rightPaddle.getHeight())))
	 	{
	 		ball.setXSpeed(-ball.getXSpeed());
	 		ball.changeColor();
	 	}

	 	//see if the paddles need to be moved
	 	if (keys[0] == true) {
	 		leftPaddle.moveUpAndDraw(window);
	 	}
	 	if (keys[1] == true) {
	 		leftPaddle.moveDownAndDraw(window);
	 	}
	 	if (keys[2] == true) {
	 		rightPaddle.moveUpAndDraw(window);
	 	}
	 	if (keys[3] == true) {
	 		rightPaddle.moveDownAndDraw(window);
	 	}	   
    }

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
	public void run()
	{
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
           repaint();
        }
      }catch(Exception e)
      {
      }
  	}	
}