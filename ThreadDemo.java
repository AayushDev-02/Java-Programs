package com.company;

class Demon extends Thread{
    public void run(){
        System.out.println("I am thread demo and I am running");
    }
}


 class ThreadDemo  {
    public static void main(String[] args) {
        Demon t1 = new Demon();
        t1.run();
    }
}

