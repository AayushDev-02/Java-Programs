import javax.swing.*;

public class Swing2 {

    JFrame f;

    Swing2() {
        f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(130,100,100,40);
        f.add(b);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,500);
    }

    public static void main(String[] args) {
        new Swing2();
    }
}
