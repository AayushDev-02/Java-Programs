
import java.lang.System;

class DivideByZero extends ArithmeticException {
    public DivideByZero(String message) {
        super(message);
    }
}


public class OwnException {
    public static void main(String[] args) {
        try {
            double x = 5;
            double y = 0;
            double z = x/y;
            System.out.println(z);
            throw new DivideByZero("New arithmetic exception");
        }
        catch(DivideByZero e) {
            System.err.print(e);
            System.out.println(e.getMessage());
        }
    }
}
