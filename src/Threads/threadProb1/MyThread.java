package Threads.threadProb1;

public class MyThread extends Thread{

    private Counter counter;

    public MyThread(Counter counter, String name){
        super(name);
        this.counter = counter;
    }

    public void run(){
        for (int i =0; i < 1000; i++){
            counter.incrementCount();
        }
    }
}
