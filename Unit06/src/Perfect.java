//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() {
		setNum(0);
	}
	
	public Perfect(int num) {
		setNum(num);
	}
	
	public void setNum(int num) {
		number = num;
	}

	public boolean isPerfect()
	{
		int sum = 0;
		int num = 1;
		
		while(num<number) { 
			if(number%num==0)
				sum = sum + num;
			num++;
		}
		if(sum==number)
			return true;
		return false;
	}

	public String toString() {
		if(isPerfect())
			return ""+ number + " is perfect." + "\n";
		return ""+ number + " is not perfect." + "\n";
	}
	
}