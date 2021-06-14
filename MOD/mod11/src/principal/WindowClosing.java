package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowClosing {
private JFrame f;
   private JTextField tf;
   public WindowClosing() {
      f = new JFrame("Window closing example");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      tf = new JTextField(30);
   }
   public void launchFrame() {
      JLabel label = new JLabel("Close the window using the X icon");
      f.add(label, BorderLayout.NORTH);
      f.add(tf, BorderLayout.SOUTH);
      // Add a listener that uses an anonymous class
      f.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.out.println("Window closed");
            System.exit(0);
         }
      });      // <- note the closing parenthesis
      f.setSize(500, 300);
      f.setVisible(true);
   }
   public static void main(String args[]) {
      WindowClosing obj = new WindowClosing();
      obj.launchFrame();
   }
}
