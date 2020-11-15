
/**
 * class CollegeStudent - 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */

public class CollegeStudent extends Student 
{
    // instance variables
    /**What major: eletrical engineering? communications? */
    protected String myMajor; 
    /**year in colloge: Frosh, soph, etc. */
    protected int myYear; 
    
    //constructor
    /**
     * constructor CollegeStudent- initializes myName, myAge, and myGender(inherited variables from 
     * Person superclass) 
     * initializes myMajor and myYear
     */
    
    CollegeStudent(String name,int age,String gender,String idNum,double gpa, int year, String major)
    {
        //use's Student's constructor
        super(name, age, gender, idNum, gpa); 
        //initializes what's new to college student
        myYear = year; 
        myMajor = major; 
    }
    
    //methods
   /**
     * <b>summary</b>: returns info for the CollegeStudent
     */
    
    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor ; 
    }
    
   /**
    * <b>summary</b>:returns myYear
    */
   
   int getYear()
   {
       return myYear; 
   }
   
   /**
    * <b>summary</b>:returns myMajor
    */
   
   String getMajor()
   {
       return myMajor;
   }
   
   /**
    * <b>summary</b>:initializes myYear
    */
   
   void setYear(int year)
   {
       myYear = year; 
   }
   
   /**
    * <b>summary</b>: initializes myMajor
    */
   
   void setMajor(String major)
   {
       myMajor = major; 
   }
}
