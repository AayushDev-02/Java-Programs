class Car{
    void eat(){
        System.out.println("Eating!");
    }
}

class Ford extends Car {
    void mustang(){
        System.out.println("Ford Mustang!");
    }
}

class Audi extends Car{
    void R8(){
        System.out.println("Audi R8");
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Ford obj = new Ford();
        obj.eat();
        obj.mustang();

        Audi obj2 = new Audi();
        obj2.eat();
        obj2.R8();
    }
}
