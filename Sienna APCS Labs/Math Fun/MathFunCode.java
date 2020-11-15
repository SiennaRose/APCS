
/**
 * Lab 3.1: MathFun.java
 * 
 * APCS: Period 4
 * 
 * This class solves math operations and stores the answers into a variable.
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*; //library 

public class MathFunCode
{
    public static void main (String[] args)
    {
        //decalaring variables 
        int answer1, answer2, answer3, answer4, answer5; 
        double num1;
        double num2; 
        int num3, letter; 
        char ascii; 
        
        //initializing variables
        answer1 = 2 + 3; 
        answer2 = 17 % 4; 
        answer3 = 4 + 9; 
        answer4 = 46 / 7; 
        answer5 = 46 % 7; 
        num1 = 2 * 3.0; 
        num2 = (double) 25 / 4; //typecasting
        num3 = (int) 7.75 + 2; 
        letter = (int) 'P';
        ascii = (char) 105; 
        
        //displaying math expressions
        System.out.println("2 + 3 = " + answer1); 
        System.out.println("17 % 4 = " + answer2); 
        System.out.println("4 + 9 = " + answer3); 
        System.out.println("46 / 7 = " + answer4);
        System.out.println("46 % 7 = " + answer5); 
        System.out.println("2 * 3.0 = " + num1); 
        System.out.println("25 / 4 = " + num2);
        System.out.println("7.75 + 2 = " + num3);
        
        //displaying ASCII values and Character
        System.out.print("(int) 'P' = ");
        System.out.print((int)letter);  //typecasting/ changing into integer 
        System.out.print("\n");
        System.out.print("(char) 105 = "); //cahnging into ascii character
        System.out.print((char)ascii); 
        System.out.print("\n\n"); 
        
        //Displaying Constants Lists 
        System.out.println("The largest value of type byte = " + Byte.MAX_VALUE); 
        System.out.println("The smallest value of type byte = " + Byte.MIN_VALUE);
        System.out.println("The largest value of type short = " + Short.MAX_VALUE); 
        System.out.println("The smallest value of type short = " + Short.MIN_VALUE); 
        System.out.println("The largest value of type character = " + (int)Character.MAX_VALUE);
        System.out.println("The smallest value of type character = " + (int)Character.MIN_VALUE); 
        System.out.println("The largest value of type integer = " + Integer.MAX_VALUE); 
        System.out.println("The smallest value of type integer = " + Integer.MIN_VALUE);
        System.out.println("The largest value of type long = " + Long.MAX_VALUE); 
        System.out.println("The smallest value of type long = " + Long.MIN_VALUE);
        System.out.println("The largest value of type float = " + Float.MAX_VALUE); 
        System.out.println("The smallest value of type float = " + Float.MIN_VALUE);
        System.out.println("The largest value of type double = " + Double.MAX_VALUE);
        System.out.println("The smallest value of type double = " + Double.MIN_VALUE); 
       
        
    }
}
