import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing3 extends JFrame implements ActionListener {
    JFrame f;
    String name;
    int age;

    JTextField t1;
    JTextField t2;
    JLabel out;
    Swing3(){
         t1 = new JTextField();
         t2 = new JTextField();
        JLabel l1 = new JLabel("Enter name: ");
        JLabel l2 = new JLabel("Enter age: ");
        JButton b = new JButton("Submit");

        b.addActionListener(this);
         out = new JLabel();

        add(l1);add(t1);
        add(l2);add(t2);
        add(b);
        add(out);
        setLayout(new GridLayout(4,2));
        setVisible(true);
        setSize(500,500);
        setTitle("Form");

        pack();


    }

    public static void main(String[] args) {
        new Swing3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name = t1.getText();
        age = Integer.parseInt(t2.getText());

        out.setText("My name is " + name + " and I am " + age + " years old");
    }
}
