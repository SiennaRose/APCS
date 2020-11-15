 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
//import java.event.*;
//@SuppressWarnings("serial")
public class Game extends JPanel 
{
    int x = 50;
    int y = 0;
  Button b;
    int p = 0;
    private void moveBall() {

      int q = 0;
      if(x<800 && p != 1)
      {
          x++;
          y++;
      }
       if(x == 800)
        p = 1;
           if(p == 1){
         y--;
         x--;
        }
        if(x == 50)
        p = 0;
      
           
      
    }
    //@Override
    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillArc(x, y, 30, 30, 45, 90);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Sample Frame");
        Game game = new Game();
        frame.add(game);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}
