import java.util.Random; 
/**
 * class Rolling - this class counts how many times three six-sided dice must be rolled until
 * the values showing are all different. 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */
public class Rolling
{
  public static void main(String[] args)
  {
      int count = 0, roll1, roll2, roll3; 
      Random die = new Random();  
     
      //when the loop is done 
      //(roll != roll2) && (roll2 != roll3) && (roll1 != roll3)
      do
      {
         count++; 
         roll1 = die.nextInt(6) + 1; 
         System.out.print(roll1 + " "); 
         roll2 = die.nextInt(6) + 1; 
         System.out.print(roll2 + " "); 
         roll3 = die.nextInt(6) + 1; 
         System.out.println(roll3 + " "); 
      }
      while((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3));
      
      System.out.println("count = " + count + "\n"); 
      
  }
}
