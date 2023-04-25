//there are 2 ways to create thread in java
//--> By extending thread class
// --> By implementing runnable interface.

//method - 1 --> extending thread class
//public class Thread extends java.lang.Thread {
//
//    public void run(){
//        System.out.println("Thread is running");
//    }
//
//    public static void main(String[] args) {
//        Thread t = new Thread();
//        t.start();
//    }
//}

//method 2 --> using runnable interface
//public class Thread implements Runnable{
//    public void run(){
//        System.out.println("Thread is running");
//    }
//
//    public static void main(String[] args) {
//        Thread t1 = new Thread();
//        java.lang.Thread t2 = new java.lang.Thread(t1);
//        t2.start();
//    }
//}


public class Thread{
    public static void main(String[] args) {
        java.lang.Thread t1 = new java.lang.Thread("My first thread");
        t1.start();

        String s = t1.getName();
        System.out.println(s);
    }
}