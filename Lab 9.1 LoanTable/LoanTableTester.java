
/**
 * Lab 9.1: LoanTableTester.java
 * 
 * This class recieves several inputs from user: principal(amt of loan), the length of the loan in 
 * years, the low intrest rate in % and the high intrest rate in %. In addition, this class will 
 * determine the monthly payment. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import chn.util.*; 
public class LoanTableTester
{
    public static void main(String[] args)
    {
        //declaraing variables
        int hasLoan; 
        ConsoleIO keyboard = new ConsoleIO(); 
        LoanTable tab; 
        
        //prompting user
        System.out.print("\n\nIf you have a loan enter 1, if not enter 0: "); 
        hasLoan = keyboard.readInt(); 
        System.out.println("\nMortgage problem\n");
        
        while(hasLoan == 1)
        {
            tab = new LoanTable(); 
            
            tab.askForLoan(); 
            tab.askForTime();
            tab.askForLowR(); 
            tab.askForHighR(); 
            tab.calculations(); 
            
            System.out.print("\n\nIf you have a loan enter 1, if not enter 0: "); 
            hasLoan = keyboard.readInt(); 
        }
        
    }
}
