package principal;
import java.awt.*;
import javax.swing.*;
public class TestButton {
   private JFrame f;
   private JButton b;
   public TestButton() {
      f = new JFrame("Test");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      b = new JButton("Press Me!");
      b.setActionCommand("ButtonPressed");
   }
   public void launchFrame() {
      b.addActionListener(new ButtonHandler());
      f.add(b, BorderLayout.CENTER);
      f.setSize(300, 300);
      f.setVisible(true);
   }
   public static void main(String args[]) {
      TestButton guiApp = new TestButton();
      guiApp.launchFrame();
   }
}
