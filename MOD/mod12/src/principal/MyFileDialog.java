package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class MyFileDialog implements ActionListener {
   private JFrame f;
   private FileDialog fd;
   private JButton b;
   public void go() {
      f = new JFrame("FileDialog");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fd = new FileDialog(f, "FileDialog");
      fd.setLocationRelativeTo(f);
      b = new JButton("Launch FileDialog");
      // Register listener for buttons.
      b.addActionListener(this);
      f.add(b, BorderLayout.CENTER);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   // Handler for all buttons.
   @Override
   public void actionPerformed(ActionEvent ae) {
      String buttonPressed = ae.getActionCommand();
      if (buttonPressed.equals("Launch FileDialog")) {
         fd.setVisible(true);
      } else {
         fd.setVisible(false);
      }
   }
   public static void main(String args[]) {
      MyFileDialog myFileDialog = new MyFileDialog();
      myFileDialog.go();
   }
}
