package com.company;


interface Animal{       // interface dont any method other than default and abstract
    public static final String tname = "Hello";
    void speed();
    void name(String tname);
    default void show(){
        System.out.println("Hello I am default method of Animal");
    }
}

interface FastAnimal{
    void run(int a);
    default void show(){
        System.out.println("Hello I am default method of fast animal.");
    }

    static void roar(){
        System.out.println("I am static method of FastAnimal interface");
    }
}

class Tiger implements Animal, FastAnimal{
    //all abstract methods must be implements

    int a;
    String y;

    public void name(String name) {
        this.y = name;
        System.out.println("My name is " + y + " Tiger");
    }

    public void speed(){
        System.out.println("My speed is high");
    }

    public void run(int x){
        this.a =x;
        System.out.println("My speed is nearly" + a + " km/h");
    }

    public void show(){
        Animal.super.show();
        FastAnimal.super.show();
    }

    void roar(){
        System.out.println("I am roar of tiger");
    }

}

//driver class
public class interfaces {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.name("White");
        t1.speed();
        t1.run(35);

        t1.show();
        FastAnimal.roar();
        t1.roar();
    }
}
