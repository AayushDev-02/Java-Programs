package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_RadioButtons extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new Swing_RadioButtons();
    }

    JRadioButton rb1,rb2;
    JButton b;

    Swing_RadioButtons(){
        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        rb1.setBounds(100,50,100,30);
        rb2.setBounds(100,100,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        b= new JButton("Click");
        b.setBounds(100,150,80,30);
        b.addActionListener(this);
        add(rb1);add(rb2);add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(rb1.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Male.");
        }
        else{
            JOptionPane.showMessageDialog(this,"You are Female.");
        }
    }
}
