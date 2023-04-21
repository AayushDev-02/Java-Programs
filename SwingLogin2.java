package com.company;

import javax.swing.*;

public class SwingLogin2 extends JFrame {
    public static void main(String[] args) {
        SwingLogin2 frameTabel = new SwingLogin2();
    }

    JLabel welcome = new JLabel("Welcome Aayush Yadav. Please click on red cross to exit the application");
    JPanel panel = new JPanel();

    SwingLogin2() {
        setSize(300, 200);
        setLocation(500, 280);
        panel.setLayout(null);

        welcome.setBounds(70, 50, 150, 60);

        panel.add(welcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
