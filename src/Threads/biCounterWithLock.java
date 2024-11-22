package Threads;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
        why are we using lock unlock method it's because one thread cannot execute more than one synchronized methods present in
        the class so inorder to resolve this issue we use lock and unlock and for lock and unlock we no longer need to declare a
        method synchronized it's because we are not making the whole block of code synchronized we only synchronized the chunk of
        code which we think breach the thread safety.
 */
public class biCounterWithLock {

    private int i=0;
    private int j =0;


    Lock lockI = new ReentrantLock();
    Lock lockJ = new ReentrantLock();


    public void incrementI (){

        lockI.lock();
         i++;
        lockI.unlock();
    }

    public int getI() {
        return i;
    }

    public void incrementJ(){
        lockJ.lock();
        j++;
        lockJ.unlock();
    }

    public int getJ() {
        return j;
    }

        /*
                there is another approach of doing the above example keeping thread safety is to used the AtomicInteger class
         */

        AtomicInteger atomicIntegerI = new AtomicInteger();
        AtomicInteger atomicIntegerJ = new AtomicInteger();


    public void incrementAtomicI (){

        atomicIntegerI.getAndIncrement();
    }

    public int getAtomicI() {
        return atomicIntegerI.get();
    }

    public void incrementAtomicJ(){
        atomicIntegerJ.getAndIncrement();
    }

    public int getAtomicJ() {
        return atomicIntegerJ.get();
    }

    /*
        but for multiple steps in code then this approach is not good it is only feasible for increments or simple problems
        otherwise use lock and unlock for thread safety.
     */


}
