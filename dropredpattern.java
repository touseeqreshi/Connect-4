import java.util.Scanner;

public class dropredpattern 
{
	 public static void dropRedPattern(String[][] f)
	  {

	    //We need to ask user which column he wants to drop a red into

	    System.out.println("Drop a red disk at column (0–6): ");

	    @SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);

	    int c = 2*scan.nextInt()+1;

	    //we have to loop over each row from the bottom to the top

	    //till we find the first empty space, drop, and then finish

	    for (int i =5;i>=0;i--)
	    {

	      if (f[i][c] == " ")
	      {

	        f[i][c] = "R";

	        break;

	      }

	    }

	  }
}
