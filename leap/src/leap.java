

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class leap {

	public static void main(String[] args) throws IOException
	{
		int year;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a year");
		year = Integer.parseInt(in.readLine());
	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("leap year");
	      else
	         System.out.println("not a leap year");

	}

}