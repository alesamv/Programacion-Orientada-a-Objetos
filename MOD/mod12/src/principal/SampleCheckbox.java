package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SampleCheckbox implements ItemListener {
   private JFrame f;
   private JCheckBox one, two, three;
   public void go() {
      f = new JFrame("Sample Checkbox");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      one = new JCheckBox("One", true);
      two = new JCheckBox("Two", false);
      three = new JCheckBox("Three", false);
      one.addItemListener(this);
      two.addItemListener(this);
      three.addItemListener(this);
      f.setLayout(new FlowLayout());
      f.add(one);
      f.add(two);
      f.add(three);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public void itemStateChanged(ItemEvent ev) {
      String state = "deselected";
      if (ev.getStateChange() == ItemEvent.SELECTED) {
         state = "selected";
      }
      System.out.println(ev.getID() + " " + state);
   }
   public static void main(String args[]) {
      SampleCheckbox sampleCheckbox = new SampleCheckbox();
      sampleCheckbox.go();
   }
}
