
abstract class Parent{
    public final void callme(){
        System.out.println("Hello");
    }

    abstract void hello();  // this is a abstract method in abstract class

    void show(){        // non-abstract method
        System.out.println("This ia a non abstract method of abstract base class");
    }
}

class child1 extends Parent{
     void hello(){
        System.out.println("Hello I am the child1 class ");
    }
}

class chidl2 extends Parent{
    void hello(){
        System.out.println("Hello I am the child2 class");
    }
}


public class Abstract1 {
    public static void main(String[] args) {

//        Parent obj = new Parent();        // abstract class cannot be instantiated
//        obj.callme();
//        obj.hello();
//        obj.show();

        child1 c = new child1();
        c.hello();c.callme();c.show();

        chidl2 d = new chidl2();
        d.hello();d.callme();d.show();

        Parent obj = new child1();
        obj.hello();
        obj = new chidl2();
        obj.hello();
    }
}
