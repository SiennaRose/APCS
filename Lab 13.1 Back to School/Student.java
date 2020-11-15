
/**
 * class Student - class used to recieve various info about a student: GPA, idNum, name, etc.
 * This is a subclass to the Person class
 * 
 * @author Sienna Sacramento  
 * @version 1
 */

public class Student extends Person
{
    //instance variables
    /**Student Id Number*/
    protected String myIdNum;
    /**grade point average*/
    protected double myGPA; 
 
    // constructor
    /**
     * constructor Student - initializes myName, myAge, and myGender(inherited variables from 
     * Person superclass) 
     * initializes myIdNum and myGPA
     */
    
    public Student(String name, int age, String gender, String idNum, double gpa)
    {
        // use the super class' constructor
        super(name, age, gender);
        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }
    
    //methods
    /**
     * <b>summary</b>: returns infor for the student
     */
    
    public String toString()
    {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA; 
    }
    
    /**
     * <b>summary</b>: returns myIdNum
     */
    
    String getIdNum()
    {
        return myIdNum; 
    }
    
    /**
     * <b>summary</b>: returns myGPA
     */
    
    double getGPA()
    {
        return myGPA; 
    }
    
    /**
     * <b>summary</b>: sets myIdNum
     */
    
    void setIdNum(String idNum)
    {
        myIdNum = idNum; 
    }
    
    /**
     * <b>summary</b>: sets myGPA
     */
    
    void setGPA(double gpa)
    {
        myGPA = gpa; 
    }
    
}

