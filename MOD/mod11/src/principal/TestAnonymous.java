package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestAnonymous {
   private JFrame f;
   private JTextField tf;
   public TestAnonymous() {
      f = new JFrame("Anonymous classes example");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      tf = new JTextField(30);
   }
   public void launchFrame() {
      JLabel label = new JLabel("Click and drag the mouse");
      // Add components to the frame
      f.add(label, BorderLayout.NORTH);
      f.add(tf, BorderLayout.SOUTH);
      // Add a listener that uses an anonymous class
      f.addMouseMotionListener(new MouseMotionAdapter() {
         @Override
         public void mouseDragged(MouseEvent e) {
            String s = "Mouse dragging:  X = " + e.getX()  + " Y = " + e.getY();
            tf.setText(s);
         }
      }); // <- note the closing parenthesis
      f.addMouseListener(new MouseClickHandler());
      // Size the frame and make it visible
      f.setSize(300, 200);
      f.setVisible(true);
   }
   public static void main(String args[]) {
      TestAnonymous obj = new TestAnonymous();
      obj.launchFrame();
   }
}
