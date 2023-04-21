package com.company;

public class ThreadDemo3 {
    public static void main(String[] args) {

        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12};
        long startTime = System.currentTimeMillis();
//        performTask(data);
        long endTime = System.currentTimeMillis();

        System.out.println("Single thread task completed in " + (endTime - startTime));

//        Thread thread1 = new Thread(() -> performTask(data,0,data.length/2));
//        Thread thread2 = new Thread(() -> performTask(data,0,data.length/2));

        startTime = System.currentTimeMillis();

    }
}
