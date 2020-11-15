import apcslib.*; 
/**
 * class GraphicPolygon - draws the polygon determined by values: numSides, sideLength, x, and y. 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */

public class GraphicPolygon extends RegularPolygon
{
     private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
     private double xPosition, yPosition;

     // constructors
     /**
      *  constructor GraphicPolygon - 
      *  Initializes a polygon of numSides sides and sideLength
      *  length in the superclass. The polygon is centered at
      *  xPosition = yPosition = 0
      */
   
     public GraphicPolygon(int numSides, double sideLength)
     {
         super(numSides, sideLength); 
         
         xPosition = 0; 
         yPosition = 0; 
         moveTo(xPosition, yPosition); 
     }
     
     /**
      *    constructor GraphicPolygon - 
      *    Initializes a polygon of numSides sides and sideLength
      *    length in the superclass. The polygon is centered at
      *    xPosition = x and yPosition = y
      */
  
     public GraphicPolygon(int numSides, double sideLength, double x, double y)
     {
         super(numSides, sideLength); 
         
         xPosition = x; 
         yPosition = y; 
          moveTo(xPosition, yPosition); 
     } 
     
      // public methods
      /**
       * <b>summary<b>: Sets xPosition = x and yPosition = y to correspond to the new
       * center of the polygon
       */
  
      public void moveTo(double x, double y)
      {
          pen.up();
          pen.move(xPosition, yPosition); 
      }
      
      /**
       * <b>summary<b>: 
       *  Draws the polygon about the center point (xPosition, yPosition).
       *  Uses properties inherited from RegularPolygon to determine the
       *  number and length of the sides, the radius of the inscribed circle,
       *  and the vertex angle with which to draw the polygon
       */
  
      public void draw()
      {
          pen.forward(getR()); 
          pen.down();
          pen.turnRight(vertexAngle()/2);

          for(int z = 1; z <= getNumSide(); z++)
          {
              pen.forward(getSideLength());
              pen.turn(180 - vertexAngle()); 
          }
          
          
      }
}
 

