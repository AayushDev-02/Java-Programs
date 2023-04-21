package com.company;

abstract class Vehicle{
    public abstract void enginestart();
    void showcost(double prices){
        System.out.println("Car price is: " + (prices + 10000));
    }

}

class Car2 extends Vehicle{
    public void enginestart(){
        System.out.println("Car engine");
    }
}

class Bus extends Vehicle {
    public void enginestart(){
        System.out.println("Bus engine");
    }
}



public class Runtime_polymorphism_04_04_23 {
    public static void main(String[] args) {
        Vehicle v1 = new Car2();
        v1.enginestart();
        v1.showcost(50000);

        Car2 c1 = new Car2();
        c1.enginestart();

        v1 = new Bus();
        v1.enginestart();
    }
}
