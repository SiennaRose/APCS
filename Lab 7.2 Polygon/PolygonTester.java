
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
       System.out.println("number of sides = " + Format.left(poly.getNumSide(),2,2));
       System.out.println("length of side = " + Format.left(poly.getSideLength(),2, 2)); 
       System.out.println("radius of the circumscribed circle = " + Format.left(poly.getR(), 2, 2)); 
       System.out.println("radius of inscribed circle = " + Format.left(poly.getr(), 2,2)); 
       System.out.println("vertex angle = " + Format.left(poly.vertexAngle(), 2, 1)); 
       System.out.println("perimeter = " + Format.left(poly.Perimeter(), 2, 2)); 
       System.out.println("area = " + Format.left(poly.Area(), 2, 2)); 
       
       //creating square and displaying output
       RegularPolygon square = new RegularPolygon(4, 10); 
       System.out.println("\nSquare Polygon"); 
        System.out.println("number of sides = " + Format.left(square.getNumSide(),2,2));
       System.out.println("length of side = " + Format.left(square.getSideLength(),2, 2)); 
       System.out.println("radius of the circumscribed circle = " + Format.left(square.getR(), 2, 2)); 
       System.out.println("radius of inscribed circle = " + Format.left(square.getr(), 2,2)); 
       System.out.println("vertex angle = " + Format.left(square.vertexAngle(), 2, 2)); 
       System.out.println("perimeter = " + Format.left(square.Perimeter(), 2, 2)); 
       System.out.println("area = " + Format.left(square.Area(), 2, 2)); 
       
       //creating octagon and displaying output
       RegularPolygon octagon = new RegularPolygon(8, 100); 
       System.out.println("\nOctagon Polygon"); 
       System.out.println("number of sides = " + Format.left(octagon.getNumSide(),2,2));
       System.out.println("length of side = " + Format.left(octagon.getSideLength(),2, 2)); ; 
       System.out.println("radius of the circumscribed circle = " + Format.left(octagon.getR(), 2, 2)); 
       System.out.println("radius of inscribed circle = " + Format.left(octagon.getr(), 2,2)); 
       System.out.println("vertex angle = " + Format.left(octagon.vertexAngle(), 2, 2)); 
       System.out.println("perimeter = " + Format.left(octagon.Perimeter(), 2, 2)); 
       System.out.println("area = " + Format.left(octagon.Area(), 2, 2)); 
       
       //creating enneadecagon and displaying output
       RegularPolygon enn = new RegularPolygon(19, 2); 
       System.out.println("\nEnneadecagon Polygon"); 
      System.out.println("number of sides = " + Format.left(enn.getNumSide(),2,2));
       System.out.println("length of side = " + Format.left(enn.getSideLength(),2, 2));  
       System.out.println("radius of the circumscribed circle = " + Format.left(enn.getR(), 2, 2)); 
       System.out.println("radius of inscribed circle = " + Format.left(enn.getr(), 2,2)); 
       System.out.println("vertex angle = " + Format.left(enn.vertexAngle(), 2, 2)); 
       System.out.println("perimeter = " + Format.left(enn.Perimeter(), 2, 2)); 
       System.out.println("area = " + Format.left(enn.Area(), 2, 2)); 
       
       //creating enneacontakaqihenagon and displaying output
       RegularPolygon hen = new RegularPolygon(91, 0.5); 
       System.out.println("\nEnneacontakaihenagon Polygon"); 
       System.out.println("number of sides = " + Format.left(hen.getNumSide(),2,2));
       System.out.println("length of side = " + Format.left(hen.getSideLength(),2, 2));  
       System.out.println("radius of the circumscribed circle = " + Format.left(hen.getR(), 2, 2)); 
       System.out.println("radius of inscribed circle = " + Format.left(hen.getr(), 2,2)); 
       System.out.println("vertex angle = " + Format.left(hen.vertexAngle(), 2, 2)); 
       System.out.println("perimeter = " + Format.left(hen.Perimeter(), 2, 2)); 
       System.out.println("area = " + Format.left(hen.Area(), 2, 2)); 
   }
}
