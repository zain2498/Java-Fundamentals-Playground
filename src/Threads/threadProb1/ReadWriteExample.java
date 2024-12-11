package Threads.threadProb1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteExample {

    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" incrementing....");
            Thread.sleep(1000);
            count++;
            System.out.println(Thread.currentThread().getName()+" incremented "+ count);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+" reading count: "+count);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            readLock.unlock();
        }
        return count;
    }

    public static void main(String[] args) {
        ReadWriteExample counter = new ReadWriteExample();

        Runnable readRun = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    counter.getCount();
                }
            }
        };


        Runnable writeRun = new Runnable() {
            @Override
            public void run() {
                for (int j=0; j < 10; j ++){
                    counter.increment();
                }
            }
        };

//        Thread t1 = new Thread(readRun, "t1");
//        Thread t2 = new Thread(readRun, "t2");
        Thread t3 = new Thread(writeRun, "t3");
        Thread t4 = new Thread(readRun, "t4");
        Thread t5 = new Thread(readRun, "t5");

//        t1.start();
//        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
//            t1.join();
//            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("counting mechanism is finished here is the final count "+ counter.getCount());
    }
}
