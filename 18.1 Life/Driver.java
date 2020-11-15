import chn.util.*; 
/**
 * Sienna Sacramento 
 * Mr. Lansberger
 * APCS: Period 3
 * Nov. 30, 2016
 */
public class Driver
{
    /**
     * Driver class - reads in life100.txt and passes to Life class where it undergoes 
     * the game of life
     */
   public static void main(String[] args)
   {
       String fileName = "life100.txt"; 
       FileInput inFile = new FileInput(fileName); 
       Life firstGen = new Life(inFile); 
   }
}
