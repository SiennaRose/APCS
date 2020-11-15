import chn.util.*;
import apcslib.*;
/**
 * class Statistics - getts a txt doc with numbers and finds the average, mode, and standard 
 * deviation within those numbers
 * 
 * @author Sienna Sacramento 
 * @version 1)
 */
public class Statistics
{
   //instatnce variables
   int[] nums = new int[101]; 
   int number; 
   long total = 0; 
   int count = 0; 
   double average, deviation;
   int mode;
   FileOutput outFile; 
    
   /**
    * constructor Statistics - initializes nums array, calculates the amount of numbers within
    * txt doc, and adds up the total sum of all numbers in file
    */
   public Statistics(FileInput inFile, String fileName)
   {
       while(inFile.hasMoreLines())
       { 
           number = inFile.readInt();
           nums[number]++;
           count++; 
           total += number;  
       } 
       
       outFile = new FileOutput(fileName, "append"); 
       averageMethod();
       standardDeviation(); 
       modeMethod();
       
       outFile.close(); 
   }
   
   //methods
   /**
    * <b>summary<b>: finds average 
    */
   public void averageMethod()
   {
       average = (double)total/ count;  
       //System.out.println("\nThe average = " + Format.right(average, 2, 2));
   }
   
    /**
    * <b>summary<b>: finds standard deviation 
    */
   public void standardDeviation()
   {
       double sum = 0; 
       int check = 0; 
       for(int x = 0; x < nums.length; x++)
       
           if(nums[x] != 0)
           {
               sum += nums[x] * Math.pow((x - average), 2);
               check += nums[x]; 
           }

       deviation = Math.sqrt(sum/(check-1));  

   }
   
   /**
    * <b>summary<b>: finds mode
    */
   public void modeMethod()
   {
       mode = nums[0]; 
       for(int x = 0; x < nums.length-1; x++)
           if(mode < nums[x+1])
                mode = nums[x+1]; 
       
       outFile.println("\n\nThe average = " + Format.right(average, 2, 2));
       outFile.println("\nStandard deviation = " + Format.right(deviation, 2, 2));        
       outFile.print("\nThe mode is(are) --> ");
       for(int y = 0; y < nums.length-1; y++)
           if(nums[y] == mode)
                outFile.print(Format.left(y, 4)); 
   }
}
