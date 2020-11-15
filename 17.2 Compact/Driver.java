import chn.util.*;
/**
 * class Driver - opens file compact and sends list of numbers to compact class to remove 0's from 
 * array 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */
public class Driver
{
    /**
     * reads in a txt documetn and sends array of numbers to compact class where the o's within the 
     * array will be removed
     */
    public static void main(String[] args)
    {
        String fileName = "compact.txt"; 
        FileInput inFile = new FileInput(fileName); 
        Compact remove = new Compact(inFile); 
    }
}
