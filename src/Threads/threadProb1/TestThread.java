package Threads.threadProb1;

public class TestThread {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter,"t1");
        MyThread t2 = new MyThread(counter, "t2");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
