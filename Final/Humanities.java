import java.awt.*;  
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Humanities extends Frame implements MouseListener, MouseMotionListener,ActionListener
{
	/**The x value, location, of the mouse*/
    private int clicX;
    
    /**The y value, location, of the mouse*/
    private int clicY;

    /**The panel of this class*/
    private Panel panel;
    
    /**Boolean value used to tell whether text was dragged*/
    private boolean drag;   
    
    /**This label is the one that is being dragged*/
    JLabel find; 
    
    /**The frame of this class*/
    JFrame frame;
    
    /***/
    JLabel click1;
    JLabel intro;
    JLabel intro2;
    Button right;
    
    ImageIcon image2 = new ImageIcon("C:\\Users\\yeonjae\\workspace\\Game\\149606656731560.gif");
    
    Humanities()
    {  
        //Intializes the intance variables
        clicX = 0;
        clicY = 0;
        drag = false; 
        find = new JLabel();
        find.setIcon(image2);
        right = new Button("Time");
        
        screens();          
    } 
    
    public void screens()
    {
        //Intializes the panel and frame
        panel = new Panel();
        frame = new JFrame();
        
        //Three helper methods
        images();
        labels();   
        
        //adds the panel onto the frame
        frame.add(panel);
        
        //sets the size and 
        frame.setSize(900,900);
        frame.setVisible(true);          
    }
    public void images()
    {
    	JLabel click2;
        //Creates three images
        ImageIcon class1, problem;
        
        //intializes the images
        class1 = new ImageIcon("C:\\Users\\yeonjae\\workspace\\Game\\DelNorteHighSchool.jpg");
        problem = new ImageIcon("C:\\Users\\yeonjae\\workspace\\Game\\Riddle.jpg");
        
        //Assigns the images to JLabels
        click1 = new JLabel(class1);
        click2 = new JLabel(problem);
        
        //sets the bounds and adds mouse action listeners to find
        find.setBounds(570, 130, 200, 200);
        find.addMouseMotionListener(this);
        find.addMouseListener(this);
        
        //Sets the bounds of right, which is the right answer
        right.setBounds(570,220,50,20);    
        right.setBackground(Color.white); 
        
        //Sets the bounds of the problem picture
        click2.setBounds(300, 190, 200, 200);
        
        //problem.setBounds(300, 130, 200, 200);
        
        //adds the three elements onto the classroom image
        click1.add(find);
        click1.add(right);
        click1.add(click2);
        
        //adds the classroom image onto the panel
        panel.add(click1);
    }
    public void labels()
    {
        //Declaration of the text
        intro = new JLabel("Welcome to your second class English.");
        intro2 = new JLabel("Please answer this riddle to continue.");
        
        //sets the bounds of the labels
        intro.setBounds(160, 20, 500, 100);
        intro2.setBounds(170, 50, 500, 100);
        
        //sets the fonts of the labels
        Font font = new Font("Serif", Font.BOLD,30);
        intro.setFont(font);
        intro2.setFont(font);
               
        //adds all three labels onto the classroom image
        click1.add(intro);
        click1.add(intro2);
    }
    
    public void actionPerformed( ActionEvent e )  
    {  
        intro.setVisible(false);
        intro2.setVisible(false);
    }  
    
    public void mousePressed(MouseEvent e)
    {
        drag = true;
        if (e.getSource() == find) 
        {
            clicX = e.getX();
            clicY = e.getY();
        }
    }
        
    @Override
    public void mouseReleased(MouseEvent e)
    {
        drag = false;
    }
        
    @Override
    public void mouseDragged(MouseEvent e) 
    {
        if (e.getSource() == find) 
        {
            JComponent jc = (JComponent)e.getSource();
            jc.setLocation(jc.getX()+e.getX()-clicX, jc.getY()+e.getY()-clicY);
        }
    }
    public void mouseMoved(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
}
