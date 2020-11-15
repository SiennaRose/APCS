import apcslib.*; 

/**
 * class KochCurve - 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */

public class KochCurve extends DrawingTool
{
    
    /**
     * constructor KochCurve - 
     */
    
    public KochCurve()
    {
        
    }
    
    //methods
    /**
     * <b>summary<b>: 
     */
    
    public void drawKochCurve(int level, int length)
    {
        down(); 
        
        if(level < 1) 
            forward(length);
        else
        {
            drawKochCurve((level - 1), (length/3)); 
            turnLeft(60); 
            drawKochCurve((level - 1), (length/3)); 
            turnRight(120); 
            drawKochCurve((level - 1), (length/3)); 
            turnLeft(60); 
            drawKochCurve((level - 1), (length/3)); 
        }
     
    }
}
