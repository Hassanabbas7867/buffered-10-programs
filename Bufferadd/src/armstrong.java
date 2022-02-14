
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class armstrong{

	public static void main(String[] arg) throws IOException
	{
	int a,arm=0,num,temp;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
    num= Integer.parseInt(in.readLine());
	temp=num;
	while(num!=0)
	{
		a=num%10;
		arm=arm+(a*a*a);
		num=num/10;
	}
	if(arm==temp)
	System.out.println(temp+" is an armstrong number ");
	else
	System.out.println(temp+" is not an armstrong number ");
}
}