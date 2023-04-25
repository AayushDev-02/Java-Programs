import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class checkedException {
    public static void main(String[] args) {

        try{
            FileInputStream fis = null;
            int k;

            fis = new FileInputStream("C:/java1.txt");

            while(( k = fis.read() ) !=-1)
            {
                System.out.print((char)k);
            }

            fis.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found in specified folder");
        }
        catch (IOException e){
            System.out.println("Input Output exception found");
        }

        System.out.println("Byee");

    }
}
