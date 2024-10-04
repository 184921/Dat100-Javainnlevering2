package no.hvl.dat100.tabeller;

public class Tabeller {
	

    public static void skrivUt(int[] tabell) 
	{
		for (int i = 0; i < tabell.length; i++) 
		{
			System.out.println(tabell[i]);
		}
	}

	// b)
    public static String tilStreng(int[] tabell) 
	{
		String printTabell = "[";
		
		for (int i = 0; i < tabell.length; i++)
		{
			printTabell += tabell[i];
			
			if (i < tabell.length - 1) 
			{
				printTabell += ",";
			}
		}
	
		
		printTabell += "]";
		
		return printTabell;
	}

	// c)
	public static int summer(int[] tabell)
	{
		int sum = 0;
		for (int i = 0; i < tabell.length; i++)
		{
			sum += tabell[i];
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall)
	{
		boolean verdi = false;
		
		for (int i = 0; i < tabell.length; i ++) 
		{
			
			if (tabell[i] == tall) 
			{
				verdi = true;
			}
		}
		
		return verdi;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) 
	{
		int verdi = 0;
		
		for (int i = 0; i < tabell.length; i++)
		{
			if(tabell[i] == tall)
			{
				verdi = i;
				break;
			}
			else
			{
				verdi = -1;
			}
		}
		
		return verdi;
	}

	// f)
	public static int[] reverser(int[] tabell) 
	{
		int resultat[] = new int [tabell.length];
		
		for (int i = 0; i < tabell.length; i++)
		{
			resultat[i] = tabell[tabell.length - i - 1];
		}
		
		return resultat;
	}

	// g)
	public static boolean erSortert(int[] tabell) 
	{
		boolean sortert = true;
		
		for (int i  = 0; i < (tabell.length - 1); i++)
		{
			if (tabell[i] > tabell[i + 1])
			{
				sortert = false;
			}
		}
		
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) 
	{
		int nyTabell[] = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) 
		{
	        nyTabell[i] = tabell1[i];
	    }

	    for (int i = 0; i < tabell2.length; i++) 
	    {
	        nyTabell[tabell1.length + i] = tabell2[i];
	    }
		
		return nyTabell;

	}
}
