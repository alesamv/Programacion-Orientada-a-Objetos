package principal;
import java.awt.BorderLayout;
import javax.swing.*;
public class SampleTextArea {
   private JFrame f;
   private JTextArea ta;
   public void go() {
      f = new JFrame("TextArea");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ta = new JTextArea("Hello!", 4, 30);
      f.add(ta, BorderLayout.CENTER);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public static void main(String args[]) {
      SampleTextArea sampleTextArea = new SampleTextArea();
      sampleTextArea.go();
   }
}
