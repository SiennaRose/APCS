
/**
 * Defines the birdie as an object that moves on the xy axis
 * 
 * made by Sami Chang
 * 
 * outside sources:
 * http://zetcode.com/tutorials/javagamestutorial/
 * https://www.javatpoint.com/java-awt
 */

import java.awt.*;
import javax.swing.ImageIcon;

public class Birdie implements Commons
{
    
    private int x; //x position of the birdie
    private int y; //y position of the birdie
    private double dx = SPEED; //how much the birdie moves in the x position
    private double dy = SPEED; //how much the birdie moves in the y position
    private Image image; //the image of the birdie

    /**
     * Constructor for objects of class Birdie
     */
    public Birdie()
    {
        //using the constants from the commons interface
        x = BALL_X; 
        y = BALL_Y; 
        ImageIcon birdie = new ImageIcon("birdie.png");
        image = birdie.getImage(); 
    }

    /**
     * Method that details how the birdie moves. 
     */
    public void move()
    {
        //first add how much the birdie will travel to the x and y values to find the new position
        x += dx; 
        y += dy; 
        
        if(x == 0)
        {
            setXDir(SPEED); //if the birdie hits the left edge of the court, it moves right
        }
        
        if(x == WIDTH - 50)
        {
            setXDir(-SPEED); //if the birdie hits the right edge of the court, it moves left
        }
        
        if(y == 0)
        {
            setYDir(SPEED); //if the birdie hits the top of the court, it moves down
        }
        
        //to ensure the birdie is always moving in a productive way
        if(dx == 0)
        {
            dx = SPEED; 
        }
        if(dy == 0)
        {
            dx = SPEED;
        }
    }
    
    /**
     * Returns x value of the birdie
     */
    public int getX()
    {
        return x;
    }
    
    /**
     * Returns y value of the birdie
     */
    public int getY()
    {
        return y;
    }
    
     /**
     * Sets x value of the birdie
     */
    public void setX(int xVal)
    {
        x = xVal;
    }
    
     /**
     * Sets y value of the birdie
     */
    public void setY(int yVal)
    {
        y = yVal;
    }
    
    /**
     * Returns the dx of the birdie
     */
    public double getXDir()
    {
        return dx;
    }
    
    /**
     * Returns the dy of the birdie
     */
    public double getYDir()
    {
        return dy;
    }
    
    /**
     * Sets the dx of the birdie
     */
    public void setXDir(double x)
    {
        dx = x;
    }
    
    /**
     * Sets the dy of the birdie
     */
    public void setYDir(double y)
    {
        dy = y;
    }
    
    /**
     * Returns the birdie's image
     */
    public Image getImage()
    {
        return image;
    }
    
    /**
     * Returns a rectangle that represents the birdie's position
     */
    Rectangle getRect() 
    {
        return new Rectangle(x , y ,
                image.getWidth(null), image.getHeight(null));
    }
    
}
