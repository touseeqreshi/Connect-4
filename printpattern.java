
public class printpattern 
{
	public static void printPattern(String[][] f)
	  {

	    for (int i =0;i<f.length;i++)
	    {

	      for (int j=0;j<f[i].length;j++)
	      {

	        System.out.print(f[i][j]);
	      }

	      System.out.println();
	    }
	  }

}
