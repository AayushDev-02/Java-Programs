package com.company;


import javax.swing.*;
import java.awt.event.*;

public class SwingLogin extends JFrame {
    public static void main(String[] args) {
        SwingLogin frame = new SwingLogin();
    }

    JButton b1= new JButton("Submit");
    JPanel panel = new JPanel();
    JTextField t1 = new JTextField(15);
    JPasswordField p1 = new JPasswordField(15);
    JLabel l1= new JLabel();
    JLabel l2= new JLabel();

    SwingLogin(){
        super("Authentication");
        l1.setText("Username");
        l2.setText("Password");

        setSize(500,300);

        setLocation(500,280);
        panel.setLayout(null);

        l1.setBounds(19,30,100,20);
        l2.setBounds(10, 65, 100, 20);
        t1.setBounds(80,30,150,20);
        p1.setBounds(80,65,150,20);
        b1.setBounds(110,100,80,20);

        panel.add(l1);
        panel.add(l2);
        panel.add(b1);
        panel.add(t1);
        panel.add(p1);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionlogin();
    }

    public void actionlogin(){
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String pwd = p1.getText();

                if(name.equals("Aayush") && pwd.equals("Yadav")){
                            SwingLogin2 page2 = new SwingLogin2();
                            page2.setVisible(true);
                            dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Wrong Passowed / Username");
                    t1.setText("");
                    p1.setText("");
                    t1.requestFocus();
                }
            }
        });
    }

}
