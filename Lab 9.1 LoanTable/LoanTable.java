
/**
 * Lab 9.1: LoanTable.java
 * 
 * This worker class works in conjunction with the LoanTableTester class and recives several values 
 * from it: principal, high and low intrest rates, and length of loan. Thic class prompts, 
 * calculates, and prints output to the user. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*;
import chn.util.*; 

public class LoanTable
{
    //variable decalrations
    private double myPrincipal, myLowR, myHighR, monthly, annualR; 
    private int myTime; 
    private ConsoleIO keyboard; 
    
    //constructors
    public LoanTable()
    {
        myPrincipal = 0; 
        myLowR = 0; 
        myHighR = 0; 
        myTime = 0; 
        keyboard = new ConsoleIO(); 
    }
    
    //accessors and prompting user
    void askForLoan()
    { 
        System.out.print("Principal = $"); 
        myPrincipal = keyboard.readDouble(); 
    }
    
    void askForTime()
    {
        System.out.print("Time (in years) = ");
        myTime = keyboard.readInt();  
    }
    
    void askForLowR()
    {
        System.out.print("Low rate (%) = "); 
        myLowR = keyboard.readDouble(); 
    }
    
    void askForHighR()
    {
        System.out.print("High rate (%) = "); 
        myHighR = keyboard.readDouble(); 
    }
    
    //methods
    void calculations()
    {
        //calculates monthly intreste rates between low and high rates 
        System.out.println("\nAnnual Intrest Rate   Monthly Payment\n");
        
        while(myLowR <= myHighR)
        {
           monthly = (myPrincipal * ((myLowR*.01)/12) * Math.pow((1 + ((myLowR*.01)/12)), (myTime*12))) 
                        / (Math.pow((1 + ((myLowR * .01)/12)), (myTime * 12)) - 1);
           System.out.println(Format.center(myLowR, 20, 2) + Format.right(monthly, 12, 2)); 
           myLowR += .25; 
        }
    }
}
