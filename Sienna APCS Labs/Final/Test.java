 


import java.awt.Color;
import java.awt.Font;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Test 
{
    public static void main(String[] args) 
    {
        JFrame border = new JFrame();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setSize(900,400);
        JLabel word = new JLabel("  HOMECOMING?  ");  
        word.setFont(new Font("Serif", Font.BOLD, 100));
        border.setBackground(Color.white);
        word.setBackground(Color.white);
        word.setForeground(Color.GREEN);
        border.add(word);
        border.setVisible(true);
        
        int g = 191; 
        int b = 223;  
        boolean bSubtracting = true;
        while (true)
        {
            
            try 
            {
               Thread.sleep(5);
            } 
            catch (InterruptedException e) {}
            
            Color c = new Color(255,g,b);
           
            if (bSubtracting) 
            {
                g--;
                b--;
            } 
            else 
            {
                g++;
                b++;
            }  
                if (g < 1) 
                {
                    bSubtracting = false;
                } 
                else 
                    if (g > 191) 
                    {
                        bSubtracting = true;
                    }
           
            word.setForeground(c);
        }
        
    }
}