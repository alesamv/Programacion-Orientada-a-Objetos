package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyList {
   private JFrame f;
   private JList list;
   public void go() {
      f = new JFrame("List");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      String[] listArray = {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
      list = new JList(listArray);
      f.add(list, BorderLayout.CENTER);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public static void main(String args[]) {
      MyList ml = new MyList();
      ml.go();
   }
}
