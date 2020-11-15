package graphics;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
/**
 * Loads an image for us
 * 
 * @author Lauryn Jefferson
 * @version 1/13/17
 */
public class ImageLoader
{
    public static BufferedImage loadImage(String path)
    {
        try
        {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } 
        catch(Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
