package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaOrdering implements ActionListener {

    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField tf1;

    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JCheckBox c4;

    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JRadioButton r5;

    JButton b1;

    PizzaOrdering(){
        JFrame frame = new JFrame("Pizza Ordering");
        l1 = new JLabel("Enter Name: ");
        l2 = new JLabel("Select Pizza: ");
        l3 = new JLabel("Add Toppings: ");
        tf1 = new JTextField();
        c1 = new JCheckBox("Paneer");
        c2 = new JCheckBox("Chilli Flakes");
        c3 = new JCheckBox("Mushroom");
        c4 = new JCheckBox("Olives");
        r1 = new JRadioButton("Peppi Paneer Pizza");
        r2 = new JRadioButton("Farm house Pizza");
        r3 = new JRadioButton("Pizza Mania");
        r4 = new JRadioButton("Pan Pizza");
        r5 = new JRadioButton("Cheese Burst Pizza");
        b1 = new JButton("Order");
        JPanel radio = new JPanel();
        JPanel chechBox = new JPanel();

        radio.add(r1);
        radio.add(r2);
        radio.add(r3);
        radio.add(r4);
        radio.add(r5);
        chechBox.add(c1);
        chechBox.add(c2);
        chechBox.add(c3);
        chechBox.add(c4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(chechBox);
        frame.add(l3);
        frame.add(radio);
        frame.add(b1);

        b1.addActionListener(this);

        frame.setLayout(new GridLayout(4,2));
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }


    public static void main(String[] args) {
        new PizzaOrdering();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = tf1.getText();

    }
}
