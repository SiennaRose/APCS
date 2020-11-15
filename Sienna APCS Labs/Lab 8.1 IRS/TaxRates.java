
/**
 * Lab 8.1: TaxRates.java
 * 
 * This worker class works in conjunction witht the IRSTester driver class. It uses nested if else
 * statements to determine which federal tax will be applied to the citizen
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */


public class TaxRates
{
    //instance variables
    private int filingStatus;   //married or single
    private double earnings;    //their income
    private double tax;                //the federal tax amount
    
    //constructors
    public TaxRates(int married, double income)
    {
        filingStatus = married;
        earnings = income; 
        taxation(); 
    }
    
    //methods
    public int getStatus()
    {
        return filingStatus;
    }
    
    public double getIncome()
    {
        return earnings; 
    }
    
    public double getTax()
    {
        return tax; 
    }
    
    //modifiers
    private void taxation()
    {
        if(filingStatus == 1)
        {    
            married();
        }
        else
        {
            single(); 
        }
    }
    
    public void single()
    {
        if((earnings > 0) && (earnings <= 27050))
        {
            tax = earnings * (0.15);
        }
        else
            if((earnings > 27050) && (earnings <= 65550))
            {
                tax = 4057.5 + 0.275 * (earnings - 27050);
            }
            else
                if((earnings > 65550) && (earnings <= 136750))
                {
                    tax = 14635.0 + 0.305 * (earnings - 65550); 
                }
                else
                    if((earnings > 136750) && (earnings <= 297350))
                    {
                        tax = 36361.0 + 0.355 * (earnings - 136750); 
                    }
                    else
                        tax = 93374.0 + 0.391 * (earnings - 297350); 
    }
    
    public void married()
    {
        if((earnings > 0) && (earnings <= 45200))
        {
            tax = earnings * 0.15;
        }
        else
            //if((earnings >
       
        }
    }
}
