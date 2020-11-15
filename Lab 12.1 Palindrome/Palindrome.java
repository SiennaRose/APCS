
/**
 * class Palindrome- a class used to determine whether or not 
 * an inputed string is a palindrome. 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */

public class Palindrome
{
    //instance variables
    /** input holds the passed string from the driver class*/ 
    /** clean holds the unpunctuated version of input without white spaces*/
    /** reverse holds clean backwards*/
    private String input, clean = "", reverse = ""; 
    /**isGood returns whether or not clean and reverse are equivalent = a palindrome*/ 
    private boolean isGood = false; 
    
    //constructors
    /**
     *  constructor Palindrome - initializes the string/palindrome
     *  passed to input and sets it to be the lowercase version 
     */
    
    Palindrome(String pal)
    {
        input = pal.toLowerCase(); 
        punctuation();
    }
    
    //methods
    /**
     * <b>summary</b>: goes through inputed string and removes punctuation and white spaces
     * saves result into variable clean
     */
    
    void punctuation()
    {
        char value; 
        
        //stripping inputed string clean of puncuations
        for(int x = 0; x < input.length(); x++)
        {
            value = input.charAt(x); 
            if((value >= 'a') && (value <= 'z'))
                clean += value; 
            else 
                if((value >= '1') && (value <= '9'))
                    clean += value; 
            
        }
        
    }
    
    /**
     * <b>summary</b>: this method reverses the order of the string input. 
     * It then checks to see if the clean variable and the reverse are equivalent.
     * If they are equivalent then the boolean isGood returns as true and false if not 
     * equivalent. 
     */
    
    boolean checking()
    {
        char value; 
  
        for(int x = clean.length() - 1; x >= 0; x--)
        {
            value = clean.charAt(x); 
            if((value >= 'a') && (value <= 'z'))
                reverse += value; 
            else
                if((value >= '1') && (value <= '9'))
                    reverse += value; 
            //System.out.print("\n value =" + value + "\n"); 
        }
        
        if(clean.equals(reverse) && (clean.length() > 1))
            isGood = true; 
        else
            isGood = false; 

        return isGood;
    }
}
