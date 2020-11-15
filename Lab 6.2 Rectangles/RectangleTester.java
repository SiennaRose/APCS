
/**
 * Lab 6.2: RectangleTester.java
 * 
 * 13 September 2016
 * 
 * This class works in conjunction with the Rectangle class. It gets input from the user such as
 * x, y(locations), width, and height. It passes these parameters to the Rectangle class where work is
 * done. The rectangle class then sends back the following: a drawn rectangle, the Rectangle's 
 * perimeter and area. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
public class RectangleTester
{
   public static void main(String[] args)
   {
       // Constructing the biggest rectangle: A
       Rectangle rectA = new Rectangle(-200, -200, 400, 400);
       rectA.draw(); // draw the rectangle
       System.out.println("\nRectangle A"); 
       System.out.println("Perimeter = " + rectA.getPerimeter());
       System.out.println("Area = " + rectA.getArea()); 
       
       // Constructing the horizontal & middle rectangle: B
       Rectangle rectB = new Rectangle(-200, -80, 400, 160);
       rectB.draw(); // draw the rectangle
       System.out.println("\nRectangle B"); 
       System.out.println("Perimeter = " + rectB.getPerimeter());
       System.out.println("Area = " + rectB.getArea());
       
       
       // Constructing the verticle & medium rectangle: C
       Rectangle rectC = new Rectangle(-80, -200, 160, 400);
       rectC.draw(); // draw the rectangle
       System.out.println("\nRectangle C"); 
       System.out.println("Perimeter = " + rectC.getPerimeter());
       System.out.println("Area = " + rectC.getArea());
       
   }
}
