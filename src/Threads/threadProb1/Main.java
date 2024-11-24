package Threads.threadProb1;

public class Main {

    public static void main(String[] args) {
        BankAccount meezanBank = new BankAccount();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                meezanBank.withdrawal(100);
                meezanBank.showBalance();
            }
        };

        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
        t1.start();
        t2.start();

    }
}
