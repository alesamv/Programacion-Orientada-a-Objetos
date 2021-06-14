package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SampleComboBox implements ItemListener {
   private JFrame f;
   private JComboBox cbox;
   public void go() {
      f = new JFrame("Sample Combo Box");
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      cbox = new JComboBox();
      cbox.addItem("First");
      cbox.addItem("Second");
      cbox.addItem("Third");
      cbox.addItemListener(this);
      f.add(cbox);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public void itemStateChanged(ItemEvent ev) {
      String state = "deselected";
      if (ev.getStateChange() == ItemEvent.SELECTED) {
         state = "selected";
      }
      System.out.println(ev.getItem() + " " + state);
   }
   public static void main(String args[]) {
      SampleComboBox sampleChoice = new SampleComboBox();
      sampleChoice.go();
   }
}
