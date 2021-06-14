/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Lenovo E440
 */
public class ChatClient {

    private JFrame frame;
    private JTextField campoT;
    private JTextArea areaT;
    private JButton send;
    private JButton quit;

    public ChatClient() {
        frame = new JFrame("Chat Room");
        frame.setLocationRelativeTo(null);
        campoT = new JTextField("Write a message", 50);
        campoT.setForeground(Color.blue); 
        areaT = new JTextArea(10, 50); 
        send = new JButton("Send");
        send.setForeground(new java.awt.Color(130, 224, 170));
        quit = new JButton("Quit");
        quit.setForeground(Color.red);
    }

    public void launchFrame() {
        Panel pan1 = new Panel();
        pan1.setBackground(new java.awt.Color(244, 246, 247));
        //pan1.setLayout(new FlowLayout(FlowLayout.TRAILING));
        pan1.setLayout(new GridLayout(10,2,0,8)); 
        pan1.add(send);
        pan1.add(quit);
        frame.add(areaT, BorderLayout.CENTER);
        areaT.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(campoT, BorderLayout.SOUTH);
        frame.add(pan1, BorderLayout.EAST);
        Container c = frame.getContentPane();
        c.setBackground(new java.awt.Color(174, 214, 241));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setExtendedState(6);
    }

    public static void main(String args[]) {
        ChatClient chat = new ChatClient();
        chat.launchFrame();
        
    }
}
