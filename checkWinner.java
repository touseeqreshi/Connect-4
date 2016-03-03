
public class checkWinner 
{
	 public checkWinner(String[][] f)
	  {
	    //look for the first type of winning line, a horizontal line

	    for (int i = 0; i < 6; i++)
	    {

	      for (int j = 0; j < 7; j += 2)
	      {

	        if ((f[i][j+1] != " ")

	        && (f[i][j+3] != " ")
	        
	        && (f[i][j+5] != " ")

	        && (f[i][j+7] != " ")

	        && ((f[i][j+1] == f[i][j+3])

	        && (f[i][j+3] == f[i][j+5])

	        && (f[i][j+5] == f[i][j+7])))

	        //If we found a same-colored pattern, we'll return the color so that we will know who won.

	          return; 
	      }

	    }

	    //Now, let's first loop over each odd-numbered column by incrementing with 2

	    //and check for consecutive boxes in the same column that are the same color

	    for (int i=1;i<15;i+=2)
	    {

	      for (int j =0;j<3;j++)
	      {

	            if((f[j][i] != " ")

	            && (f[j+1][i] != " ")

	            && (f[j+2][i] != " ")

	            && (f[j+3][i] != " ")

	            && ((f[j][i] == f[j+1][i])

	            && (f[j+1][i] == f[j+2][i])

	            && (f[j+2][i] == f[j+3][i])))

	              return; 
	      } 

	    }

	    //For the left-up to right-down diagonal line

	    //We'll have to loop over the 3 uppermost

	    //rows and then go from left to right column-wise

	    for (int i = 0; i < 3; i++)
	    {

	      for (int j = 1; j < 9; j += 2)

	      {

	            if((f[i][j] != " ")

	            && (f[i+1][j+2] != " ")

	            && (f[i+2][j+4] != " ")

	            && (f[i+3][j+6] != " ")

	            && ((f[i][j] == f[i+1][j+2])

	            && (f[i+1][j+2] == f[i+2][j+4])

	            && (f[i+2][j+4] == f[i+3][j+6])))

	              return; 
	      } 

	    }

	    //Similar to the method above, but we're just reversing

	    for (int i = 0; i < 3; i++)

	    {
	      for (int j = 7; j < 15; j += 2)

	      {

	            if((f[i][j] != " ")

	            && (f[i+1][j-2] != " ")

	            && (f[i+2][j-4] != " ")
	            
	            && (f[i+3][j-6] != " ")

	            && ((f[i][j] == f[i+1][j-2])

	            && (f[i+1][j-2] == f[i+2][j-4])

	            && (f[i+2][j-4] == f[i+3][j-6])))

	              return; 
	      } 

	    }

	    //If after going over the table and we didn't find a winning color

	    return;
	  }

}
