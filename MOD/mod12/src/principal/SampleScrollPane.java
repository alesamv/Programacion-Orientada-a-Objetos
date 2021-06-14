package principal;
import java.awt.*;
import javax.swing.*;
public class SampleScrollPane {
   private JFrame f;
   private JButton b1, b2, b3, b4, b5, b6;
   private JButton b7, b8, b9, b10, b11, b12;
   private JPanel p;
   private JScrollPane sp;
   public void go() {
      f = new JFrame("Sample ScrollPane");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      p = new JPanel();
      p.setLayout(new GridLayout(4, 3));
      b1 = new JButton("Button 1");
      b2 = new JButton("Button 2");
      b3 = new JButton("Button 3");
      b4 = new JButton("Button 4");
      b5 = new JButton("Button 5");
      b6 = new JButton("Button 6");
      b7 = new JButton("Button 7");
      b8 = new JButton("Button 8");
      b9 = new JButton("Button 9");
      b10 = new JButton("Button 10");
      b11 = new JButton("Button 11");
      b12 = new JButton("Button 12");
      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);
      p.add(b5);
      p.add(b6);
      p.add(b7);
      p.add(b8);
      p.add(b9);
      p.add(b10);
      p.add(b11);
      p.add(b12);
      sp = new JScrollPane(p);
      f.add(sp, BorderLayout.CENTER);
      f.setSize(100, 100);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public static void main(String args[]) {
      SampleScrollPane sampleScrollPane = new SampleScrollPane();
      sampleScrollPane.go();
   }
}
