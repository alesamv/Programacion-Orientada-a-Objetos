package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestInner {
   private JFrame f;
   private JTextField tf;
   public TestInner() {
      f = new JFrame("Inner classes example");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      tf = new JTextField(30);
   }
   public void launchFrame() {
      JLabel label = new JLabel("Click and drag the mouse");
      // Add components to the frame
      f.add(label, BorderLayout.NORTH);
      f.add(tf, BorderLayout.SOUTH);
      // Add a listener that uses an Inner class
      f.addMouseMotionListener(new MyMouseMotionListener());
      f.addMouseListener(new MouseClickHandler());
      // Size the frame and make it visible
      f.setSize(500, 300);
      f.setVisible(true);
   }
   class MyMouseMotionListener extends MouseMotionAdapter {
      @Override
      public void mouseDragged(MouseEvent e) {
         String s = "Mouse dragging:  X = " + e.getX() + " Y = " + e.getY();
         tf.setText(s);
      }
   }
   public static void main(String args[]) {
      TestInner obj = new TestInner();
      obj.launchFrame();
   }
}
