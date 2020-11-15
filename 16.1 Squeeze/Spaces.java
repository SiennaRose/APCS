import apcslib.*; 
import chn.util.*; 

/**
 * class Spaces - determines the number of spaces and reutrns thema , along with the text, with
 * a number amount
 * 
 * @author sienna Sacramemto  
 * @version 1
 */
public class Spaces
{
    /**
     * constructor Spaces - determines the amount of spaces in a line from a text document and 
     * replaces them with a number amount  
     */
    
   public Spaces(FileInput inFile, FileOutput outFile)
   {
       int blanks; 
       String line; 
       
       while(inFile.hasMoreLines())
       {
           line = inFile.readLine();
           blanks = 0; 
           if(line.length() > 0)
           {
               while(line.charAt(blanks) == ' ')
               {
                   blanks++; 
                }
           
               outFile.println(Format.left(blanks, 2) + line.substring(blanks)); 
               System.out.println(Format.left(blanks, 2) + line.substring(blanks));
           }
           else
                if(line.length() == 0)
                {
                    outFile.println(Format.left(0, 2)); 
                    System.out.println(Format.left(0, 2));
                }
                  
       }
       
       outFile.close(); 
   }
}
