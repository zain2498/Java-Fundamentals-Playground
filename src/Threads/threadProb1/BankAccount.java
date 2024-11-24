package Threads.threadProb1;

public class BankAccount {

    /* synchronized k issues:
    * fairness locking nahi ha
    * interrupt nahi kr sakte ksi thread ko
    * read/write locking nahi ha
    */

    private int balance = 1000;

    public synchronized void withdrawal(int amount) {
        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal " + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " withdrawal amount: " + amount);
            balance -= amount;
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance " + balance);
        }
    }

    public void showBalance(){
        if (balance>0){
            System.out.println("Balance: "+balance);
        }else {
            System.out.println("Sorry you have insufficient balance");
        }
    }
}
