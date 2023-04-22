
class Shape{
    void draw(){
        System.out.println("Drawing....");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {

        Shape obj;
        obj = new Rectangle();
        obj.draw();

        obj = new Square();
        obj.draw();

    }
}
