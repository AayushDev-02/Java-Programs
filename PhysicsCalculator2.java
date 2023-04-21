package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhysicsCalculator2 extends JFrame implements ActionListener {
    private JTextField resistanceField;
    private JTextField currentField;
    private JTextField voltageField;
    private JLabel resultLabel;

    public PhysicsCalculator2() {
        super("Physics Calculator - Aayush Yadav (20BCE10401)");
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Resistance (Ohms):"));
        resistanceField = new JTextField();
        add(resistanceField);

        add(new JLabel("Current (Amperes):"));
        currentField = new JTextField();
        add(currentField);

        add(new JLabel("Voltage (Volts):"));
        voltageField = new JTextField();
        add(voltageField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new JLabel();
        add(resultLabel);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String resistanceText = resistanceField.getText();
        String currentText = currentField.getText();
        String voltageText = voltageField.getText();

        double resistance = 0;
        double current = 0;
        double voltage = 0;

        if (!resistanceText.isEmpty()) {
            resistance = Double.parseDouble(resistanceText);
        }
        if (!currentText.isEmpty()) {
            current = Double.parseDouble(currentText);
        }
        if (!voltageText.isEmpty()) {
            voltage = Double.parseDouble(voltageText);
        }

        if (resistanceText.isEmpty() && !currentText.isEmpty() && !voltageText.isEmpty()) {

            resistance = voltage / current;
            resultLabel.setText("Resistance: " + resistance + " Ohms");
            getContentPane().setBackground(Color.WHITE);

        } else if (!resistanceText.isEmpty() && currentText.isEmpty() && !voltageText.isEmpty()) {

            current = voltage / resistance;     // (I = V/R)
            resultLabel.setText("Current: " + current + " Amperes");
            getContentPane().setBackground(Color.WHITE);

        } else if (!resistanceText.isEmpty() && !currentText.isEmpty() && voltageText.isEmpty()) {

            voltage = current * resistance;     //(V = IR)
            resultLabel.setText("Voltage: " + voltage + " Volts");
            getContentPane().setBackground(Color.WHITE);

        } else if (resistanceText.isEmpty() || currentText.isEmpty() || voltageText.isEmpty()) {

            resultLabel.setText("Please enter at least two values.");
            getContentPane().setBackground(Color.WHITE);

        } else {

            double calculatedCurrent = voltage / resistance;
            if (Math.abs(calculatedCurrent - current) < 0.0001) {
                resultLabel.setText("The given values are valid.");
                getContentPane().setBackground(Color.GREEN);
            } else {
                resultLabel.setText("The given values are not valid.");
                getContentPane().setBackground(Color.WHITE);
            }

        }
    }

    public static void main(String[] args) {
        new PhysicsCalculator2().setVisible(true);
    }
}


