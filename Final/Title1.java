import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Title1 implements ActionListener
{  
    Button b1;
    Button b2;
    public static JFrame f;
    Panel panel;  
    Label l2;
    Title1() 
    {  
        //Initializes the frame and panel
        f= new JFrame("Title");    
        panel=new Panel(); 
        
        //sends to screen method
        screen();
    }  
       
    private void screen()
    {  
        //sets the bounds and color of the panel
        panel.setBounds(0,0,900,900);    
        panel.setBackground(Color.black);  
        
        //In order to make the labels and buttons
        labels();
        button();
        
        //adds the panels to the frame and sets the size of the frame
        f.add(panel);
        f.setSize(900,900);  
        
        f.setLayout(null);    
        f.setVisible(true); //to make the frame visible  
    }
    private void labels()
    {
        //Creates the first label
        Label l1 =new Label("Are You A Del Norte Student");  
        l1.setBounds(150,50, 700,50);
        l1.setForeground(Color.white); //sets the color to white
        l1.setBackground(Color.black); //sets the background color to black
        Font font = new Font("Serif", Font.BOLD,50); //in order to change the font
        l1.setFont(font);
        
        //Creates the second label
        l2=new Label("NOW YOU'RE A DEL NORTE STUDENT SO CLICK YES");  
        l2.setLocation(500,500);
        l2.setForeground(Color.black); //sets the color to white
        l2.setBackground(Color.black); //sets the backgorund color to black
        Font font1 = new Font("Serif", Font.BOLD,20); //changes the font
        l2.setFont(font1);
        
        //Adds the two labels to the panel
        panel.add(l1);
        panel.add(l2);
    }
    private void button() 
    {
         //Creates the first button
         b1=new Button("YES");                 
         b1.setBounds(350,400,80,30);    
         b1.setBackground(Color.black);   
         
         //Creates the second button
         b2=new Button("NO");   
         b2.setBounds(500,400,80,30);    
         b2.setBackground(Color.black);
         
         //Adds an action listener to the first button
         b1.addActionListener(this);
         
         //Adds an Action listener to the second button
         b2.addActionListener ( new ActionListener()  
         {  
             public void actionPerformed( ActionEvent e )  
             {                   
                 l2.setForeground(Color.white); //sets the color to white
             }  
         }); 
         
         //Adds both buttons to the frame
         f.add(b1); 
         f.add(b2); 
    }
    public void actionPerformed(ActionEvent e) 
    {
        f.setVisible(false);
        new Maths();            
    }
}  

