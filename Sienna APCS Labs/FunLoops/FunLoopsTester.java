
/**
 * Lab 9.2: FunLoopsTester.java
 * 
 * this class works in conjunction with the FunLoops class and prints out the reverse of sum numbers
 * as well as the LCM of two numbers. In addition, this class also calls a method which will print out a
 * series of perfect/ "magic squares". 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
public class FunLoopsTester
{
    public static void main(String[] args)
    {
        FunLoops fun = new FunLoops();
           
        fun.magicsquare(4);
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
    
