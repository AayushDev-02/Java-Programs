
//multiple inheritance is not possible in java using the classes and objects and extend keyword
//to implement multiple inheritance we use - interface and implements keyword

interface Printable{
    void print();
}

interface Showable{
    void show();
}





public class Multiple_Inheritance implements Printable, Showable {
    public void print(){
        System.out.println("Printing...");
    }

    public void show(){
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.print();
        obj.show();
    }
}
