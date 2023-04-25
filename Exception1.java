import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = 0;

        try{
            int x = sc.nextInt();
            int y = sc.nextInt();


            w = x/y;

        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid input");
        }
        finally {
            System.out.println("This will be executed besides the exception");
            System.out.println("Output=" + w );
        }

        System.out.println("Hello , this will run if exceptions are handled properly");
    }
}
