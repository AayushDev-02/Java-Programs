import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecutor {
    public static void main(String[] args) {
        ExecutorService e= Executors.newFixedThreadPool(2);

        Runnable task1 = new Task("of locking");
        Runnable task2 = new Task("of checking");

        System.out.println("Starting executor");
        e.submit(task1);
        e.submit(task2);

        e.shutdown();
    }


}

class Task implements Runnable{
    private String name;

    public Task(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Task " + name + " is running on thread " + java.lang.Thread.currentThread().getName());

    }
}
