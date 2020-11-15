
/**
 * class Teacher - used to get info about a teacher: name, salary, subject, etc. 
 * This is a subclass to the Person class
 * 
 * @author Sienna Sacramento  
 * @version 1
 */
public class Teacher extends Person
{
    // instance variables
    /**what subject the teacher teaches*/
    protected String mySubject; 
    /**how much they make*/
    protected double mySalary;
    
    //constructor
    /**
     * constructor Teacher - initializes myName, myAge, and myGender(inherited variables from 
     * Person superclass) 
     * initializes mySubject and mySalary 
     */
    
    Teacher(String name, int age, String gender, String subject, double salary)
    {
        //use the super class' constructor 
		super(name, age, gender); 

		//initialize what's new in Teacher
		mySubject = subject; 
		mySalary = salary; 
    }

	//methods 
	/**
	* <b>summary</b>: returns info for the teacher
	*/

	public String toString()
	{
		return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;  
	}

	/**
	* <b>summary</b>: returns mySubject
	*/

	String getSubject()
	{
		return mySubject; 
	}

	/**
	* <b>summary</b>: returns mySalary
	*/

	double getSalary()
	{
		return mySalary; 
	}

	/**
	* <b>summary</b>: initializes mySubject
	*/

	void setSubject(String subject)
	{
		mySubject = subject; 
	}

	/**
	* <b>summary</b>: initializes mySalary 
	*/

	void setSalary(double salary)
	{
		mySalary = salary; 
	}
}
