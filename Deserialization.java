import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try{

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Aayush.txt"));
            Serialization s2 = (Serialization) in.readObject();

            System.out.println(s2.id + " , " + s2.name );
            in.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
