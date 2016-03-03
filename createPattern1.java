
public class createPattern1 
{
	public static void main (String[] args)
	  {

	    String[][] f = createPattern();

	    boolean loop = true;

	    //We need something to keep track of whose turn it is

	    int count = 0;

	    printPattern(f);

	    while(loop)
	    {

	       //Let's say that Red gets the first turn and thus every other turn then

	       if (count % 2 == 0) dropRedPattern(f);

	       else dropbluePattern(f);

	       count++;//We need to keep track of the turns

	       printPattern(f);

	       //check for a winner during every turn 

	       if (checkWinner(f) != null)
	       {

	          if (checkWinner(f) == "R")

	             System.out.println("The red player won.");

	          else if (checkWinner(f)== "B")

	            System.out.println("The Blue player won.");

	         loop = false;

	    }

	  }

	}

	private static String[][] createPattern() {
		// TODO Auto-generated method stub
		return null;
	}

	private createPattern1() {
		// TODO Auto-generated method stub
		return;
	}

	private static Object checkWinner(String[][] f) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void dropbluePattern(String[][] f) {
		// TODO Auto-generated method stub
		
	}

	private static void dropRedPattern(String[][] f) {
		// TODO Auto-generated method stub
		
	}

	private static void printPattern(String[][] f) {
		// TODO Auto-generated method stub
		
	}

	}
