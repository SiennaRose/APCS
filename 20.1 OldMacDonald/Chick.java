import java.util.Random; 
/**
 * Lab 20.1 OldMacDonald
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * 15 December 2016
 */
public class Chick implements Animal 
{
     /**myType is a String initilaization*/
     private String myType;
     /**mySound and mySound2 is a String initilaization*/
     private String mySound, mySound2;
     
     /**
      * <b>constructor</b>: initializes myType and mySound. In addition, if a second sound string 
      * was not passed, then the mySound2 String gets an empty String
      */
     Chick(String type, String sound)
     {
         myType = type;
         mySound = sound;
         mySound2 = ""; 
     }
     
     /**
      * <b>constructor</b>: initializes myType and mySound. In addition, if a second sound string 
      * was passed, then the mySound2 String gets the sound2 String
      */
     Chick(String type, String sound, String sound2)
     {
         myType = type;
         mySound = sound;
         mySound2 = sound2; 
     }
     
     /**
      * <b>summary<b/>: accessor or modifier method which returns the local String variable, sound.
      * Utilizes the Random() from the java.util.Random library to randomly choose between 
      * mySound and mySound2. Returns whichever sound is randomly choosen, but before that 
      * it determines whether mySound2 has any length at all
      */
     public String getSound()
     {
         String sound = mySound;
         Random rand = new Random(); 
         int die; 
         
         if(mySound2.length() > 0)
         {
             die = rand.nextInt(2); 
             if(die == 1)
                sound = mySound;
             else
                sound = mySound2; 
         }
         
         
         return sound; 
     }
     
     /**
      * <b>summary<b/>: accessor method which returns the myType String of the Chick object
      */
     public String getType()
     {
         return myType;
      }
}
