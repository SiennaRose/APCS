/**
 * Lab 20.1 OldMacDonald
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * 15 December 2016
 */
public class NamedCow extends Cow
{
   /**myCowName is a String initilaization*/
   private String myCowName; 
    
    /**
    * <b>constructor</b>: uses super class Cow to initialize object's type and sound which is passed
    * thorugh the super() keyword.
    * Initializes myCowName. 
    */
   NamedCow(String type, String cowName, String sound)
   {
       super(type, sound); 
       myCowName = cowName; 
   }
   
   /**
    * <b>summary:<b/> accessor method which returns the myCowName String of the NamedCow object 
    */
   public String getName()
   {
       return myCowName; 
   }
}
