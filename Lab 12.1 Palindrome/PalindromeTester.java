import chn.util.*; 

/**
 * class PalindromeTester - driver class to the Palindrome class
 * creates a new Palindrome object and passes it a String inputed from the user. 
 * It gets back a boolean value which tells whether the string was a Palindrome or not.
 * This is basically a palindromeTester. 
 * 
 * @author Sienna Sacramento  
 * @version 1
 */

public class PalindromeTester
{
   public static void main(String[] args)
   {
       //declaring variables
       ConsoleIO keyboard = new ConsoleIO(); 
       Palindrome words; 
       String pal = ""; 
       boolean isGood;
       boolean loopy = true; 
       
       //introductions
       System.out.println("Welcome to the Palindrome Program!"); 
       
       while(loopy)
       {
          //prompting user
           System.out.print("\nEnter a new string: ");
          pal = keyboard.readLine();  
          
          if((pal.charAt(0) == 'q') || (pal.charAt(0) == 'Q') && (pal.length() ==  1))
                loopy = false; 
          else
              if(loopy)
              {
                  words = new Palindrome(pal); 
          
                   
                  isGood = words.checking(); 
                  
                  //displaying output
                  if(isGood)
                      System.out.println("Yes, the string you entered is a plaindrome.");
                  else
                      System.out.println("No, the string you enterd is NOT a plaindrome."); 
          }
       }
   }
}
