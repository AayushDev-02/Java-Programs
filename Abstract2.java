
abstract class Vehicle{
    abstract void startEngine();

    void showCost(double price){
        System.out.println("Car price is: "  + (price + 10000));
    }
}

class Car2 extends Vehicle{
    void startEngine(){
        System.out.println("Car engine ");
    }
}

class Bus extends Vehicle{
    void startEngine(){
        System.out.println("Bus Engine");
    }
}


public class Abstract2 {
    public static void main(String[] args) {
        Vehicle v1 = new Car2();
        v1.startEngine();
        v1.showCost(500);

        Car2 c1 = new Car2();
        c1.startEngine();

        v1 = new Bus();
        v1.startEngine();
    }
}
