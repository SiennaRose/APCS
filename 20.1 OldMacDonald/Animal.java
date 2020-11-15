
/**
 * Lab 20.1 OldMacDonald
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * 15 December 2016
 */
public interface Animal
{
    /**
     * <b>summary<b/>: this is an interface method and acts a protocal method for any classes
     * which ascribe to it through the implements keyword. All ascribed classes must have this method.
     * Sets future guidelines that a String will be returned from this method. 
     * Most likely an accessor method returning a sound based String
     */
    public String getSound();
    
    /**
     * <b>summary<b/>: this is an interface method and acts a protocal method for any classes
     * which ascribe to it through the implements keyword. All ascribed classes must have this method.
     * Sets future guidelines that a String will be returned from this method. 
     * Most likely an accessor method returning a type based String
     */
    public String getType();
}
