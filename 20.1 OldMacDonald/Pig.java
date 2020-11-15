
/**
 * Lab 20.1 OldMacDonald
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * 15 December 2016
 */
public class Pig implements Animal
{
     /**myType is a String initilaization*/
     private String myType;
     /**mySound is a String initilaization*/
     private String mySound;
     
     /**
      * <b>constructor</b>: initializes myType and mySound
      */
     Pig(String type, String sound)
     {
         myType = type;
         mySound = sound;
     }
     
     /**
      * <b>summary:<b/> accessor method which returns the mySound String of the Cow object 
      */
     public String getSound()
     {
         return mySound;
     }
     
     /**
      * <b>summary<b/>: accessor method which returns the myType String of the Cow object
      */
     public String getType()
     {
         return myType;
     }
}
