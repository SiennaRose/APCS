

/**
 * Lab Exercise 1.1: DrawHouse.java
 * August 22, 2016
 * APCS Per. 4
 * 
 * This class will create a piece of paper and pen, place pen on paper and draw a house with 
 * two windows, a door, and slanted roof. The paper is 500 x 500
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*; //drawingtool library

public class DrawHouse
{
    public static void main(String[] args) 
    {
      // object declarations 
      DrawingTool pencil; 
      SketchPad paper; 
    
       //object instantiations
       paper = new SketchPad(500, 500); 
       pencil = new DrawingTool(paper);
    
      //Building the roof of the house
      pencil.up();
      pencil.move(0, 100); 
      pencil.down();
      pencil.move(200, 40);  
      pencil.move(-200, 40);
      pencil.move(0, 100); 
      
      //Building house base
      pencil.up();
      pencil.move(200, 40); 
      pencil.down(); 
      pencil.move(200, -150);
      pencil.move(-200, -150); 
      pencil.move(-200, 40); 
      
      //Building door
      pencil.up(); 
      pencil.move(-30, -150);
      pencil.down();
      pencil.move(-30, -60);
      pencil.move(30, -60);
      pencil.move(30, -150);
      
      //Building Windows
      pencil.up();
      pencil.move(70, -10); 
      pencil.down();
      pencil.move(150, -10);
      pencil.move(150, -80); 
      pencil.move(70, -80);
      pencil.move(70, -10); 
      
      //second window on the left
      pencil.up();
      pencil.move(-70, -10);
      pencil.down();
      pencil.move(-150, -10); 
      pencil.move(-150, -80); 
      pencil.move(-70, -80);
      pencil.move(-70, -10);
      
    }
}
