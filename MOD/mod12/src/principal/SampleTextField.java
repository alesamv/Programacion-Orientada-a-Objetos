package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SampleTextField {
   private JFrame f;
   private JTextField tf;
   public void go() {
      f = new JFrame("TextField");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      tf = new JTextField("Single Line", 30);
      tf.addKeyListener(new NameHandler());
      f.add(tf, BorderLayout.CENTER);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   class NameHandler extends KeyAdapter {
      @Override
      public void keyPressed(KeyEvent e) {
         char c = e.getKeyChar();
         if (Character.isDigit(c)) {
            System.out.println("Se tecleó dígito " + c);
         }
      }
   }
   public static void main(String args[]) {
      SampleTextField txtf = new SampleTextField();
      txtf.go();
   }
}
