
/**
 * Lab 20.1 OldMacDonald
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * 15 December 2016
 */
public class OldMacDonald
{
    /**
     * <b>driver class</b> - declares a Cow, Chick, Pig, and Farm class
     * prints to screen their type and sound
     * calls Farm's animalSounds() method 
     */
    public static void main(String[] args)
    {
        Cow c = new Cow("cow", "moo"); 
        Chick ch = new Chick("chick", "cluck"); 
        Pig p = new Pig("pig", "oink");
        Farm f = new Farm(); 
        
        System.out.println(c.getType() + " goes " + c.getSound()); 
        System.out.println(ch.getType() + " goes " + ch.getSound()); 
        System.out.println(p.getType() + " goes " + p.getSound()); 
        
        System.out.println(); 
        
        f.animalSounds(); 
    }
}
