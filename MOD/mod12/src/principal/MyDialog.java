package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyDialog implements ActionListener {
   private JFrame f;
   private JDialog d;
   private JButton db1;
   private JLabel dl;
   private JButton b;
   public void go() {
      f = new JFrame("Dialog");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Set up dialog.
      d = new JDialog(f, "Dialog", true);
      d.setLayout(new GridLayout(2, 1));
      dl = new JLabel("Hello, I'm a Dialog");
      db1 = new JButton("OK");
      d.add(dl);
      d.add(db1);
      d.setSize(200, 200);
//      d.setLocation(500, 350);
      d.setLocationRelativeTo(f);
      b = new JButton("Launch Dialog");
      // Register listener for buttons.
      b.addActionListener(this);
      db1.addActionListener(this);
      f.add(b, BorderLayout.CENTER);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   // Handler for all buttons.
   public void actionPerformed(ActionEvent ae) {
      String buttonPressed = ae.getActionCommand();
      if (buttonPressed.equals("Launch Dialog")) {
         d.setVisible(true);
      } else if (buttonPressed.equals("OK")) {
         System.out.println("Process terminated!!!");
         System.exit(0);
      } else {
         d.setVisible(false);
      }
   }
   public static void main(String args[]) {
      MyDialog myDialog = new MyDialog();
      myDialog.go();
   }
}
