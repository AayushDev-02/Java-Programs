package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StopWatch extends JFrame implements ActionListener, Runnable {

    JLabel display;
    JButton btn;
    boolean stop = false;

    int i,j,k,l;

    public StopWatch(){
        display = new JLabel();
        btn = new JButton("Start Timer");
        display.setFont(new Font("Helvetica",Font.PLAIN, 20));
        display.setBackground(Color.GREEN);
        display.setForeground(Color.RED);

        Container C = getContentPane();
        C.setLayout(new FlowLayout());
        C.add(display);
        C.add(btn);

        btn.addActionListener(this);
    }

    @Override
    public void run() {
        for (i = 0; ; i++) {
            for (j = 0; j < 60; j++) {
                for (k = 0; k < 60; k++) {
                    for (l = 0; l < 100; l++) {
                        if (stop) {
                            break;
                        }
                        NumberFormat nf = new DecimalFormat("00");
                        display.setText(nf.format(i) + ":" + nf.format(j) + ":" + nf.format(k) + ":" + nf.format(l));
                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Thread t = new Thread(this);
        if(e.getActionCommand().equals("Start Timer")){
            t.start();
            btn.setText("Stop Timer");
        }
        else{
            stop = true;
        }
    }

    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.setSize(500,100);
        s.setVisible(true);
        s.setTitle("Stop Watch");
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
