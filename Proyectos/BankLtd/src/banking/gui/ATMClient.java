package banking.gui;

import banking.domain.*;
import banking.data.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class ATMClient {

  private static final String USAGE
    = "USAGE: java banking.gui.ATMClient <dataFilePath>";

  public static void main(String[] args) {

    // Retrieve the dataFilePath command-line argument
    if ( args.length != 1 ) {
      System.out.println(USAGE);
    } else {
      String dataFilePath = args[0];

      try {
	System.out.println("Reading data file: " + dataFilePath);
	// Create the data source and load the Bank data
	DataSource dataSource = new DataSource(dataFilePath);
	dataSource.loadData();

	// Run the ATM GUI
	ATMClient client = new ATMClient();
	client.launchFrame();

      } catch (IOException ioe) {
	System.out.println("Could not load the data file.");
	System.out.println(ioe.getMessage());
	ioe.printStackTrace(System.err);
      }
    }
  }
    // Colocar a continuación el código de la GUI.
    private JFrame frame;
    private JButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,dot,enter;
    private JButton dis,dep,with;
    private JTextField a,b;
    private JTextArea t;
    public ATMClient(){
        frame=new JFrame("Bank Ltd");
        uno=new JButton("1");
        dos=new JButton("2");
        tres=new JButton("3");
        cuatro=new JButton("4");
        cinco=new JButton("5");
        seis=new JButton("6");
        siete=new JButton("7");
        ocho=new JButton("8");
        nueve=new JButton("9");
        cero=new JButton("0");
        dot=new JButton(".");
        enter=new JButton("Enter");
        dis=new JButton("Display Account balance");
        dep=new JButton("Make a deposit");
        with=new JButton("Make a withdrawal");
        a=new JTextField();
        b=new JTextField();
        t=new JTextArea();
        t.setBorder(BorderFactory.createLineBorder(Color.black));
    }
    public void launchFrame(){
        Panel SuperPadre =new Panel();
        SuperPadre.setLayout(new GridLayout(1,2));
        Panel botones=new Panel();
        botones.setLayout(new GridLayout(2,1));
        SuperPadre.add(botones);
        Panel num=new Panel();
        num.setLayout(new GridLayout(4,3)); 
        Panel acc=new Panel();
        acc.setLayout(new GridLayout(4,1)); 
        Panel text=new Panel();
        text.setLayout(new BorderLayout());
        text.add(t,BorderLayout.CENTER);
        text.add(b,BorderLayout.SOUTH);
        SuperPadre.add(text);
        acc.add(dis);
        acc.add(dep);
        acc.add(with);
        acc.add(a);
        botones.add(acc);
        num.add(uno);
        num.add(dos);
        num.add(tres);
        num.add(cuatro);
        num.add(cinco);
        num.add(seis);
        num.add(siete);
        num.add(ocho);
        num.add(nueve);
        num.add(cero);
        num.add(dot);
        num.add(enter);
        botones.add(num);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setExtendedState(6);
        frame.add(SuperPadre);
    }
}
