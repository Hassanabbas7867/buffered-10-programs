import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class bufferedadd {
    public static void main(String args[]) throws IOException
    {

        int num1, num2, sum;

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.print("Enter two numbers:");
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());

        sum = num1 + num2;

        System.out.println("Sum is:" + sum);

    }
}
