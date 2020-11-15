/**
* Lab 6.1: CarTester.java
* 
* 9 September 2016
* 
* This class works in conjunction with the Car class. It gets input from the user: initial odometer
* reading, current odometer reading, and the gallons used. This class then sends these variables
* back to the Car class where it will calculate the MPG. 
* 
* @author (Sienna Sacramento) 
* @version (1)
*/
import chn.util.*; 
import apcslib.*; 
public class CarTester
{
  public static void main(String[] args) 
  {
      //Declarations
      //declaring object keyboard in order to get user input later on
      ConsoleIO keyboard = new ConsoleIO(); 
      int startOdometer;
      int odometerReading; 
      double gallons;

      //Getting user input 
      System.out.print("\n\nNew car odometer reading: "); 
      startOdometer = keyboard.readInt(); //startOdometer input
      System.out.println("\nFilling Station Visit");
      System.out.print(" odometer reading: "); 
      odometerReading = keyboard.readInt(); //odometerReading input
      System.out.print(" gallons to fill tank: "); 
      gallons = keyboard.readDouble(); //gallons input

      //creates instantiaion of object Car identified as auto
      Car auto = new Car(startOdometer);
      auto.fillUp(odometerReading,gallons); //sends odometerREading and gallons 

      //displaying output
      System.out.print("\nMiles per gallon: "); 
      System.out.println(Format.left(auto.calculateMPG(),2,2)); //print miles per gallon

      //Getting user input second time around
      System.out.println("\nFilling Station Visit");
      System.out.print(" odometer reading: "); 
      odometerReading = keyboard.readInt(); //odometerReading input
      System.out.print(" gallons to fill tank: "); 
      gallons = keyboard.readDouble(); //gallons input

      auto.fillUp(odometerReading,gallons); //sends odometerReading and gallons
     
      //displaying output
      System.out.print("\nMiles per gallon: "); 
      System.out.println(Format.left(auto.calculateMPG(),2,2)); //print miles per gallon 
    }
}