package Threads.threadProb1.threadCommunication;

public class Producer implements Runnable{

    private SharedResouces sharedResouces;

    public Producer(SharedResouces sharedResouces){
        this.sharedResouces = sharedResouces;
    }

    @Override
    public void run() {
        for (int i =0; i < 10 ; i++){
            sharedResouces.produce(i);

        }
    }
}
