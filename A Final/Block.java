
/**
 * The blocks that the biridie is trying to destroy
 * 
 * made by Sami Chang
 * 
 * outside sources:
 * http://zetcode.com/tutorials/javagamestutorial/
 * https://www.javatpoint.com/java-awt
 */

import java.awt.*;
import javax.swing.JLabel; 
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class Block implements Commons
{
    private int x; //x position of the block
    private int y; //y position of the block
    private boolean destroyed; //true if the block is destroyed
    private String message = ""; //the symbol shown on the block
    private Image image; //the block's image, a brick
   
    /**
     * Constructor for objects of class Block
     */
    public Block()
    {
        destroyed = false;
        
        ImageIcon block = new ImageIcon("brick.png");
        image = block.getImage(); 
    }

    /**
     * Returns whether or not the block is destroyed.
     */
    public boolean isDestroyed()
    {
        return destroyed;
    }
    
    /**
     * Sets whether or not the block is destroyed.
     */
    public void setDestroyed(boolean isIt)
    {
        destroyed = isIt;
    }
    
    /**
     * Returns x value of the block
     */
    public int getX()
    {
        return x;
    }
    
    /**
     * Returns y value of the block
     */
    public int getY()
    {
        return y;
    }
    
     /**
     * Sets x value of the block
     */
    public void setX(int xVal)
    {
        x = xVal;
    }
    
     /**
     * Sets y value of the block
     */
    public void setY(int yVal)
    {
        y = yVal;
    }
    
     /**
     * Returns a rectangle that represents the block's position
     */
    public Rectangle getRect() 
    {
        return new Rectangle(x, y,
                BLOCK_W, BLOCK_H);
    }
    
    /**
     * Adds the given character to the block's message that will be displayed
     */
    public void addMessage(char symbol)
    {
        message += symbol;
    }
    
     /**
     * Returns the block's message
     */
    public String getMessage()
    {
        return message;
    }
    
     /**
     * Returns the block's image
     */
    public Image getImage()
    {
        return image; 
    }
    

}
