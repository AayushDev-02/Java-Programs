
interface Animal2{
    float speed = 20; // static final public
    void sound();
    void speed();
}

interface FastAnimal{
    void run();
}

class Tiger implements Animal2, FastAnimal{
    public void sound(){
        System.out.println("Roar");
    }

    public void speed(){
        System.out.println("The tiger's speed is: 30-50 Km/h");
    }

    public void run(){
        System.out.println("Tiger is a fast animal");
    }
}

class Dog2 implements Animal2{
    public void sound(){
        System.out.println("Bark");
    }

    public void speed(){
        System.out.println("The dog's speed is: 15-20 Km/h");
    }


}


public class Interface {

    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.speed();
        t1.sound();
        t1.run();

        Animal2 a = new Tiger();
        a.sound();
        a.speed();

        a = new Dog2();
        a.sound();
        a.speed();
    }
}
