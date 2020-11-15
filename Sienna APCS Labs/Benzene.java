
/**
 * Lab 2.1: Benzene.java
 * APCS
 * August 23, 2016
 * 
 * This class creates an illustration of the abbreviated symbol for Benzene (C6H6).
 * It's a circle centered inside of a hexagon. It does this by first creating paper and a 
 * pencil. The pencil goes with the paper and the paper is 300 x 300. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*; //DrawingTool Library

public class Benzene 
{
    public static void main(String[] args)
    {
        //object declarations
        DrawingTool pencil;
        SketchPad paper;
        
        //object instantiations
        paper = new SketchPad(300, 300);
        pencil = new DrawingTool(paper); 
        
        //Building circle
        pencil.drawCircle(30); 
        
        //building hexagon
        pencil.up();
        pencil.move(-25, 43); 
        pencil.down();
        pencil.move(25, 43); 
        pencil.move(50, 0); 
        pencil.move(25, -43);
        pencil.move(-25, -43); 
        pencil.move(-50, 0);
        pencil.move(-25, 43); 
  
    }
}
