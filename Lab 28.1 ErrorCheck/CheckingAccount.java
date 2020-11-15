
/**
 * Sienna Sacramneto 
 * Mr. Lansberger
 * APCS: Period 3
 * 18 Febuaray 2017
 * 
 * CheckingAccount class - contains the Checking account info 
 * 
 */
public class CheckingAccount
{
    private double myBalance; 
    private String myAccountNumber;
    private final double WITHDRAW_FEE = .15; 
    
    /**
     * constructor - no parameters passed and creates a blank checking account 
     */
    public CheckingAccount()
    {
        myBalance = 0; 
        myAccountNumber = "NEW"; 
    }
    
    /**
     * constructor - has parameters and sets up checking account. Initializes the myBalance and the myAccountNumber variables.
     *              Uses an exception throw to shcek that the initial balance is not negative
     * 
     * parameter double initialBalance the balance the account starts with
     * parameter String acctNum the account number
     */
    public CheckingAccount(double initialBalance, String acctNum)
    {
       if(initialBalance < 0)
            throw new IllegalArgumentException("Error CheckingAccount: negative initial balance");
       else
            myBalance = initialBalance; 
       
       myAccountNumber = acctNum; 
    }
    
    /**
     * </>summary</>: increase myBalance by amount. Uses an exception throw to check if the amount being deposited is negative
     * 
     * parameter double amount the amount wished to deposite into myBalance
     */
    public void deposit(double amount)
    {
        if(amount < 0)
            throw new IllegalArgumentException("Error deposit: negative amount ");
        else
            myBalance = myBalance + amount; 
    }
    
    /**
     * </>summary</>: decrease myBalance by the amount passed and includes the WITHDRA_FEE. Uses an exception throw to
     *                  check that the amount being withdrawn is greater than 0 and less than the myBalnce value
     * 
     * parameter double amount the amount wished to be withdrawn
     */
    public void withdraw(double amount)
    {
        if((amount < 0) || (amount > myBalance))
            throw new IllegalArgumentException("Error withdraw: illegal amount "); 
        else
            myBalance = myBalance - (amount + WITHDRAW_FEE); 
    }
    
    /**
     * </>summary</>: accessor method which returns myBalace
     */
    public double getBalance()
    {
        return myBalance; 
    }
    
    
}
