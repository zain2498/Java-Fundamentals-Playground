package Threads.threadProb1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnFairLockExample {

    private final Lock unFairLock = new ReentrantLock();

    public void accessLock(){
        unFairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+ " acquiring the lock");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" lock is acquired");
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            unFairLock.unlock();
            System.out.println(Thread.currentThread().getName()+" releasing the lock");
        }
    }

    public static void main(String[] args) {
        UnFairLockExample unfair = new UnFairLockExample();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                unfair.accessLock();
            }
        };

        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
        Thread t3 = new Thread(runnable,"t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
