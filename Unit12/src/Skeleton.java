//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	String name = "";
	int size = 0;

	//add a constructor
	public Skeleton(String n, int s) {
		setName(n);
		setSize(s);
	}
	
	public void setSize(int s) {
		size = s;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getHowBig() {
		return size;
	}
	
	public String getName() {
		return name;
	}

	//add code to implement the Monster interface
	public boolean isBigger(Monster other) {
		boolean output = true;
		if(size>other.getHowBig()) {
			output = true;
		} else { 
			output = false;
		}
		return output;
	}
	
	public boolean isSmaller(Monster other) {
		boolean output = true;
		if(size<other.getHowBig()) {
			output = true;
		} else { 
			output = false;
		}
		return output;
	}
	
	public boolean namesTheSame(Monster other) {
		boolean output = true;
		if(name.equals(other.getHowBig())) {
			output = true;
		} else { 
			output = false;
		}
		return output;
	}

	//add a toString
	public String toString() {
		return name + " " + size;
	}
}