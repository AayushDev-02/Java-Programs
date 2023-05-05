package com.company;

//design and implement a java bean that uses different types of events to interact with the user

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Class_assignment implements MouseListener, java.io.Serializable, MouseMotionListener {

    JTextField tf;
    JFrame frame;
    Color color;

    Class_assignment(){
        frame=  new JFrame("Mouse hover Program" );
        tf = new JTextField();
        tf.setBounds(300,300,200,200);
        frame.add(tf);

        tf.addMouseListener(this);
        tf.addMouseMotionListener(this);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setBackground(Color.BLUE);

    }

    void setColor(Color color){
        this.color = color;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        tf.setBackground(Color.GREEN);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        tf.setBackground(Color.YELLOW);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        tf.setBackground(Color.RED);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        tf.setBackground(color);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        tf.setBackground(Color.magenta);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        frame.setBackground(Color.GRAY);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        frame.setBackground(Color.BLACK);

    }
}
