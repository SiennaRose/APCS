
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
        TaxRates citizen; 
        TaxRates citizen1; 
        TaxRates citizen2; 
        TaxRates citizen3; 
        int married; 
        double income; 
        double fedTax; 
        
        //Prompting user and getting data
        System.out.print("\n\nDetermining filing status -> Married = 2 & Single = 1: ");
        married = keyboard.readInt(); 
        System.out.print("\nPlease enter income: "); 
        income = keyboard.readDouble(); 
        
        //determing the federal tax 
        citizen = new TaxRates(married, income); 
        
        //displaying results
        System.out.println("\n" + citizen.getStatus());
        System.out.println("Taxable income = $" + citizen.getIncome());
        System.out.println("Federal tax = $" + Format.left(citizen.getTax(), 2, 2)); 
        
        //Prompting user and getting data
        System.out.print("\n\nDetermining filing status -> Married = 2 & Single = 1: ");
        married = keyboard.readInt(); 
        System.out.print("\nPlease enter income: "); 
        income = keyboard.readDouble(); 
        
        //determing the federal tax 
        citizen1 = new TaxRates(married, income); 
        
        //displaying results
        System.out.println("\n" + citizen1.getStatus());
        System.out.println("Taxable income = $" + citizen1.getIncome());
        System.out.println("Federal tax = $" + Format.left(citizen1.getTax(), 2, 2)); 
        
        //Prompting user and getting data
        System.out.print("\n\nDetermining filing status -> Married = 2 & Single = 1: ");
        married = keyboard.readInt(); 
        System.out.print("\nPlease enter income: "); 
        income = keyboard.readDouble(); 
        
        //determing the federal tax 
        citizen2 = new TaxRates(married, income); 
        
        //displaying results
        System.out.println("\n" + citizen2.getStatus());
        System.out.println("Taxable income = $" + citizen2.getIncome());
        System.out.println("Federal tax = $" + Format.left(citizen2.getTax(), 2, 2)); 
        
        //Prompting user and getting data
        System.out.print("\n\nDetermining filing status -> Married = 2 & Single = 1: ");
        married = keyboard.readInt(); 
        System.out.print("\nPlease enter income: "); 
        income = keyboard.readDouble(); 
        
        //determing the federal tax 
        citizen3 = new TaxRates(married, income); 
        
        //displaying results
        System.out.println("\n" + citizen3.getStatus());
        System.out.println("Taxable income = $" + citizen3.getIncome());
        System.out.println("Federal tax = $" + Format.left(citizen3.getTax(), 2, 2)); 
        
    }
}
