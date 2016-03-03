import java.util.Scanner;

public class dropbluePattern 
{
	 public dropbluePattern(String[][] f)
	  {

	    System.out.println("Drop a Blue disk at column (0–6): ");

	    @SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);

	    int c = 2*scan.nextInt()+1;

	    for (int i =5;i>=0;i--)
	    {

	      if (f[i][c] == " ")
	      {

	        f[i][c] = "B";

	        break;

	      }
	       
	    }

	  }
}
