package principal;
import java.awt.*;
import javax.swing.*;
public class RedButton {
   private JFrame f;
   private JButton btn;
   public RedButton() {
      f = new JFrame("Test");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      int r = 255;
      int g = 0;
      int b = 0;
      Color c = new Color(r, g, b);
      btn = new JButton("Press Me!");
      btn.setForeground(c);
   }
   public void launchFrame() {
      f.add(btn, BorderLayout.CENTER);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public static void main(String args[]) {
      RedButton inst = new RedButton();
      inst.launchFrame();
   }
}
