package principal;
import java.awt.event.*;
public class ButtonHandler implements ActionListener {
   @Override
   public void actionPerformed(ActionEvent e) {
      System.out.println("Action occurred");
      System.out.println("Button's command is: " + e.getActionCommand());
      System.out.println("Modifiers are: " + e.getModifiers());
   }
}
