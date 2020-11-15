
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
    private double tax;         //the federal tax amount
    private String word = "hi"; 
    
    //constructors
    public TaxRates(int married, double income)
    {
        filingStatus = married;
        earnings = income; 
        taxation(); 
    }
    
    //methods
    public String getStatus()
    {
        return word;
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
        if(filingStatus == 2)
        {    
            married();
            word = "Married";
        }
        else
        {
            single(); 
            word = "Single"; 
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
                tax = 4057.5 + 0.275 * (earnings - 27050.0);
            }
            else
                if((earnings > 65550) && (earnings <= 136750))
                {
                    tax = 14645.0 + 0.305 * (earnings - 65550.0); 
                }
                else
                    if((earnings > 136750) && (earnings <= 297350))
                    {
                        tax = 36361.0 + 0.355 * (earnings - 136750.0); 
                    }
                    else
                        tax = 93374.0 + 0.391 * (earnings - 297350.0); 
    }
    
    public void married()
    {
        if((earnings > 0) && (earnings <= 45200))
        {
            tax = earnings * 0.15;
        }
        else
            if((earnings > 45200) && (earnings <= 109250))
            {
                tax = 6780.0 + 0.275 * (earnings - 45200.0); 
            }
            else
                if((earnings > 109250) && (earnings <= 166500))
                {
                    tax = 24393.75 + 0.305 * (earnings - 109250.0);
                }
                 else
                    if((earnings > 166500.0) && (earnings <= 297350))
                    {
                        tax = 41855.0 + 0.355 * (earnings - 166500.0); 
                    }
                    else
                        tax = 88306.0 + 0.391 * (earnings - 297350.0); 
    }
    }

