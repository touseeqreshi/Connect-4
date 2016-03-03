  

public class connect4
{
  //First we need to create the basic visual pattern
 
  public static String[][] createPattern()
  {
    //the game is more like a table of 6 columns and 6 rows
	
	//we're going to have to make a 2D array of 7 rows 

     String[][] f = new String[7][15];

    //Time to loop over each row from up to down

    for (int i = 0; i < f.length; i++)
    {      
       for (int j = 0; j < f[i].length; j++)
      {
        if (j % 2 == 0) f[i][j] ="|";

        else f[i][j] = " ";
 
        if (i==6) f[i][j]= "-";
      }      
    }
    return f;
  }
}