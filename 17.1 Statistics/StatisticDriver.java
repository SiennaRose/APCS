 import chn.util.*;

/**
 * class StatisticDriver - reads in a txt doc and passes it to the statistics class
 * 
 * @author Sienna Sacramento
 * @version 1
 */
public class StatisticDriver
{
    /**
     * reads in a txt doc and passes it to the statistics class
     * where the numbers within the file are analized to determine
     * average, standard deviation, and mode
     */
    public static void main(String[] args)
    {
        String fileName = "numbers.txt";
        FileInput inFile = new FileInput(fileName);
        Statistics stat = new Statistics(inFile, fileName); 
    }
}
