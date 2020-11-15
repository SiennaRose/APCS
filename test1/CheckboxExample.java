import java.awt.*;  
public class CheckboxExample  
{  
     CheckboxExample(){  
       Frame f= new Frame("Checkbox Example");  
        Checkbox checkbox1 = new Checkbox("C++");  
        checkbox1.setBounds(10,10, 50,50);  
        Checkbox checkbox2 = new Checkbox("Java", true);  
        checkbox2.setBounds(10,150, 50,50);  
        f.add(checkbox1);  
        f.add(checkbox2);  
        f.setSize(40,40);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
{  
    new CheckboxExample();  
}  
}  
