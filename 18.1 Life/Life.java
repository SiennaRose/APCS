import chn.util.*; 
import apcslib.*;

/**
 * Sienna Sacramento 
 * Mr. Lansberger
 * APCS: Period 3
 * November 30, 2016
 */
public class Life
{
    private final int MAX = 22; 
    private final int SIZE = 20; 
    private int[][] live; 
    private int[][] copy; 
    
    /**
     * constructor Live - initializes live matrix
     */
    Life(FileInput inFile)
    {
        live = new int[MAX][MAX]; 
        copy = new int[MAX][MAX]; 
        int howManyBacteria = inFile.readInt(); 
        int row = 0; 
        int col = 0; 
        
        for(int x = 1; x <= howManyBacteria; x++)
        {
            row = inFile.readInt(); 
            col = inFile.readInt(); 
            live[row][col] = 1; 
        }
                
        for(int loop = 1; loop <= 5; loop++)
        {
            doOver();
            traversal(); 
        }
        
        printLive(); 
    }
    
    /**
     * <b>summary</b>: copies data from live matrix into copy
     */
    public void doOver()
    {
        for(int row = 1; row <= SIZE; row++)
            for(int col = 1; col <= SIZE; col++)
                copy[row][col] = live[row][col]; 
    }
    
    /**
     * <b>summary</b>: traverses through copy matrix and passes location of elements both with
     * and without life
     * calls check
     */
    public void traversal()
    {
        for(int row = 1; row <= SIZE; row++)
            for(int col = 1; col <= SIZE; col++)
                check(row, col); 
    }
    
    /**
     * <b>summary</b>: checks neighbors of element location passed from traversal. 
     * living neighboors are totaled and total is passes to change. 
     * calls nextGen()
     */
    private void check(int row, int col)
    {
       int total = 0; 
       
       for(int rowN = row -1; rowN <= (row + 1); rowN++)
            for(int colN = col -1; colN <= (col + 1); colN++)
                    total += copy[rowN][colN]; 
       
       total -= copy[row][col];              
                    
       nextGen(row, col, total); 
    }
    
    /**
     * <b>summary</b>: accepts the location of the element and the total of life around it.
     * Determines whether the location lives or dies according to the rules
     * total == 3 = birth
     * total <= 1 = death "loneliness"
     * total >= 4 = death "overcrowding"
     * total == 2 || total == 3 = no change 
     */
    public void nextGen(int row, int col, int total)
    {
        int current = live[row][col];
        
        if(total == 3)
            live[row][col] = 1; 
        else
            if((total <= 1) || (total >= 4))
                live[row][col] = 0; 
    }
    
    /**
     * <b>summary</b>: prints what the petri dish looks like
     * any element with a 1 is alive any w/ a 0 is not
     * calls row10(), col10(), and livingOrganisms() at end
     */
    public void printLive()
    {
        int total = 0; 
        
        System.out.print("\t");
        for(int x = 1; x <= 3; x++)
            for(int z = 0; z <= 9; z++)
                if((x == 1) && (z == 0))
                {
                    z = 1; 
                    System.out.print(z); 
                }
                else
                    if((x == 3) && (z < 1))
                        System.out.print(z); 
                     else
                        if(x != 3)
                            System.out.print(z); 
        
        System.out.println("\n"); 
                    
        for(int row = 1; row <= SIZE; row++)
        {
            System.out.print(row + "\t"); 
            for(int col = 1; col <= SIZE; col++)
                  if(live[row][col] == 0)
                    System.out.print(" ");
                else
                {
                    System.out.print("*"); 
                    total++; 
                }
            System.out.println(); 
        }  
        
        row10(); 
        col10(); 
        livingOrganisms(total); 
    }

    /**
     * <b>summary</b>: prints to screen how many organisms are alive
     * int row 10
     * called by printLive()
     */
    public void row10()
    {
        //traverses col 10 and counts how many cell have 1
        int count = 0; 
        
        for(int col = 1; col <= SIZE; col++)
          if(live[10][col] == 1)
              count++; 
        System.out.println("\nNumber in Row 10 ---> " + count); 
    }
    
    /**
     * <b>summary</b>: prints out to screen how many organisms are alive
     * in col 10
     * called by printLive()
     */
    public void col10()
    {
       //traverses row 10 and counts how many cell have 1
       int count = 0; 
        
       for(int row = 1; row <= SIZE; row++)
          if(live[row][10] == 1)
              count++; 
        System.out.println("\nNumber in Column 10 ---> " + count);  
    }
    
    /**
     * <b>summary</b>: prints out to screen how many organisms are alive total.
     * accepts argumant passed from printLive()
     */
    public void livingOrganisms(int total)
    {
        System.out.println("\nNumber of living organisms ---> " + total);
    }
}
