import java.awt.*;

public class AWT2 {
    AWT2(){
        Frame f = new Frame();
        Label l =new Label("Emplote ID: ");
        Button b = new Button("Submit");
        TextField t = new TextField();

        l.setBounds(20,80,80,20);
        t.setBounds(30, 80, 100, 30);
        b.setBounds(25, 100, 50, 30);

        f.add(l);
        f.add(t);
        f.add(b);

        f.setTitle("AWT using association");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
    }

    public static void main(String[] args) {
        new AWT2();
    }
}
