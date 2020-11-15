
public class Picture
{
    public Picture()
    {
         ImageIcon image = new ImageIcon("image/pic1.jpg");
         JLabel label = new JLabel("", image, JLabel.CENTER);
         JPanel panel = new JPanel(new BorderLayout());
         panel.add( label, BorderLayout.CENTER );
    }
   
}
