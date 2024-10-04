package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) 
	{
		for (int[] rad : matrise) 
		{
	        for (int element : rad) 
	        {
	            System.out.print(element + " ");
	        }
	        
	        System.out.println();
	    }
	}

	// b)
	public static String tilStreng(int[][] matrise)
	{
		StringBuilder resultat = new StringBuilder();

	    for (int[] rad : matrise) 
	    {
	        for (int element : rad) 
	        {
	            resultat.append(element).append(" ");
	        }
	        resultat.append("\n");
	    }

	    return resultat.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) 
	{
		  int rows = matrise.length;
		  int cols = matrise[0].length;
		  int[][] nyMatrise = new int[rows][cols];

		  for (int i = 0; i < rows; i++) 
		  {
		      for (int j = 0; j < cols; j++) 
		      {
		    	  nyMatrise[i][j] = matrise[i][j] * tall;
		      }
		  }

		  return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) 
	{
	    if (a.length != b.length) 
	    {
	        return false;
	    }

	    for (int i = 0; i < a.length; i++) 
	    {
	        if (a[i].length != b[i].length)
	        {
	            return false;
	        }
	    }

	    for (int i = 0; i < a.length; i++)
	    {
	        for (int j = 0; j < a[i].length; j++)
	        {
	            if (a[i][j] != b[i][j]) 
	            {
	                return false;
	            }
	        }
	    }

	    return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
