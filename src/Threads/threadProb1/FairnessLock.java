package Threads.threadProb1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
*  is me fari ye ha k fairness k ander koi b thread aesa nahi huga jisko resource nahi mile access krne k liye sab
* bari bari resource ko access kr sakenge where as unfair locking me agar bhot saray threads hain jinko resouce chahiyee
* access krne k liye tu usme se kch threads starvation me chale jayenge yani unko resource acccess krne ka moqa hi nahi
* mileyga
*/

public class FairnessLock {
        private final Lock unFairLock = new ReentrantLock(true);

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
            Threads.threadProb1.UnFairLockExample unfair = new Threads.threadProb1.UnFairLockExample();
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
