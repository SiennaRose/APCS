
/**
 * class GraphicPolygonDriver -
 * 
 * @author Sienna Sacramento
 * @version 1
 */
public class GraphicPolygonDriver
{
   public static void main(String[] args)
   {
       GraphicPolygon square; 
       GraphicPolygon octagon; 
       GraphicPolygon ennD; 
       GraphicPolygon ennH; 
       
       square = new GraphicPolygon(4, 150);
       square.draw(); 
       
       
       octagon = new GraphicPolygon(8, 100);
       octagon.draw(); 
       
       ennD = new GraphicPolygon(19, 50);
       ennD.draw(); 
       
       ennH = new GraphicPolygon(91, 10);
       ennH.draw(); 
       
   }
}
