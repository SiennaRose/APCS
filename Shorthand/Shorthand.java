
/**
 * class Shorthand - 
 * 
 * @author Sienna Sacramento
 * @version 1
 */
public class Shorthand
{
    //declaring instance variables
    /**input holds input and small holds the changes made to input*/
    private String input, small;
    
    //constructor
    /**
     * Shorthand constructor initializes input and then goes does work in the check method
     */
    
    Shorthand(String words)
    {
        input = words; 
        checks(); 
    }
    
    //methods
    /**
     * check method- goes through the string input and replaces it into the shorthand version
     */
    
    void checks()
    {
        int n, t, f, u, a, e, i, o, uKnow; 
        String hold = "";  
        
        hold = input.toLowerCase(); 
        n = hold.indexOf("and");       
        while(n != -1)
        {
            small = input.substring(0, n); 
            small += "&";
            small += input.substring(n+3); 
   
            hold = small.toLowerCase(); 
            n = hold.indexOf("and"); 
            
            input = small; 
        }
        
        hold = input.toLowerCase(); 
        t = hold.indexOf("to"); 
        while(t != -1)
        {
            small = input.substring(0, t); 
            small += "2";
            small += input.substring(t+2); 

            hold = small.toLowerCase(); 
            t = hold.indexOf("to"); 
            
            input = small; 
        }
            
        hold = input.toLowerCase(); 
        f = hold.indexOf("for"); 
        while(f != -1)
        {
            small = input.substring(0, f); 
            small += "4";
            small += input.substring(f+3); 
            
            hold = small.toLowerCase(); 
            f = hold.indexOf("for"); 
            
            input = small; 
        }
      
        hold = input.toLowerCase(); 
        uKnow = hold.indexOf("u"); 
        while(uKnow != -1)
        {
                small = input.substring(0, uKnow); 
                small += input.substring(uKnow+1); 
            
                hold = small.toLowerCase(); 
                uKnow = hold.indexOf("u"); 
            
                input = small; 
        }
        
        hold = input.toLowerCase(); 
        u = hold.indexOf("yo"); 
        while(u != -1)
        {
            small = input.substring(0, u); 
            small += "U";
            small += input.substring(u+1); 
            
            hold = small.toLowerCase(); 
            u = hold.indexOf("yo"); 
            
            input = small; 
        }
        
        hold = input.toLowerCase(); 
        a = hold.indexOf("a");
        while(a != -1)
        {
            small = input.substring(0, a); 
            small += input.substring(a+1); 
            
            hold = small.toLowerCase(); 
            a = hold.indexOf("a"); 
            
            input = small; 
        }
        
        hold = input.toLowerCase(); 
        e = hold.indexOf("e"); 
        while(e != -1)
        {
            small = input.substring(0, e); 
            small += input.substring(e+1); 
            
            hold = small.toLowerCase(); 
            e = hold.indexOf("e"); 
            
            input = small; 
        }
        
        hold = input.toLowerCase(); 
        i = hold.indexOf("i"); 
        while(i != -1)
        {
            small = input.substring(0, i); 
            small += input.substring(i+1); 
            
            hold = small.toLowerCase(); 
            i = hold.indexOf("i"); 
            
            input = small; 
        }
        
        hold = input.toLowerCase(); 
        o = hold.indexOf("o");  
        while(o != -1)
        {
            small = input.substring(0, o); 
            small += input.substring(o+1); 
            
            hold = small.toLowerCase(); 
            o = hold.indexOf("o"); 
            
            input = small; 
        }
      
        System.out.print(input + "\n"); 
    }
}
