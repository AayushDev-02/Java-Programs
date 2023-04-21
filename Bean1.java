package com.company;

import javax.swing.*;

public class Bean1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CustomComponent customComponent = new CustomComponent();
        customComponent.setX(100);
        customComponent.setY(100);
        customComponent.setWidth(200);
        customComponent.setHeight(200);

        frame.add(customComponent);
        frame.setVisible(true);


    }
}

