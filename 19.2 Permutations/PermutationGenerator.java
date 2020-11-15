import java.util.*;
import java.util.Random; 
/**
 * Lab 19.2 Permutation
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * 14 December 2016
 */
public class PermutationGenerator
{
   private ArrayList permutation; 
   private ArrayList numbers; 
   private final int MAX = 10; 
   
   
   /**
    * constructor - declares numbers and permutation ArrayLists and declares rand
    */
   public PermutationGenerator()
   {
       numbers = new ArrayList(10);    
       permutation = new ArrayList(10);
   }
   
   /**
    * <b>summary</b>: initializes the numbers array list 
    */
   public void smart()
   {
         for(int x = 1; x <= MAX; x++)
            numbers.add(new Integer(x));
   }
   
   /**
    * <b>summary</b>: removes a random Interger object from the numbers ArrayList and adds it 
    * to the permutation list
    * returns the next permutation 
    */
   public ArrayList nextPermutation(Random rand)
   {
       int random, flag = 0; 
       Integer hold = new Integer(99); 
       
       do
       {
           random = rand.nextInt(10) + 1; 
           if((random-1) < numbers.size())
           {
               hold = (Integer)numbers.remove(random-1);
               permutation.add(flag, hold); 
               flag++; 
           }
                 
          
       }
       while(flag != 10);
       return permutation; 
   }
}
