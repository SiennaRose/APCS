import java.awt.*;  
import java.awt.event.*;
public class ButtonExample 
{  
public static void main(String[] args) 
{  
    Frame f=new Frame("Button Example");  
    Button b=new Button("Click Here");  
    b.setBounds(10,115,90,40);  
    b.setBackground(Color.black);
    
    b.addActionListener(new ActionListener()
    {
    public void actionPerformed(ActionEvent e)
    {
        f.setBackground(Color.black); 
    }
});   
    f.add(b);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  


}  
