/**
 * Defines the racket as an object that moves along the x axis. 
 * 
 * made by Sami Chang
 * 
 * outside sources:
 * http://zetcode.com/tutorials/javagamestutorial/
 * https://www.javatpoint.com/java-awt
 */

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class Racket implements Commons
{
    
    private int x; //x position of the racket
    private int y; //y position of the racket
    private int dx; //how much the racket moves in the x position
    private Image image; //the image of the racket
    

    /**
     * Constructor for objects of class Racket
     */
    public Racket()
    {
        //using values from the Commons interface
        x = PADDLE_X;
        y = PADDLE_Y; 
        ImageIcon racket = new ImageIcon("racket.png"); 
        image = racket.getImage(); 
    }

    /**
     * Moves the racket by adding the dx to the x position. 
     * Ensures that the racket doesn't move past the left and right edge of the court. 
     */
    public void move()
    {
        //first tests to see if the racket will pass the left edge then right edge
        if((x < 0) && (dx < 0))
            dx = 0; 
        else
            if ((x > WIDTH - 50) && (dx > 0))
                dx = 0;

        x += dx;
    }
    
    /**
     * Returns x value of the racket
     */
    public int getX()
    {
        return x;
    }
    
    /**
     * Returns y value of the racket
     */
    public int getY()
    {
        return y;
    }
    
    /**
     * Returns the racket's image
     */
    public Image getImage()
    {
        return image;
    }
    
    /**
     * The racket moves the user. 
     * Pressing the left key causes the racket to move to the left 3 units. 
     * Pressing the right key causes the racket to move to the right 3 units.
     */
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT)
        {
            dx = -3;
        }
        
        if(key == KeyEvent.VK_RIGHT)
        {
            dx = 3; 
        }
    }
    
    /**
     * Once the key is released, the racket stops moving
     */
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT) 
        {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) 
        {
            dx = 0;
        }
    }
    
    /**
     * Returns a rectangle that represents the racket's image. 
     * To mimic how a birdie hits the middle netted part of the racket, the rectangle is slightly 
     * lower than it normally would be if it represented the image itself.
     */
    Rectangle getRect() 
    {
        return new Rectangle(x + 15, y + 15,
                image.getWidth(null), image.getHeight(null));
    }
}
