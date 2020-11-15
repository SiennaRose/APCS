
/**
 * Lab 9.2: FunLoopsTester.java
 * 
 * This class works in conjunstion with the FunLoops class in displaying the answers to these questions:
 * LCM, reverse input, magic squares(perfect square + recursion). 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
public class FunLoopsTester
{
   public static void main(String[] args)
   {
       FunLoops fun = new FunLoops();
       fun.magicSquare(4);
       System.out.println("12345 reversed ---> " + fun.reverse (12345));
       System.out.println("10001 reversed ---> " + fun.reverse (10001));
       System.out.println("1200 reversed ---> " + fun.reverse (1200));
       System.out.println("5 reversed ---> " + fun.reverse (5));
       System.out.println();
       System.out.println("LCM (15,18) = " + fun.lcm (15,18));
       System.out.println("LCM (40,12) = " + fun.lcm (40,12));
       System.out.println("LCM (2,7) = " + fun.lcm (2,7));
       System.out.println("LCM (100,5) = " + fun.lcm (100,5));
    }
}
