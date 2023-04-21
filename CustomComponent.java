package com.company;

import javax.swing.*;
import java.awt.*;


public class CustomComponent extends JComponent {
    private int x,y,width,height;
    private Color color;

    public CustomComponent(){
        x=0;
        y=0;
        width = 50;
        height = 50;
        color = Color.RED;

    }
    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void setWidth(int width){
        this.width = width;
        repaint();
    }
    public void setHeight(int height){
        this.height = height;
        repaint();
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
        repaint();
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(width, height);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor((color));
        g.fillRect(x,y,width,height);
    }


}
