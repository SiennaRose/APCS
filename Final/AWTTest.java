
/**
 * Write a description of class AWTTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class AWTTest extends Frame implements MouseMotionListener
{
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Image image = toolkit.getImage("pencil.png");  
    ImageIcon image2;
    AWTTest()
    {  
        //Mouse drawing on canvas
        
        image2 = new ImageIcon("DelNorteHighSchool.jpg");
        
        Cursor c = toolkit.createCustomCursor(image , new Point(0,0), "img");
        setCursor (c);
        addMouseMotionListener(this); 
                
        setSize(image2.getIconWidth() , image2.getIconHeight()); 
        setLocationRelativeTo(null);
        setVisible(true);
    }  
    
    public void paint(Graphics g) 
    {
        super.paint(g);
        g.drawImage(image2.getImage(), 0,0,null);
    }
    
    public void mouseDragged(MouseEvent e) 
    {  
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),200,200);  
    }  
    public void mouseMoved(MouseEvent e) {}  
  
    public static void main(String[] args) 
    {  
        new AWTTest();  
        
    }  
}
