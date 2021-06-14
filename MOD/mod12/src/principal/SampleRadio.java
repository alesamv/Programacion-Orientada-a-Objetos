package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SampleRadio implements ItemListener {
   private JFrame f;
   private ButtonGroup group;
   private JPanel radioPanel;
   private JRadioButton one;
   private JRadioButton two;
   private JRadioButton three;
   public void go() {
      f = new JFrame("Radio Buttons");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      group = new ButtonGroup();
      one = new JRadioButton("One");
      two = new JRadioButton("Two");
      three = new JRadioButton("Three");
      group.add(one);
      group.add(two);
      group.add(three);
      one.addItemListener(this);
      two.addItemListener(this);
      three.addItemListener(this);
      radioPanel = new JPanel(new GridLayout(0, 1));
      radioPanel.add(one);
      radioPanel.add(two);
      radioPanel.add(three);
      f.setLayout(new FlowLayout());
      f.add(radioPanel);
      f.setSize(400, 400);
      f.setLocationRelativeTo(null); 
      f.setVisible(true);
   }
   public void itemStateChanged(ItemEvent ev) {
      String state = "deselected";
      if (ev.getStateChange() == ItemEvent.SELECTED) {
         state = "selected";
      }
      System.out.println(ev.getID() + state);
   }
   public static void main(String args[]) {
      SampleRadio sampleRadio = new SampleRadio();
      sampleRadio.go();
   }
}
