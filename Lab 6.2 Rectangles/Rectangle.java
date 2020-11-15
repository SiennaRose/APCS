
/**
 * Lab 6.2: Rectangle.java
 * 
 * 13 September 2016
 * 
 * This class works in conjunction with the RectangleTester class. It is an encapsulation of 
 * the work behind creating a rectangle if passed these parameters: x, y(locations), length, and 
 * heigth. This class also calculates the rectangle's perimeter and area. It then sends this 
 * information back to the RectangleTester class/ driver class. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
import apcslib.*;

public class Rectangle
{
    //instance variables
    private double myX; //the x coordinate of the rectangle 
    private double myY; //the y coordinate of the rectangle
    private double myWidth; // the width of the rectangle
    private double myHeight; //the height of the rectangle
    
    //declaring and instantiating where the rectangle will be drawn on
    // Creates a 500 x 500 SketchPad with a DrawingTool, pen, that is used
    // to display Rectangle objects. The Drawingtool is declared static
    // so that multiple Rectangle objects can be drawn on the Sketchpad
    // at the same time. 
    private static DrawingTool pen = new DrawingTool(new SketchPad(500, 500)); 
    
    //Constructors
    public Rectangle()
    {
        // Creates a default instance of a Rectangle object with all dimensions
        // set to zero. 
        myX = 0; 
        myY = 0; 
        myWidth = 0; 
        myHeight = 0; 
    }
    
    public Rectangle(double x, double y, double width, double height)
    {
        // Creates a new instance of a Rectangle object with the left and right
        // edges of the rectangle at x and x + width. The top and bottom edges
        // are at y and y + height. 
        myX = x; 
        myY = y; 
        myWidth = width; 
        myHeight = height; 
    }
    
    //Methods
    public double getPerimeter()
    {
       // calculates and returns the perimeter of the rectangle
       return (2 * myWidth) + (2 * myHeight);
    }
    
    public double getArea()
    {
       // Calculates and returns the are of the rectangle. 
       return (myWidth) * (myHeight); 
    }
    
    public void draw()
    {
        // Draws a new instance of a Rectangle object with the left and right
        // edges of the rectangle at x and x + width. The top and bottom edges
        // are at y and y + height. 
        pen.up(); 
        pen.move(myX, myY); 
        pen.down();  
        pen.move((myWidth + myX), myY); 
        pen.move((myWidth + myX), (myHeight + myY));
        pen.move(myX, (myHeight + myY)); 
        pen.move(myX, myY); 
    }
}
