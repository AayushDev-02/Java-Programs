import java.lang.*;
import java.lang.Thread;

public class MultiThread {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12};
        long startTime = System.currentTimeMillis();
        performTask(data);
        long endTime = System.currentTimeMillis();
        System.out.println("Single threaded task completed in " + (endTime - startTime) + " ms");

        //create 2 thread for multithreading
        Thread thread1 = new Thread(() -> performTask(data,0,data.length/2));
        Thread thread2 = new Thread(() -> performTask(data, data.length/2, data.length));

        startTime = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        endTime = System.currentTimeMillis();
        System.out.println("Multi-threaded task completed in " + (endTime - startTime) + " milliseconds");
    }


    public static void performTask(int[] data){
        for(int i=0; i<data.length; i++){
            try{
                java.lang.Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Thread " + Thread.currentThread().getName() + " processing element " + data[i]);
        }
    }

    public static void performTask(int[] data, int start, int end){
        for(int i=start; i<end; i++){
            try{

                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Thread " + Thread.currentThread().getName() + " processing element " + data[i]);
        }
    }
}
