package Threads.threadProb1.threadCommunication;

public class Consumer implements Runnable{

    private SharedResouces sharedResouces;

    public Consumer(SharedResouces sharedResouces){
        this.sharedResouces = sharedResouces;
    }
    @Override
    public void run() {
        for (int i =0; i < 10; i++){
            int value = sharedResouces.consume();

        }
    }
}
