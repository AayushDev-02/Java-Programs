import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class Bean2 extends JPanel implements Serializable {

    private JLabel l;
    private JTextField tf;
    private JButton btn;

    public Bean2(){
        l = new JLabel("Enter your name");
        tf = new JTextField();
        btn = new JButton("Click me");

        add(l);
        add(tf);
        add(btn);
        btn.addActionListener(new ButtonListner());

        setVisible(true);
        setLayout(new GridLayout(2,2));
        setSize(500,500);

    }

    public String getName2(){
        return tf.getText();
    }

    public void setName(String name){
        tf.setText(name);
    }

    private class ButtonListner implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("Button Clicked");
            String name = getName2();
            System.out.println("Name entered: " + name);
        }
    }

    public static void main(String[] args) {
        new Bean2();
    }




}

