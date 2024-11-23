package Threads;

public class MultiThread extends Thread{

    public MultiThread(String name){
        super(name);
    }

    public void run(){
        for (int i =0; i< 5; i++){
            String a = "";
            for (int j=0; j < 100000; j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " -Priority " + Thread.currentThread().getPriority() + " - count "+i);
        }
    }
    public static void main(String[] args) {
        MultiThread mt1 = new MultiThread("low priority thread");
        MultiThread mt2 = new MultiThread("normal priority thread");
        MultiThread mt3 = new MultiThread("high priority thread");
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt2.setPriority(Thread.NORM_PRIORITY);
        mt3.setPriority(Thread.MAX_PRIORITY);
        mt3.start();
        mt2.start();
        mt1.start();
    }
}
