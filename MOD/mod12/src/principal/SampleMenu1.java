package principal;
import javax.swing.*;
public class SampleMenu1 {
   private JFrame f;
   private JMenuBar mb;
   public void go() {
      f = new JFrame("MenuBar");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mb = new JMenuBar();
      f.setJMenuBar(mb);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public static void main(String args[]) {
      SampleMenu1 sampleMenu = new SampleMenu1();
      sampleMenu.go();
   }
}
