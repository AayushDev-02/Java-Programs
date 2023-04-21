package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadDemo4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task1 = new Task("Task of Locking");
        Runnable task2 = new Task("Task 2");

        System.out.println("Starting Executor");
        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}

class Task implements Runnable {
    private String name;
    public Task(String name){
        this.name= name;
    }

    public void run(){
        System.out.println("Task " + name + " is running on thread " + Thread.currentThread().getName());
    }
}