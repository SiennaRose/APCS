
/**
 * Lab 8.1: IRSTester.java
 * 
 * This class works in conjunction with the TaxRates class. It gets these inputs: married, income; and then
 * passes the data to the TaxRates class where their federal tax is determined
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*;
import chn.util.*; 

public class IRSTester
{
    public static void main(String[] args)
    {
        //declaring objects and variable
        ConsoleIO keyboard = new ConsoleIO(); 
        TaxRates citizen = new TaxRates(); 
        int married; 
        double income; 
        double fedTax; 
        
        //Prompting user and getting data
        System.out.print("\n\nDetermining filing status -> Married = 2 & Single = 1: ");
        married = keyboard.readInt(); 
        System.out.print("\nPlease enter income: "); 
        income = keyboard.readDouble(); 
        
        //determing the federal tax 
        citizen.
        
    }
}
