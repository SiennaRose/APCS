
/**
 * Lab 20.1 OldMacDonald
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * 15 December 2016
 */
public class Farm
{
    /**Animal is an ArrayList declaration with three elements*/
    private Animal[] a = new Animal[3]; 
    
    /**
     * <b>constructor:<b/> initializes the 3 elements in the Animal ArrayList with objects
     * NamedCow, Chick, and Pig. Each object ascribes to the protocols in the Animal interface. 
     * !!CAUTION!! Animal interface and Animal ArrayList are not to be confused for each other
     */
    Farm()
    {
        a[0] = new NamedCow("cow", "Elsie",  "moo"); 
        a[1] = new Chick("chick", "cheep", "cluck");
        a[2] = new Pig("pig", "oink"); 
    }
    
    /**
     * <b>summary:</b> traverses through Animal ArrayList and prints to screen each object's
     * type and sound. In addition, it prints to screen the name of the NamedCow object 
     */
    public void animalSounds()
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i].getType() + " goes " + a[i].getSound()); 
        }
        System.out.println("The cow is known as " + ((NamedCow)a[0]).getName()); 
    }
}
