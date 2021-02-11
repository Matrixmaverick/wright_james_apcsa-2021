//(c) A+ Computer Science
//www.apluscompsci.com
//Name - James Wright
//Date - 2/9/21


public class FirstLastVowel
{
	
   public static String go( String a )
	{
	   String a1 = ("a");
	   String a2 = ("e");
	   String a3 = ("i");
	   String a4 = ("o");
	   String a5 =("u");
	   String a6 =("A");
	   String a7 =("E");
	   String a8 =("I");
	   String a9 =("O");
	   String a10 =("U");
	   String first = a.substring(0, 1);
	   String last = a.substring(a.length() - 1);
	   
	   if ((first.equals(a1)||(first.equals(a2))||(first.equals(a3))||(first.equals(a4))||(first.equals(a5))||(first.equals(a6))||(first.equals(a7))||(first.equals(a8))||(first.equals(a9))||(first.equals(a10)))) {
		  return "yes";
	   } else if ((last.equals(a1)||(last.equals(a2))||(last.equals(a3))||(last.equals(a4))||(last.equals(a5))||(last.equals(a6))||(last.equals(a7))||(last.equals(a8))||(last.equals(a9))||(last.equals(a10)))) {
		  return "yes";
	   } else {
		  return "no";
	   }
	}
}