package com.company;

import javax.swing.*;
import javax.swing.WindowConstants;

import java.awt.*;



public class Awt1 extends Frame{

    Awt1(){
        //Frame fm = new Frame();             // creating a frame
        JFrame fm = new JFrame();
        Button btn = new Button("Hello World");
        fm.add(btn);
        Label lb = new Label("Welcome to java graphics");
        fm.add(btn);
        fm.add(lb);                              // adding label to the frame
        fm.setSize(300,300);        // setting frame size
        fm.setLayout(new FlowLayout());        // set default layout for frame
        fm.setVisible(true);                  // set frame visibility true
        fm.setBackground(Color.RED);
        fm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Awt1 ta = new Awt1();
    }
}
