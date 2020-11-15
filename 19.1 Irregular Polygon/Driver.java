import chn.util.*; 
import apcslib.*; 
import java.awt.geom.*; // for Point2D.Double
/**
 * 19.1 Irregular Polygon 
 * Sienna Sacramento 
 * Mr. Lansberger
 * APCS: Period 3
 * Dec. 5, 2016
 */
public class Driver
{
    public static void main(String[] args)
    {
        ConsoleIO keyboard = new ConsoleIO(); 
        IrregularPolygon poly = new IrregularPolygon();
        Point2D.Double aPoint;
        double x, y, perimeter, area; 
        int answer = 2; 
     
        
        System.out.println("Irregular Polygon DrawingTool 2000");
        
        do
        {
            System.out.print("Please enter the x coordinate: "); 
            x = keyboard.readDouble(); 
            System.out.print("Please enter the y coordinate: ");
            y = keyboard.readDouble();  
            System.out.print("Do you have anymore points? (1 = Yes/2 = No) ");
            answer = keyboard.readInt(); 
            aPoint = new Point2D.Double(x, y); 
            poly.add(aPoint); 
        }
        while(answer == 1);
        poly.draw(); 

        perimeter = poly.perimeter(); 
        System.out.println("\nPerimeter = " + Format.right(perimeter, 3, 1) + " units"); 
        area = poly.area(); 
        System.out.println("Area = " + Format.right(area, 3, 1) + " square units");
    }
}
