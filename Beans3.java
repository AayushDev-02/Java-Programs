import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beans3  {
    static JLabel l;
    static JTextField tf;
    static JButton btn;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Beans");
        l = new JLabel("Enter your name: ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf = new JTextField(20);

        btn = new JButton("Click me");

        btn.addActionListener(new ButtonActionListner());

        btn.setSize(20,20);
        frame.setLayout(new FlowLayout());
        frame.add(l);
        frame.add(tf);
        frame.add(btn);

        frame.pack();
        frame.setVisible(true);

    }
    Beans3(){

    }

    private static class ButtonActionListner extends Component implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String name = tf.getText();

            JOptionPane.showMessageDialog(this, "Your name is: " + name);
        }
    }
}
