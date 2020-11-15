import chn.util.*; 

/**
 * class Squeeze - creates an input and output file and passes them to Spaces to squeeze text
 * 
 * @author Sienna Sacramento 
 * @version 1
 */
public class Squeeze
{
    public static void main(String[] args)
    {
        FileInput inFile = new FileInput("before1.txt");
        FileOutput outFile = new FileOutput("after.txt"); 
   
        Spaces text = new Spaces(inFile, outFile); 
    }
}
