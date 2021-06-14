/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

/**
 *
 * @author Alexandra
 */
public class Project 
{
    private JTextArea textArea;
    private JTextField textField;
    private JFrame frame;
    private JButton consult, quit;
    private JPanel panIn,panSup;
    private JLabel etiqueta;
    
    public Project()
    {
        frame = new JFrame("Consulta Stock Market");
        textArea = new JTextArea(10,50);
        textField = new JTextField(10);
        consult = new JButton("Consultar");
        quit = new JButton("Terminar");
        panIn = new JPanel();
        panSup = new JPanel();
        etiqueta = new JLabel("Clave de la Empresa: ");
    }

    public void launchFrame() 
     {
        //Construimos el panel con FlowLayout para agregar los botones centrados en la parte inferior 
        panIn.setLayout(new FlowLayout());
        //Clase interna para el evento de terminar
        quit.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) 
         {
            System.exit(0);   
         }
        }); 
        //Clase interna para el evento de consultar
        consult.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) 
         {
            String search = textField.getText(); //obtiene eltexto escrito en el textField
            if("".equals(search))
                textArea.setText("\n\n\n\n\tEl campo de texto esta vacío. Intente de nuevo, por favor."); //Si no se teclea nada pone el texto en el textArea
            else
            {
                textField.setText("");//Pone el textField en limpio
                String nSearch = search.toUpperCase(); //Lo pasa a mayusculas
                System.out.println("El texto es: "+ nSearch);
                BusquedaArchivo BusquedaClave = new BusquedaArchivo();
                String [] palabraEncontrada = BusquedaClave.busqueda(nSearch);
                if (palabraEncontrada!=null)
                    textArea.setText("\n\n\tClave: " + palabraEncontrada[0] + "\n\n\tNombre de la Empresa: " + palabraEncontrada[1] + "\n\n\tPrecio: $" + palabraEncontrada[2]);
                else
                    textArea.setText("\n\n\tNo se encontro la palabra");
            }
         }
        }); 
        panIn.add(consult); //Agregamos el boton de consultar en el panel inferior
        panIn.add(quit); //Agregamos el boton de terminar en el panel inferior
        panIn.setBackground(Color.LIGHT_GRAY); 
        frame.add(panIn, BorderLayout.SOUTH); //Agregamos el panel inferior al sur del BorderLayout
        
        //Construimos el area del norte 
        etiqueta.setBounds(10,10,100,30); //Posicionamos la etiqueta
        panSup.add(etiqueta); //Agregamos la etiqueta
        textField.setBounds(120,10,150,20); //Posicionamos el textField
        //Clase interna para manejar el evento en el text field
        textField.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textArea.setText("");
            String search = ((JTextField)e.getSource()).getText(); //obtiene el texto del textField al hacer enter
            if("".equals(search))
                textArea.setText("\n\n\n\n\t    Campo de texto esta vacío. Intente de nuevo, por favor.");
            else
            {
                textField.setText("");//Pone el textField en limpio
                String nSearch = search.toUpperCase(); //Lo pasa a mayusculas
                System.out.println("El texto es: "+ nSearch);
                BusquedaArchivo BusquedaClave = new BusquedaArchivo();
                String [] palabraEncontrada = BusquedaClave.busqueda(nSearch);
                if (palabraEncontrada!=null)
                    textArea.setText("\n\n\tClave: " + palabraEncontrada[0] + "\n\n\tNombre de la Empresa: " + palabraEncontrada[1] + "\n\n\tPrecio: $" + palabraEncontrada[2]);
                else
                    textArea.setText("\n\n\tNo se encontro la palabra");
            }
         }
     });
        
        panSup.add(textField); //Agregamos el textField al panel superior
        panSup.setBackground(Color.LIGHT_GRAY); 
        frame.add(panSup, BorderLayout.NORTH); //Agregamos el panel superior al norte del borderLayout
        
        //Area del centro
        textArea.setBorder(BorderFactory.createMatteBorder(0, 20, 0, 20, Color.LIGHT_GRAY)); //Ponemos un borde a textArea
        Font font = new Font("Verdana", Font.BOLD, 14); //Ponemos la letra de textArea de tipo Verdana en negritas y de tamaño 14
        textArea.setFont(font); //Agregamos la letra a la textArea
        textArea.setEditable(false); //Hacemos que el textArea no se pueda editar o escribir sobre ella
        frame.add(textArea, BorderLayout.CENTER); //La agregamos al centro de el borderLayout
        
        //Construccion de Frame
        frame.pack(); //Para redimensionar en cualquier compu
        frame.setVisible(true); //Lo hacemos visible
        frame.setLocationRelativeTo(null); //Hacemos que se abra en medio de la pantalla
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Agregamos el metodo que hara que al cerrarce en la "x" se termine el proceso

}
    
    public static void main(String args[]) 
   {
      Project consultBol = new Project();
      consultBol.launchFrame();


   }   
}
