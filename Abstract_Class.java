
abstract class Bike{
    abstract void run();        //a method declared as abstract and does not have implementation is known as abstract method
}




public class Abstract_Class extends Bike {
    void run(){
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        Bike obj = new Abstract_Class();
        obj.run();
    }
}
