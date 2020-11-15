import chn.util.*; 
import apcslib.*; 

/**
 * class Average - reads in the from a txt document several numbers. It then creates a new file with 
 * the mean average of those numbers. 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */
public class Average
{
    public static void main(String[] args)
    {
        String fileName = "numbers.txt";
        String mean = "mean.txt"; 
        FileInput inFile = new FileInput(fileName); 
        FileOutput outFile = new FileOutput(mean); 
        long total = 0;
        long count = 0; 
        
        while(inFile.hasMoreLines())
        {
           total += inFile.readInt();
           count++; 
        }
        inFile.close(); 
        
        outFile.println("The mean average is " + Format.right((double)total/count, 2, 2)); 
        outFile.close(); 
    }
}
