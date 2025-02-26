package designPatterns.Singleton;

public class FundTransfer {

    private static FundTransfer ft;

    private double balance;

    private FundTransfer() {
    } //private constructor to prevent instantiation

    private static FundTransfer getInstance() {
        if (ft == null) {
            ft = new FundTransfer();
        }
        return ft;
    }

    public double getBalance() {
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
        System.out.println("Your remaining balance is : " + balance);
    }


    public static void main(String[] args) {
        FundTransfer ft1 = FundTransfer.getInstance();
        ft1.setBalance(1900.67);
        System.out.println("1st " + ft1.hashCode());

        FundTransfer ft2 = FundTransfer.getInstance();
        System.out.println("second " + ft2.hashCode());
        ft2.cashWithdrawl(300.2);

    }
}
