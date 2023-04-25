import java.io.*;

public class Serialization_Implementation {
    public static void main(String[] args) {
        Serialization s = new Serialization(02,"Aayush");
        try{

        FileOutputStream fout = new FileOutputStream("Aayush.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(s);
        out.flush();


        out.close();
            System.out.println("Success");
        }catch (Exception e){


            System.out.println(e);
        }
    }
}
