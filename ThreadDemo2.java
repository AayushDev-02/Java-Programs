package com.company;

class Demon2 implements Runnable{
    public void run(){
        System.out.println("I am thread demo and I am running");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Demon2 t1 = new Demon2();
        t1.run();
    }
}
