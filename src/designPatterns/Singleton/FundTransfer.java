package designPatterns.Singleton;

public class FundTransfer {

    private static FundTransfer ft;

    private double balance;

    //private constructor to prevent instantiation
    private FundTransfer() {
    }

    private static FundTransfer getInstance() {
        if (ft == null) {
            ft = new FundTransfer();
        }else{
            System.out.println("This is singleton in which you are not allowed to create another copy of the object.");
        }
        return ft;
    }

    public double getBalance() {
        System.out.println("Your remaining balance is : " + balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void cashWithdrawl(double withdrawlAmount) {
        if (withdrawlAmount == 0) {
            System.out.println("Please enter a valid amount");
            return;
        }
        if (withdrawlAmount > balance) {
            System.out.println("You do not have insufficient balance");
            return;
        }

        balance -= withdrawlAmount;
    }


    public static void main(String[] args) {
        FundTransfer ft1 = FundTransfer.getInstance();
        ft1.setBalance(1900.67);
        System.out.println("1st " + ft1.hashCode());

        FundTransfer ft2 = FundTransfer.getInstance();
        System.out.println("second " + ft2.hashCode());
        ft2.cashWithdrawl(300.2);
        ft1.getBalance();
    }
}
