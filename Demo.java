package com.company;


class Engine {

    public void work(){
        System.out.println("Engine of the car has been started");
    }
}


class Car {
//    private final Engine engine;
    private Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    Car(){
        System.out.println("I am car without engine");
    }

    public void move(){
        if(engine!=null){
            engine.work();
            System.out.println("Car is Moving");
        }
        else{
            System.out.println("Car is not moving");
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        Engine kappa = null;
        Engine gamma = new Engine();

        Car maruti = new Car(kappa);
        maruti.move();
        Car breeza = new Car(gamma);
        breeza.move();
        Car dzire = new Car();{
        }

    }

}
