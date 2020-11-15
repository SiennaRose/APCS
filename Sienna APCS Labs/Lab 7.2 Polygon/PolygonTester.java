
/**
 * Lab 7.2: PolygonTester.java
 * 
 * This class works in conjunction with the RegularPolygon class. It sends two variables: number 
 * of sides and their length. It then outputs the results passed by the RegularPolygon class
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */ 
import apcslib.*; 

public class PolygonTester
{
   public static void main(String[] args)
   {
       //testing default constructor
       RegularPolygon poly = new RegularPolygon();
       System.out.println("Default Polygon"); 
       System.out.println("number of sides = " + poly.getNumSide());
       System.out.println("length of side = " + poly.getSideLength()); 
       System.out.println("radius of the circumscribed circle = " + Format.left(poly.getR(), 2, 2)); 
       System.out.println("radius of inscribed circle = " + Format.left(poly.getr(), 2,2)); 
       System.out.println("vertex angle = " + Format.left(poly.vertexAngle(), 2, 2)); 
       System.out.println("perimeter = " + Format.left(poly.Perimeter(), 2, 2)); 
       System.out.println("area = " + Format.left(poly.Area(), 2, 2)); 
       
       //creating square and displaying output
       RegularPolygon square = new RegularPolygon(4, 10); 
       System.out.println("\nSquare Polygon"); 
       System.out.println("number of sides = " + square.getNumSide());
       System.out.println("length of side = " + square.getSideLength()); 
       System.out.println("radius of the circumscribed circle = " + Format.left(square.getR(), 2, 2)); 
       System.out.println("radius of inscribed circle = " + Format.left(square.getr(), 2,2)); 
       System.out.println("vertex angle = " + Format.left(square.vertexAngle(), 2, 2)); 
       System.out.println("perimeter = " + Format.left(square.Perimeter(), 2, 2)); 
       System.out.println("area = " + Format.left(square.Area(), 2, 2)); 
       
   }
}
