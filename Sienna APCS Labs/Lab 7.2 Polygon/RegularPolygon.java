
/**
 * Lab 7.2: RegularPolygon.java
 * 
 * 15 September 2016
 * 
 * This class works in conjunction with the PolygonTester class. It accepts the arguments for the 
 * number of sides of a polygon and the side length. After recieveing this information, this class will
 * calculate the vertex angle, perimeter, area, radius of the inscribed circle, and radius of the 
 * cicumscribed circle. 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */

public class RegularPolygon
{
    //instance variables
    private int myNumSides;         // # of sides
    private double mySideLength;    // length of side
    private double myR;             // radius of circumscribed circle
    private double myr;             // radius of inscribed circle
    
    //constuctors
    public RegularPolygon() 
    {
        //default constructor
        myNumSides = 3; 
        mySideLength = 10.0; 
    }

    public RegularPolygon(int numSides, double sideLength) 
    {
        myNumSides = numSides;
        mySideLength = sideLength; 
    }
    
    //private methods
    private void calcr() 
    {
        //calculates the radius of the inscribed circle
        myr = (mySideLength / 2) * (1 / Math.tan(Math.PI / myNumSides)); 
    }
    
    private void calcR() 
    {
        //calculates the radius of the circumscribed circle
        myR = (mySideLength / 2) * (1 / Math.sin(Math.PI/ myNumSides)); 
    }

    // public methods
    public double vertexAngle() 
    {
        //calculates the angle of the vertex
        return ((myNumSides - 2) / myNumSides) * 180; 
    }
    
    public double Perimeter() 
    {
        return myNumSides * mySideLength; 
    }
    
    public double Area() 
    {
        //calculates the polygon's area
        return ((myNumSides * Math.pow(myR, 2)) / 2) * (Math.sin((Math.PI * 2) / myNumSides));
    }
    
    public double getNumSide() 
    {
        //sends back the # of sides of the polgon back to call
        return myNumSides; 
    }
    
    public double getSideLength() 
    {
        //sends the side lengths of the polygon back to call
        return mySideLength; 
    }
    
    public double getR() 
    {
        //sends the radius of the circumscribed circle back to call
        return myR; 
    }
    
    public double getr() 
    {
        //sends the radius of the inscribed circle back to call
        return myr; 
    }
}
