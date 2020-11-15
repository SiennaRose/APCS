/**
 * Lab 4.1: Change.java
 * 
 * 8/29/16
 * 
 * This class is like a change machine. It gets input from a user on how 
 * much was the purchase and how much they paid. Then the machine will calculate 
 * the diffrence/ their change. Afterward this class will output the amount of coins and which 
 * kinds nedd to be given to the customer. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*; 
import chn.util.*;

public class Change
{
    public static void main(String[] args)
    {
        //constructing ConsoleIO object to get user input later on
        ConsoleIO keyboard = new ConsoleIO(); 
        
        //declaring variables
        double purchaseAmount, cashPaid, temp; 
        int change, quarters, nickels, dimes, pennies, hold; 
        
        //Prompting user
        System.out.println("Please enter the amount of purchase: ");
        purchaseAmount = keyboard.readDouble(); 
        System.out.println("\nPlease enter the amount of cash tendered: ");
        cashPaid = keyboard.readDouble(); 
        
        //solving for how much change leftover
        temp = cashPaid - purchaseAmount; 
        
        //isolating the cents leftover (no bills)
        temp = temp - (int)temp + 0.00001;
        
        //turning cents into whole number 
        change = (int)(temp * 100); 
        
        //figuring out which coins to use
        quarters = change / 25;
        hold = change % 25; 
        dimes = hold / 10;
        hold = hold % 10; 
        nickels = hold / 5; 
        pennies = hold % 5; 
        
        //displaying output
        System.out.print("\nAmount of purchase = ");
        System.out.println(Format.left(purchaseAmount, 2, 2)); 
        System.out.print("\nCash tendered = "); 
        System.out.println(Format.left(cashPaid, 2, 2)); 
        System.out.println("\nAmount of coins needed: \n"); 
        System.out.println(Format.right(change, 4) + " cents = ");
        System.out.println(); 
        System.out.println(Format.right(quarters, 5) + " quarter"); 
        System.out.println(Format.right(dimes, 5) + " dime"); 
        System.out.println(Format.right(nickels, 5) + " nickel");
        System.out.println(Format.right(pennies, 5) + " penny");
        
        
        
        
        
    }
}
