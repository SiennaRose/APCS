
/**
 * class Person - a class used to recieve an inputed name, gender, and age 
 * to display to screen
 * 
 * @author Sienna Sacramento  
 * @version 1
 */

public class Person
{
    //instance variables
    /** name of the person*/
    protected String myName ; 
    /**person's age*/
    protected int myAge; 
    /**"M" for male, "F" for female*/
    protected String myGender; 
    
    // constructor
    /**
     * constructor Person - initializes myName, myAge, myGender
     * accepted from BacktoSchool driver class
     */

    public Person(String name, int age, String gender)
    {
        myName = name; myAge = age ; myGender = gender;
    }
    
    /**
     *  <b>summary</b>: displays name, age, and gender to screen 
     */
    
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " +myGender;
    }
    
    /**
     * <b>summary</b>: returns myName 
     */
    
    public String getName()
    {
        return myName; 
    }
    
    /**
     * <b>summary</b>: returns myAge
     */
    
    public int getAge()
    { 
        return myAge; 
    }
    
    /**
     * <b>summary</b>: returns myGender
     */
    
    public String getGender()
    {
        return myGender; 
    }
    
    /**
     * <b>summary</b>: sets myName
     */
    
    void setName(String name)
    {
        myName = name; 
    }
    
    /**
     * <b>summary</b>: sets myAge
     */
    
    void setAge(int age)
    {
        myAge = age; 
    }
    
    /**
     * <b>summary</b>: sets myGender
     */
    
    void setGender(String gender)
    {
        myGender = gender; 
    }
}
