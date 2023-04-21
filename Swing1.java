package com.company;

import javax.swing.*;

public class Swing1 {
    public static void main(String[] args) {
        int a,b,sum;
        String s1 = JOptionPane.showInputDialog("Enter first value:");
        a = Integer.parseInt(s1);

        String s2 = JOptionPane.showInputDialog("Enter the 2nd value: ");
        b = Integer.parseInt(s2);

        sum = a+b;
        System.out.println(sum);
        JOptionPane.showMessageDialog(null, "The sum of 2 entered values is = " + sum);


    }
}
