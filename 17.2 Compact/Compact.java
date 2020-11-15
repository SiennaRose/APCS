import chn.util.*;
/**
 * Write a description of class Compact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compact
{ 
	private final int MAX = 101; 
    private int[] copy = new int[MAX];
	private int cell = 0;  
    
    
    /**
     * constructor Compact - copies numbers from txt file into another array
     */
    public Compact(FileInput inFile)
    {
        while(inFile.hasMoreTokens())
        {
			copy[cell] = inFile.readInt(); 
			cell++; 
        }
		
		before(copy); 
		
		eliminate(copy); 
    }
    
    /**
     * moves cells with 0 to the back 
     */
    public void eliminate(int[] copy)
    {
		int hold, end = 0;
		for(int pass = 0; pass < cell; pass++)		
			for(int i = 0; i < cell; i++)
				if(copy[i] == 0)
				{
					hold = copy[i];
					copy[i] = copy[i+1];
					copy[i+1] = hold;
				} 

		for(int check = 0; check < cell; check++)
			if(copy[check] == 0)
				end++; 		
	
		System.out.print("\nAfter:   ");
		for(int y = 0; y < (cell - end); y++)
			System.out.print(copy[y] + ",   "); 
				
    }

	/**
	* prints to screen original input from file
	*/
	public void before(int[] copy)	
	{
		System.out.print("Before:  "); 
		for(int x = 0; x < cell; x++)
			System.out.print(copy[x] + ",   "); 
		System.out.println(); 
	}
}
