package Threads.threadProb1;

public class Counter {

    private int count =0;

    public synchronized void incrementCount(){
    count++;
    }

    public int getCount(){
        return count;
    }
}
