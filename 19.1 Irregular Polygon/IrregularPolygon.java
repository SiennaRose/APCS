import java.awt.geom.*; // for Point2D.Double
import java.util.*; // for ArrayList
import apcslib.*; // for DrawingTool
/**
 * 19.1 Irregular Polygon
 * Sienna Sacramento
 * Mr. Lamsberger 
 * APCS: Period 3
 * Dec. 5, 2016
 */
public class IrregularPolygon
{
    private ArrayList myPolygon;
    private int count; 
    
    // constructors
    /**
     * constructor IrregularPolygon - initializes myPolygon ArrayList qnd count 
     */
     
    public IrregularPolygon() 
    {
        myPolygon = new ArrayList(4); 
        count = 0; 
    }
    
     // public methods
    /**
     * <b>summary</b>: adds new coordinates to end of array myPolygon
     */
    public void add(Point2D.Double aPoint) 
    { 
        myPolygon.add(aPoint); 
        count++; 
    }
    
    /**
     *  <b>summary</b>: draws the irregular polygon given by connecting the points entered
     */
    public void draw() 
    {
        DrawingTool pen = new DrawingTool();
        Point2D.Double pt;
        
        pen.up(); 
        for(int x = 0; x < count; x++)
        { 
            pt = (Point2D.Double)myPolygon.get(x);
            pen.move(pt.getX(), pt.getY()); 
            pen.down(); 
        }
        pt = (Point2D.Double)myPolygon.get(0);
        pen.move(pt.getX(), pt.getY()); 
        pen.up(); 
    }
    
    /**
     *  <b>summary</b>: determines perimeter of the irregular polygon
     */
    public double perimeter() 
    {
        Point2D.Double start = (Point2D.Double)myPolygon.get(0); 
        Point2D.Double end = (Point2D.Double)myPolygon.get(count-1);
        Point2D.Double pt1, pt2;
        double length = 0;
        for(int x = 0; x < count; x++)
        {
            pt1 = (Point2D.Double)myPolygon.get(x); 
            if((x+1) >= count)
                end = (Point2D.Double)myPolygon.get(x); 
            else
            {
                pt2 = (Point2D.Double)myPolygon.get(x+1); 
                length += pt1.distance(pt2); 
            }
        }
        length += end.distance(start); 
        return length; 
    }
    
    /**
     *  <b>summary</b>: determines the area of the irregular polygon 
     */
    public double area() 
    { 
        Point2D.Double pt1; 
        Point2D.Double pt2;
        double sum = 0.0, sub = 0.0; 
        
        for(int x = 0; x < count; x++)
        {
            pt1 = (Point2D.Double)myPolygon.get(x); 
            if(x == (count - 1))
            {
                pt2 = (Point2D.Double)myPolygon.get(0);
                sum += pt1.getX() * pt2.getY();
            }
            else
            {
                pt2 = (Point2D.Double)myPolygon.get(x+1);
                sum += pt1.getX() * pt2.getY();
            }
        }
        
        for(int y = 0; y < count; y++)
        {
            pt2 = (Point2D.Double)myPolygon.get(y); 
            if(y == (count - 1))
            {
                pt1 = (Point2D.Double)myPolygon.get(0);
                sub -= pt1.getX() * pt2.getY();
            }
            else
            {
                pt1 = (Point2D.Double)myPolygon.get(y+1);
                sub -= pt1.getX() * pt2.getY();
            }
        }
        return Math.abs(((sum + sub) / 2)); 
    }
} 

