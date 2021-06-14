package principal;
import java.awt.*;
import javax.swing.*;
public class TestColor {
   public static void main(String[] args) {
      TestColor tester = new TestColor();
      tester.launchFrame();
   }
   private void launchFrame() {
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Button b = new Button("Purple");
      Color purple = new Color(255, 0, 255);
      b.setBackground(purple);
      f.add(b);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
   }
}
