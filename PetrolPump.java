import java.time.Period;
import java.util.Scanner;

class Petrol {
    float price = 110;
    float amount, quantity;
    Petrol(){
        amount = 0;
        quantity = 0;
        System.out.println("Amount = " + amount);
        System.out.println("Quantity = " + quantity);
    }

    void setPrice(float p){
        price = p;
    }
    void getPrice(){
        System.out.println("The price is :" + price);
    }
    void enterAmount(){
        System.out.println("Enter amount greater than 10:  \n");
        Scanner sc= new Scanner(System.in);
        amount = sc.nextFloat();
        System.out.printf("Quantity dispensed: %.3f%n Pay: %.2f", quantity, amount);
    }

    void enterQuantity(){
        System.out.println("Enter quantity in liters:  \n");
        Scanner sc = new Scanner(System.in);
        quantity = sc.nextFloat();
        System.out.printf("Quantity dispensed: %.3f%n Pay: %.2f", quantity, amount);

    }
}

public class PetrolPump {
    public static void main(String[] args) {
        String choice;
        Petrol p1 = new Petrol();
        p1.setPrice(75);
        p1.getPrice();
        System.out.println("\nEnter Quantity or Amount. enter q or a\n");
        Scanner sc= new Scanner(System.in);
        choice = sc.nextLine();

        switch (choice){
            case "q":
                p1.enterQuantity();
                break;
            case "a":
                p1.enterAmount();
                break;
        }

    }
}
