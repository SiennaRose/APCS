import chn.util.*; 
/**
 * class ShorthandTester - works with the shorthand class to make a code which gets
 * converted into a shorthand message
 * 
 * @author Sienna Sacramento  
 * @version 1
 */

public class ShorthandTester
{
    public static void main(String args[])
    {
        //delcaring variables
        boolean loopy = true;
        String input; 
        ConsoleIO keyboard = new ConsoleIO(); 
        Shorthand code; 
        
        //introductions
        System.out.println("Welcome to the Shorthand Generator!"); 
        
        while(loopy)
        {
            System.out.print("\nEnter a message: "); 
            input = keyboard.readLine(); 
            
            code = new Shorthand(input); 
            
            if(input.charAt(0) == 'q' || input.charAt(0) == 'Q')
                loopy = false; 
            
        }
    }
}
