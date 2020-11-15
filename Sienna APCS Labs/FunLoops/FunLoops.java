
/**
 * Lab 9.2: FunLoops.java
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
public class FunLoops
{
   //declaring variables
   private long backNum, magicNum1, magicNum2;
   private int LCM; 
   
   //methods 
   void magicSquare(int num)
   {
       int x = 1, search = 1, count = 1; 
       
       System.out.println("Magic Squares");
       
       while(x <= num)
       {
           magicNum1 = Math.sqrt(search);
           magicNum2 = (count * (count++)) / 2; 
          
           if(magicNum1 = magicNum2)
             System.out.print("n" + num + " = " + magicNum1); 
           else
           {
              search++;
              count++;
           }
           
           x++; 
       }
   }
}
