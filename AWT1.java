import java.awt.*;

// making a gui component using awt extends frame method - METHOD1
public class AWT1 extends Frame {

    AWT1(){
        Button b = new Button("Click me");
        b.setBounds(30,100,80,30);

        add(b);

        setLayout(null);
        setVisible(true);
        setSize(300,300);
        setTitle("First AWT GUI Program using extends Frame method");

    }

    public static void main(String[] args) {
        new AWT1();
    }

}
