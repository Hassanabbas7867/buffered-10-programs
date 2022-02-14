
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class multiplication {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		 
		        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		        System.out.println("Enter a Number: ");
		        int number=Integer.parseInt(br.readLine());
		            for(int j=1; j<=10;j++)
		            {
		                System.out.println(number+ "*" +j+ "="  +number*j );
		            }
		 
		    }
}