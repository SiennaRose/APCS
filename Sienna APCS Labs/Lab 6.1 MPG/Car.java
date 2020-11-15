
/**
 * Lab 6.1: MPG.java
 * 
 * 8 September 2016
 * 
 * This class is an encapsulation for a car. It recieves the odometer readings from a new car and 
 * uses it to find the miles per gallon of that car. At each gas station visit it will also recieve
 * the current odometer readings and the amoount of gallons needed to fill up the car. This class works in 
 * conjunction with the CarTester class. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
 

public class Car
{
    //instance variables
    private int myStartMiles;       //starting odometer reading
    private int myEndMiles;         //ending odometer reading
    private double myGallonsUsed;   //Gallons of gased used between the readings
    
    //Constuctor
    //creates a new instance of a Car oblect with the starting odometer readings
    Car(int startOdometer)
    {
        myStartMiles = startOdometer; 
        myEndMiles = 0; 
        myGallonsUsed = 0.0; 
    }
    
    //Methods
    //Simulates filling up the tank. Record the current odometer reading and the number of 
    //gallons to fill the tank
    void fillup(int odometerReading, double gallons)
    {
        myEndMiles = odometerReading; 
        myGallonsUsed = gallons;
        //myStartMiles = myEndMiles = odometerReading;
    }
    
    //Calculates and returns the miles per gallon for the car
    double calculateMPG()
    {
        return (myEndMiles - myStartMiles) / myGallonsUsed; 
    }
}
