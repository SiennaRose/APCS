
/**
 * Lab 7.3: RectangleMethodsTester.java
 * 
 * This class constructs a Rectangle, rectA, and calls setDirection, setWidth, and draw for each 
 * rectangle created 
 * 
 * @author (Sienna Sacramento) 
 * @version (1)
 */
public class RectangleMethodsTester
{
  public static void main(String[] args)
  {
      //declaring objects
      Rectangle rectA = new Rectangle(0, 0, 200, 50);
      Rectangle rectB = new Rectangle(rectA);
      
      rectA.draw();
     
      rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
      rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
       rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
       rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
       rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
       rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
       rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
      rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
      rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
      rectA.setDirection(rectA.getDirection() - 30);
      rectA.setWidth(rectA.getWidth() - 10);
      rectA.draw();
      
      
      //rectB & output
      rectB.setXPos(-150); 
      rectB.setDirection(rectB.getDirection() -30); 
      rectB.draw();
      rectB.drawString("width = " + rectB.getWidth(), -200, 200); 
      rectB.drawString("area = " + rectB.getArea(), -200, 160); 
      rectB.drawString("height = " + rectB.getHeight(), -20, 160); 
      rectB.drawString("perimeter = " + rectB.getPerimeter(), -200, 125);
  }
}
