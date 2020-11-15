
/**
 * class CurveDriver - this is the driver class to the KochCurve class. It creates a Koch 
 * snowflake
 * 
 * @author Sienna Sacramento  
 * @version 1
 */
public class CurveDriver extends KochCurve
{
    public static void main(String[] args)
    {
        //declaring objects 
        KochCurve curvyPen = new KochCurve(); 
        
        curvyPen.up(); 
        curvyPen.move(-150, 0); 
        curvyPen.setDirection(0); 
        curvyPen.drawKochCurve(4, 300); 
        
        curvyPen.turnRight(120); 
        curvyPen.drawKochCurve(4, 300); 
        
        curvyPen.turnRight(120); 
        curvyPen.drawKochCurve(4, 300); 
    }
}
