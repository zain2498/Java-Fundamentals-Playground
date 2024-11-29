package Threads;

public class factorialThread {

    public static void main(String[] args) throws InterruptedException {

        long time= System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for (int i=1; i < 10; i++){
            int fyi = i;
            threads[i-1] = new Thread(()->{

                int n= factorial(fyi);
                System.out.println(n);
            });
            threads[i-1].start();
        }

        for (Thread t : threads){
            t.join();
        }
        System.out.println("--time "+ (System.currentTimeMillis() - time));
    }


    public static int factorial(int n){
        int sum=1;
        if(n==0){
            return -1;
        }
         for (int i =1; i <=n; i ++){
             sum = sum *i;
         }

        return sum;
    }
}
