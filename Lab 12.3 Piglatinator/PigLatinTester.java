import chn.util.*;
/**
 * class PigLatinTester - a driver class for the Piglatinator class
 * 
 * @author Sienna Sacramento
 * @version 1
 */

public class PigLatinTester
{
    public static void main(String[] args)
    {
        //declaring variables
        boolean loopy = true; 
        String input, repeat = "y";
        ConsoleIO keyboard = new ConsoleIO(); 
        Piglatinator pig; 
        
        //introductions
        System.out.println("I can translate English sentences and phrases into Pig Latin.");
        
        while((repeat.equals("y")) || (repeat.equals("Y")))
        {
            //prompting user and getting input
            System.out.print("Please type an English sentences or phrase and then press <Enter>.");
            System.out.print("\n> "); 
            input = keyboard.readLine(); 
            
            System.out.print("\nIn Pig Latin that would be: \n> "); 
            //passing input to worker class
            pig = new Piglatinator(input); 
            
            //prompting user 
            System.out.print("\n\nWould you like to translate another phrase? ");
            repeat = keyboard.readLine();
            System.out.print("\n"); 
                
        }
    }
}
