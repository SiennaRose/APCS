
/**
 * Lab 5.2: Quadratic.java
 * 
 * 1 September 2016
 * 
 * This class gets input coefficients from the user(a,b,c). The values inputed for each gets plugged into
 * the quadratice equation ax^2+ bx+ c, but in the quadratic formula form of it to solve for x. X will 
 * have two answers in whole numbers.
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*; 
import chn.util.*; 

public class Quadratic
{
    public static void main(String[] args)
    {
        //decalring ConcoleIO object for input later on
        ConsoleIO keyboard = new ConsoleIO(); 
        
        //declaring variables
        double a, b, c, positiveX, negativeX;
        String answer = "x = "; 
        
        //prompting user and getting input
        System.out.println("\n\nThis is the Quadratic Calculator 2000");
        System.out.println("Ex. ax^2 + bx + c = 0"); 
        System.out.println("\nPlease enter coefficient for variable 'a': "); 
        a = keyboard.readDouble(); 
        System.out.println("Please enter coefficient for variable 'b': "); 
        b = keyboard.readDouble();
        System.out.println("Please enter coefficient for variable 'c': "); 
        c = keyboard.readDouble();
        
        //performing calculations
        positiveX = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a); 
        negativeX = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a); 
        
        //Displaying output/ answers to user
        System.out.print(answer + Format.left(positiveX, 6, 4)); 
        System.out.println(Format.right(answer, 10) + Format.left(negativeX, 6, 4)); 
        
    }
}
