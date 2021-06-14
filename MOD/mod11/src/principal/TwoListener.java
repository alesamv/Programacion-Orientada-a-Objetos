package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TwoListener implements MouseMotionListener, MouseListener {
   private JFrame f;
   private JTextField tf;
   public TwoListener() {
      f = new JFrame("Two listeners example");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      tf = new JTextField(30);
   }
   public void launchFrame() {
      JLabel label = new JLabel("Click and drag the mouse");
      // Add components to the frame
      f.add(label, BorderLayout.NORTH);
      f.add(tf, BorderLayout.SOUTH);
      // Add this object as a listener
      f.addMouseMotionListener(this);
      f.addMouseListener(this);
      // Size the frame and make it visible
      f.setSize(500, 300);
      f.setVisible(true);
   }
   // These are MouseMotionListener events
   @Override
   public void mouseDragged(MouseEvent e) {
      String s = "Mouse dragging:  X = " + e.getX() + " Y = " + e.getY();
      tf.setText(s);
   }
   @Override
   public void mouseEntered(MouseEvent e) {
      String s = "The mouse entered";
      tf.setText(s);
   }
   @Override
   public void mouseExited(MouseEvent e) {
      String s = "The mouse has left the building";
      tf.setText(s);
   }
   // Unused MouseMotionListener method.
   // All methods of a listener must be present in the
   // class even if they are not used.
   @Override
   public void mouseMoved(MouseEvent e) {
   }
   @Override
   public void mousePressed(MouseEvent e) {
   }
   @Override
   public void mouseClicked(MouseEvent e) {
   }
   @Override
   public void mouseReleased(MouseEvent e) {
   }
   public static void main(String args[]) {
      TwoListener two = new TwoListener();
      two.launchFrame();
   }
}
