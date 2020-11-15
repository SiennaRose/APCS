
/**
 * class Shorthand - 
 * 
 * @author Sienna Sacramento
 * @version 1
 */
public class Shorthand
{
    //declaring instance variables
    private String input, small; 
    
    //constructor
    Shorthand(String words)
    {
        input = words; 
        checks(); 
    }
    
    //methods
    void checks()
    {
        int n, t; 
        String hold = ""; 
        
        //if((input.indexOf(" and ")) || (input.indexOf(" And ") > 0));  
        n = input.indexOf(" and "); 
        if(n != -1)
        {
            small = input.substring(0, n);
            small += " &"; 
            small += input.substring((n+4) , (input.length()));
        }
        System.out.print("\n small w/o and = " + small + "\n"); 
        
        t = small.indexOf(" to "); 
        if(t != -1)
        {
            hold = small.substring(0, t); 
            hold += " 2";
            hold += small.substring((t+3), (small.length())); 
        }
        System.out.print("\n hold w/o to = " + hold + "\n"); 
    }
}
