import javax.swing.*;
import java.awt.*;

public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b1= new JButton("Click me");
        JButton b2= new JButton("Click me");
        b1.setBounds(130,100,100,40);
        b2.setBounds(130,100,100,40);

        f.add(b1);
        f.add(b2);
        f.setSize(400,400);
        f.setLayout(new GridLayout());
        f.setVisible(true);
    }

}

