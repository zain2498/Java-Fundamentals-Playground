package Threads.threadProb1.threadCommunication;


public class ThreadCommunication {

    public static void main(String[] args) {
        SharedResouces sharedResouces = new SharedResouces();

        Thread producerThread = new Thread(new Producer(sharedResouces));
        Thread consumerThread = new Thread(new Producer(sharedResouces));

        producerThread.start();
        consumerThread.start();


        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread is about to end... BYE !");
    }
}
