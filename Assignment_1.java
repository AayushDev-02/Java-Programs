package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment_1 implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel voltageLabel, resistanceLabel, currentLabel;
    private JTextField voltageTextField, resistanceTextField, currentTextField;
    private JButton calculateButton;

    public Assignment_1(){
        frame = new JFrame("Physics Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(4, 2));
        voltageLabel = new JLabel("Voltage:");
        resistanceLabel = new JLabel("Resistance:");
        currentLabel = new JLabel("Current:");
        voltageTextField = new JTextField();
        resistanceTextField = new JTextField();
        currentTextField = new JTextField();
        calculateButton = new JButton("Calculate");

        panel.add(voltageLabel);
        panel.add(voltageTextField);
        panel.add(resistanceLabel);
        panel.add(resistanceTextField);
        panel.add(currentLabel);
        panel.add(currentTextField);
        panel.add(new JLabel(""));
        panel.add(calculateButton);

        calculateButton.addActionListener(this);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            double voltage = 0.0, resistance = 0.0, current = 0.0;

            try {
                voltage = Double.parseDouble(voltageTextField.getText());
                resistance = Double.parseDouble(resistanceTextField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid values for Voltage and Resistance.");
                return;
            }

            if (voltage != 0.0 && resistance != 0.0) {
                current = voltage / resistance;
                currentTextField.setText(Double.toString(current));
            } else if (voltage == 0.0 && resistance != 0.0) {
                String input = JOptionPane.showInputDialog(frame, "Please enter a value for Voltage:");
                try {
                    voltage = Double.parseDouble(input);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid value for Voltage.");
                    return;
                }
                current = voltage / resistance;
                currentTextField.setText(Double.toString(current));
            } else if (voltage != 0.0 && resistance == 0.0) {
                String input = JOptionPane.showInputDialog(frame, "Please enter a value for Resistance:");
                try {
                    resistance = Double.parseDouble(input);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid value for Resistance.");
                    return;
                }
                current = voltage / resistance;
                currentTextField.setText(Double.toString(current));
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter values for Voltage and Resistance.");
                return;
            }
            if (voltage != 0.0 && resistance != 0.0 && current != 0.0) {
                if (Math.abs(current - (voltage / resistance)) < 0.0001) {
                    panel.setBackground(Color.GREEN);
                } else {
                    panel.setBackground(Color.WHITE);
                }
            } else {
                panel.setBackground(Color.WHITE);
            }
        }

    }

    public static void main(String[] args) {
        new Assignment_1();
    }
}
