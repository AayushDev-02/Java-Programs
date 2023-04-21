package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Even implements Runnable{

    public void run(){

        for(int i=2; i<=100; i+=2){
            System.out.println("Even series " + i );
        }
    }
}

class Odd implements Runnable{
    public void run(){

        for(int i=1; i<=100; i+=2){
            System.out.println("Odd series: " + i );
        }
    }
}
public class Thread5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task1 = new Odd();
        Runnable task2 = new Even();

        System.out.println("Starting executor");

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}
