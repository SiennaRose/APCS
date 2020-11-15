import apcslib.*; 

/**
 * class KochCurve - this class extends that of the DrawingTool class using
 * recursion to draw a Koch snowflake
 * 
 * @author Sienna Sacramento 
 * @version 1
 */

public class KochCurve extends DrawingTool
{
    //methods
    /**
     * <b>summary<b>: uses recursion to draw a koch snowflake
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
