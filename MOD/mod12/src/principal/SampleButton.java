package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SampleButton implements ActionListener {
   private JFrame f;
   private JButton b;
   public void go() {
      f = new JFrame("Sample Button");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      b = new JButton("Sample");
      b.addActionListener(this);
      f.add(b);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public void actionPerformed(ActionEvent ae) {
      System.out.println("Button press received.");
      System.out.println("Button's action command is: " + ae.getActionCommand());
   }
   public static void main(String args[]) {
      SampleButton sampleButton = new SampleButton();
      sampleButton.go();
   }
}
