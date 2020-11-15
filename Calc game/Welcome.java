import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
public class Welcome{  
    JTextField tf1,tf,tf3, count;  
    JButton b1,b2; 
    int x; 
    boolean check; 
    Welcome(){  
        String[] derivative = new String[21]; 
        derivative[0] = "d/dx[x^n] = "; 
        derivative[1] = "d/dx[csc u] = ";
        derivative[2] = "d/dx[f(x)/g(x)] = ";
        derivative[3] = "d/dx[sin^-1 u] = ";
        derivative[4] = "d/dx[sin u] = ";
        derivative[5] = "d/dx[cot u] = ";
        derivative[6] = "d/dx[tan^-1 u] = ";
        derivative[7] = "d/dx[sec^-1 u] = ";
        derivative[8] = "d/dx[logb u] = ";
        derivative[9] = "d/dx[b^u] = ";
        derivative[10] = "d/dx[c] = ";
        derivative[11] = "d/dx[f(x)g(x)] = ";
        derivative[12] = "d/dx[tan u] = ";
        derivative[13] = "d/dx[f(g(x))] = ";
        derivative[14] = "d/dx[sec u] = ";
        derivative[15] = "d/dx[cos u] = ";
        derivative[16] = "d/dx[cos^-1 u] = ";
        derivative[17] = "d/dx[csc^-1 u] = ";
        derivative[18] = "d/dx[cot^-1 u] = ";
        derivative[19] = "d/dx[ln u] = ";
        derivative[20] = "d/dx[e^u] = ";
        
        x = 0; 
        
        String[] answers = new String[21];
        answers[0] = "nx^n-1";
        answers[1] = "-cosucotu(du/dx)";
        answers[2] = "[[g(x)*f^1(x)-f(x)*g^1(x)]/(g(x)^2](du/dx)";
        answers[3] = "1/(sqrt(1-u^2)*(du/dx)";
        answers[4] = "cosu(du/dx)";
        answers[5] = "-csc^2u(du/dx)";
        answers[6] = "1/(1+u^2)*(du/dx)";
        answers[7] = "1/(u(sqrt(u^2 - 1)))*(du/dx)";
        answers[8] = "1/(ulnb)*(du/dx)";
        answers[9] = "b^ulnb(du/dx)";
        answers[10] = "0";
        answers[11] = "f(x)*g(x)+g(x)*f(x)";
        answers[12] = "sec^2u(du/dx)";
        answers[13] = "f^1(g(x))*g^1(x)*(du/dx)";
        answers[14] = "secutanu(du/dx)";
        answers[15] = "-sinu(du/dx)";
        answers[16] = "-1/(sqrt(1-u^2)*(du/dx))";
        answers[17] = "-1/u(sqrt(u^2-1)*(du/dx))";
        answers[18] = "-1/(1+u^2)*(du/dx)";
        answers[19] = "1/u*(du/dx)";
        answers[20] = "e^u(du/dx)";
        
        
        check = false;
        
        
        
        
        JFrame f= new JFrame("Calc Game");  
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,500,500);
        panel.setBackground(Color.blue);
        
        JLabel title = new JLabel("Welcome to the Calc Game"); 
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setForeground(Color.white); 
        title.setBounds(10,1,500,100); 
        
        JLabel des = new JLabel("Your goal is to correctly input as many derivative formulas as you can."); 
        des.setFont(new Font("Serif", Font.BOLD, 15));
        des.setForeground(Color.white); 
        des.setBounds(15,70,500,50); 
        
        JLabel des1 = new JLabel("Start by clicking next."); 
        des1.setFont(new Font("Serif", Font.BOLD, 15));
        des1.setForeground(Color.white); 
        des1.setBounds(150,90,500,50); 
        
        JLabel title1 = new JLabel("Type Here"); 
        title1.setFont(new Font("Serif", Font.BOLD, 15));
        title1.setForeground(Color.white); 
        title1.setBounds(70,265,80,25); 
        
        JLabel lab = new JLabel("Number"); 
        lab.setFont(new Font("Serif", Font.BOLD, 15));
        lab.setForeground(Color.white); 
        lab.setBounds(10,150,80,25);
        
        tf=new JTextField();  
        tf.setBounds(170,150,100,30); 
        
        count=new JTextField();  
        count.setBounds(70,150,30,30); 
        
        tf1=new JTextField();  
        tf1.setBounds(150,270,150,20);  
         
        tf3=new JTextField();  
        tf3.setBounds(150,350,150,20);  
        tf3.setEditable(false); 
        
        b1=new JButton("Enter answer");  
        b1.setBounds(50,400,200,50);
        
        b2=new JButton("Next");  
        b2.setBounds(300,400,100,50);
        
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s1=tf1.getText();  
                if(s1.equals(answers[x]))
                {
                     tf3.setText("Correct"); 
                }
                else
                    tf3.setText("Wrong");
                check = true; 
            }
        }); 
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText(derivative[x]); 
                String result = String.valueOf(x + 1); 
                count.setText(result);
                if(check)
                {
                    x++;
                    check = false;
                }
                
            }
        });
        
        //b2.addActionListener(this); 
        panel.add(count);
        panel.add(title); 
        panel.add(title1); 
        panel.add(des);
        panel.add(des1);
        panel.add(tf); 
        panel.add(lab);
        panel.add(tf1); panel.add(tf3); panel.add(b1); panel.add(b2); 
        
        f.add(panel); 
        
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    
   /* public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  */
    
    public static void main(String[] args) {  
        new Welcome();  
    } 
}  
