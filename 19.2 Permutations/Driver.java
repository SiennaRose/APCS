import java.util.*; 
import apcslib.*;
import java.util.Random; 
/**
 * Lab 19.2 Permutation
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * 14 December 2016
 */
public class Driver
{
    /**
     * driver class randomizes the numbers 1-10 
     * 10 different times
     */
    public static void main(String[] args)
    {
        PermutationGenerator randomized = new PermutationGenerator(); 
        ArrayList work;
        Random rand = new Random(); 
        
        System.out.println("Random Permutation List Generator\n"); 
        for(int x = 1; x <= 10; x++)
        {   
            System.out.print("List" + Format.right(x, 4) + ":"); 
            randomized.smart(); 
            work = randomized.nextPermutation(rand); 
            for(int y = 0; y < 10; y++)
            {   
                System.out.print(Format.right((int)work.get(y), 5));
            }
            System.out.println(); 
        }
        
    }
}
