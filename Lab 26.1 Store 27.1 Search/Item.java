import apcslib.Format; 
/**
 * class Item - creates an Item object that holds the id number of an object and it's 
 * inventory number
 * 
 * @author Sienna Sacramento  
 * @version 1
 */
public class Item implements Comparable
{
    private int myId; private int myInv;
    
     /**
     * Constructor for the Item object
     *
     * @param id identification number of the items
     * @param inv the number of items with that identification number
     */ 
    public Item(int id, int inv)
    {
        myId = id;
        myInv = inv; 
    }
    
    /**
     * Gets the id attribute of the Item object
     *
     * @return The id value
     */ 
    public int getId()
    {
       return myId;  
    }
    
     /**
     * Gets the inv attribute of the Item object
     *
     * @return The inv value
     */ 
    public int getInv()
    {
        return myInv;  
    }
    
     /**
     * Compares this Item object to another Item object
     *
     * @param other The object to be compared
     * @return the value 0 if the argument is an Item whose id
     * field is equal to this Item's; a value less than 0
     * if the argument is a Item whose id is greater
     * than this Id's; and a value greater than 0 if the
     * argument if a Item whose id is less than this
     * Item.
     */ 
    public int compareTo(Object otherObject)
    {
        return myId - ((Item)otherObject).getId();  
    } 
    
    /**
     * Compares this Item to the specified object. The result is true
     * if and only if the argument is not null and is an Item object that
     * has the same id value as this object.
     *
     * @param otherObject An object to compare this Item against
     * @return true if the Items' id are equal; false otherwise.
     */ 
    public boolean equals(Object otherObject)
    {
        return compareTo(otherObject) == 0; 
    } 
    
     /**
     * The Item object is returned as a String. overrides toString
     * in class Object
     *
     * @return String representation of the Item instance variables
     */ 
    public String toString()
    {
        return Format.right(myId, 10)  + Format.right(myInv, 10); 
    }
}
    
