package Threads;

/*
    Below are the two methods by which we can create threads once isto extend from Thread class and second one is to
    implements Runnable interface.
 */

//public class ThreadProb extends  Thread{
//
//    public void run(){
//        System.out.println("Thread is running");
//    }
//
//
//    public static void main(String[] args) {
//        ThreadProb t1 = new ThreadProb();
//        t1.start();
//    }
//
//}


public class ThreadProb implements Runnable{

    public void run(){
        System.out.println("Thread is running");
    }



    public static void main(String[] args) {
        ThreadProb t1 = new ThreadProb();

        Thread thread = new Thread(t1);
        thread.start();
    }

}
