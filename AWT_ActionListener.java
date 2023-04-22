import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class AWT_ActionListener extends Frame implements ActionListener {

    TextField tf;
    AWT_ActionListener(){
        tf= new TextField();
        tf.setBounds(60,50,170,20);
        Button b1= new Button("Click me");
        b1.setBounds(60,50,80,30);

        b1.addActionListener(this);

        add(tf);
        add(b1);

        setVisible(true);
        setLayout(null);
        setSize(400,400);
        setTitle("Action Listener");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Button Clicked");
    }

    public static void main(String[] args) {
        new AWT_ActionListener();
    }
}
