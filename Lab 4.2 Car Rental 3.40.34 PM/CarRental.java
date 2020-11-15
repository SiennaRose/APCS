
/**
 * Lab 4.2: CarRental.java
 * 
 * This class recieves the following information: license plate, make and year of a car.
 * It uses the license plate number to create a special code which rental car companies
 * can use to identify the car. Afterward, this class will output all the informatioon gathered 
 * and the new special code back to the user
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*; 
import chn.util.*; 

public class CarRental
{
    public static void main(String[] args)
    {
        //constructing Console.IO object to get user input later on
        ConsoleIO keyboard = new ConsoleIO(); 
        
        //declaraing variables
        int plate, specialNum, letterNum, ascii; 
        String make, model, license;
        String specialCode; 
        
        //Prompting user and getting input
        System.out.println("\n\nPlease enter the make of car: "); 
        make = keyboard.readLine(); 
        System.out.println("\nPlease enter the model of car: "); 
        model = keyboard.readLine(); 
        System.out.println("\nPlease enter the car's license plate: "); 
        license = keyboard.readToken(); 
        plate = keyboard.readInt(); 
         
        //performing calulations to make special code
        specialNum = license.charAt(0) + license.charAt(1) + license.charAt(2); //adding letters
        letterNum = plate + specialNum;
        ascii = 65 + (letterNum % 26); //getting ascii value
        
        //Outputing info. to user
        System.out.println("\n\nMake = " + make); 
        System.out.println("Model = " + model); 
        System.out.print(license + " " + plate + " = " + (char)ascii + letterNum); //typecasting 
   
        
    }
}
