package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingForm_IMP  {
    private JLabel lb;
    private JTextField tf;
    private JButton btn;

    public String getName2(){
        return tf.getText();
    }

    public void setName(String name){
        tf.setText(name);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("My fname");
        JLabel lb = new JLabel("Enter your name: ");

        JTextField tf = new JTextField(20);
        JButton btn = new JButton("Click");
        btn.setBounds(130,100, 40,20);

//        btn.addActionListener(new ButtonListener());
        frame.setLayout(new FlowLayout());
        frame.add(lb);
        frame.add(tf);
        frame.add(btn);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String name = getName2();
            System.out.println(name);
        }
    }


}
