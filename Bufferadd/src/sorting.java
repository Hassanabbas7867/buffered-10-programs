

	import java.io.*;

	public class sorting {

	          public static void main(String[] args) throws Exception

	        {

	            int num;

	            String temp;

	            InputStreamReader u = new InputStreamReader(System.in);
		      	BufferedReader sort = new BufferedReader(u);

	            System.out.print("Enter names you want to enter:");

	            num = Integer.parseInt(sort.readLine());

	            String names[] = new String[num];

	            
	            BufferedReader sort1 = new BufferedReader(u);

	            System.out.println("Enter all the names:");

	            for(int i = 0; i < num; i++)

	            {

	                names[i] = sort1.readLine();

	            }

	            for (int i = 0; i < num; i++) 

	            {

	                for (int j = i + 1; j < num; j++) 

	                {

	                    if (names[i].compareTo(names[j])>0) 

	                    {

	                        temp = names[i];

	                        names[i] = names[j];

	                        names[j] = temp;

	                    }

	                }

	            }

	            System.out.print("Names in Sorted Order:");

	            for (int i = 0; i < num - 1; i++) 

	            {

	                System.out.print(names[i] + ",");

	            }

	            System.out.print(names[num - 1]);

	        }

	    }



