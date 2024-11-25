package Threads.threadProb1.threadCommunication;

public class SharedResouces {

    private int data;
    private boolean hasData;


    public synchronized void produce(int value){
        while (hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        data = value;
        System.out.println("Produced "+ value);
        hasData = true;
        notify();
    }

    public synchronized int consume(){
        while (!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        hasData =false;
        notify();
        System.out.println("Consumed "+ data);
        return data;
    }
}
