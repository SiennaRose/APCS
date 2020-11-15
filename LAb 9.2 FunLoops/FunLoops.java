
/**
 * Lab 9.2: FunLoops.java
 * 
 * This lab works with the FunLoopsTester class to output the answers to the following questions:
 * LCM, reverse input, and magic square(perfect square + recursion). 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
public class FunLoops
{
    //methods
    void magicSquare(int num)
    {
        int n = 1, a = 1, theNum = num, sqrt, recursion, e = 1; 
        long number = 1; 
        //System.out.println("number = " + number);
        
        while(a <= theNum)
        {
            e = 1; 
            while(e == 1)
            {
              
                sqrt = (int)(Math.sqrt(number)); 
                //System.out.println("number = " + number);
                
                if(sqrt * sqrt == number)
                {   //System.out.println("\nMade it here\n"); 
                    recursion = (n*(n + 1)) / 2;
                    while(number > recursion)
                    {
                        n++;
                        recursion = (n*(n + 1)) / 2;
                        //System.out.println("\nrecursion growing toward number\n"); 
                    }
                    if(number == recursion)
                    {
                        System.out.println("n" + a + " = " + number);
                        e = 0; 
                        number++; 
                    }
                    else
                    {
                        number++;
                    }
                }
                else
                {
                    number++; 
                    //System.out.println("\nincreasing sqrt check\n"); 
                }
            }
            a++; //System.out.println("\na growing toward boundary\n"); 
        }
    }   
    
    int reverse(int num)
    {
         int n = num, backwards = 0; 
         
         while(n != 0)
         {
             backwards = backwards * 10; 
             backwards = backwards + (n % 10);
             n = n / 10; 
         }
         return backwards;
    }
    
    long lcm(int num1, int num2)
    {
        int a = num1, b = num2; 
        
        while(a != b)
        {
            if(a> b)
                a -=b; 
            else
                b -= a; 
         
        }
        return ((num1 * num2) / a);
    }
}
