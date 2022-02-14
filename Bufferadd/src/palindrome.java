

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class palindrome {

	  public static void main(String[] args) throws IOException 
	  {
	    System.out.println("Enter a string");
	    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	    String inputString = BR.readLine();
	    StringBuffer SB = new StringBuffer(inputString);
	    SB.reverse();
	    String newString = SB.toString();
	    if(newString.equalsIgnoreCase(inputString))
	      System.out.println(inputString + " is a Palindrome");
	    else
	      System.out.println(inputString + " is not a Palindrome");
	  }

	}

