//(c) A+ Computer Science
//www.apluscompsci.com
//Name - James Wright

public class ToyRunner
{
	public static void main(String[]args)
	{
		ball objBall = new ball("ball 4");
		ball objBat = new ball("bat 1");
		
		
		System.out.print(objBall);
		System.out.println(objBall.getType());
		System.out.print(objBat);
		System.out.println(objBat.getType());
	}
}