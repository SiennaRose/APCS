import chn.util.*; 
/**
 *Sienna Sacramento 
 *Mr. Lanstsgerber
 *APCS: Period 3
 *27 Febuary 2017
 *
 *class ErrorFreeeCheckingTester - driver for the CheckingAccount class and gathers user's input. 
 *                          It also checks for any exceptions and uses do while loops to give the user
 *                           second chances.
 */
public class ErrorFreeCheckingTester
{
   public static void main(String[] args)
   {
       CheckingAccount checking = new CheckingAccount();; 
       ConsoleIO console = new ConsoleIO(); 
      
       boolean check; 
       
       System.out.println("ErrorFreeChecking Test \n"); 
       
       do
       {
           check = false; 
           System.out.print("Please enter the starting balance --> ");
           try
           {
               checking = new CheckingAccount(console.readDouble(), "A123");
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Error CheckingAccount: negative initial balance \n"); 
               check = true;
           }
        }
       while(check);
       
       System.out.println("\nAccount opened with balance of " + checking.getBalance() + "\n"); 
       
       do
       {
           check = false; 
           System.out.print("Please enter the amount to deposit --> ");
           try
           {
               checking.deposit(console.readDouble());
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Error deposit: negative amount \n"); 
               check = true;
           }
        }
       while(check);
       
       System.out.println("\nDeposit made. Current account balance = " + checking.getBalance() + "\n"); 
       
       
       do
       {
           check = false; 
           System.out.print("Please enter the amount to withdraw --> ");
           try
           {
               checking.withdraw(console.readDouble());
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Error withdraw: illegal amount \n"); 
               check = true;
           }
        }
       while(check);

       System.out.println("\nWithdrawal made. Current account balance = " + checking.getBalance() + "\n"); 
       
       System.out.println("Thank you for using ErrorFreeChecking...goodbye!"); 
       
 
   }
}
