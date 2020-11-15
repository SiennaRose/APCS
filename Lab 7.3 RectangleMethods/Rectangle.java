
/**
 * Lab 7.3: Rectangle.java
 * 
 * This class is an updated version of Lab 6.2: Rectangle class. It will construct a Rectangle from an
 * exisitng one, get and set the x coordinate, y coordinate, width, and height parameter, set the 
 * orientation in which the rectangle will be drawn and display textual information on the dtrawing 
 * surface. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*; 

public class Rectangle
{
   //declaring instance variables 
   private double myX;          //the x coordniate of the rectangle
   private double myY;          //the y coordinate of the rectangle
   private double myWidth;      //the width of the rectangle
   private double myHeight;     //the height of the rectangle
   
   // saves the direction the pen is pointing
   // (0 = horizontal, pointing right)
   private double myDirection;
   
   // Creates a 500 x 500 SketchPad with a DrawingTool, pen, that is used
   // to display Rectangle objects. The Drawingtool is declared static
   // so that multiple Rectangle objects can be drawn on the Sketchpad
   // at the same time.
   private static DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
   
   //constructors 
    Rectangle()
    {
        // Creates a default instance of a Rectangle object with all dimensions
        // set to zero.
        myX = 0.0; 
        myY = 0.0; 
        myWidth = 0.0; 
        myHeight = 0.0; 
        myDirection = 90; 
    }
    
    Rectangle(double x, double y, double width, double height) 
    { 
       // Creates a new instance of a Rectangle object with the left and right
       // edges of the rectangle at x and x + width. The top and bottom edges
       // are at y and y + height.
       myX = x; 
       myY = y; 
       myWidth = width; 
       myHeight = height;
       myDirection = 90; 
    }
    
   Rectangle(Rectangle rect)
   {
       // Creates a new instance of a Rectangle object that is a copy of an
       // existing Rectangle object. 
       myX = rect.getXPos(); 
       myY = rect.getYPos();
       myWidth = rect.getWidth(); 
       myHeight = rect.getHeight(); 
       myDirection = 90; 
   }
   
   //methods
   public void setXPos(double x)
   {
       // Sets the x coordinate of this Rectangle
       myX = x; 
   }
 
   public void setYPos(double Y) 
   {
       // Sets the y coordinate of this Rectangle
       myY = Y; 
   }
   
   public void setWidth(double width) 
   {
       // Sets the width this Rectangle
       myWidth = width; 
   }
    
   public void setHeight(double height) 
   {
      // Sets the height of this Rectangle
      myHeight = height; 
   }
   
   public void setDirection(double direction) 
   {
       // Sets the direction the DrawingTool is pointing
       // 0 = horizontal to the right
       myDirection = direction; 
       pen.setDirection(myDirection); 
    }

   public double getXPos() 
   {
       // Returns the x coordinate of this Rectangle
       return myX; 
   }
   
   public double getYPos()
   {
      // Returns the y coordinate of this Rectangle
      return myY; 
   }

   public double getWidth()
   {
       // Returns the width of this Rectangle
       return myWidth; 
   }

   public double getHeight()
   {
       // Returns the height of this Rectangle
       return myHeight; 
   }

   public double getDirection()
   {
       // Returns the direction the DrawingTool is pointing
       // 0 = horizontal to the right
       return myDirection;
   }

   public double getPerimeter()
   {
       // calculates and returns the perimeter of the rectangle
       return (2 * myWidth) + (2 * myHeight);
   }

   public double getArea()
   {
       // Calculates and returns the area of the rectangle.
       return (myWidth) * (myHeight); 
   }

   public void drawString(String str, double x, double y)
   {
        // Draws String str at the specified x and y coordinates
        pen.up(); 
        pen.move(x, y); 
        pen.down(); 
        pen.drawString(str); 
   }

   public void draw()
   {
       // Draws a new instance of a Rectangle object with the left and right
       // edges of the rectangle at x and x + width. The top and bottom edges
       // are at y and y + height.
       pen.up();
       pen.move(myX, myY);
       pen.down();   
       pen.forward(myHeight); 
       pen.turnRight(90);
       pen.forward(myWidth); 
       pen.turnRight(90); 
       pen.forward(myHeight);
       pen.move(myX, myY); 
    }
}
