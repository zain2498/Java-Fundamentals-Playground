package AppliedProgramming;

public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double currentBalance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        if (balance < 0) {
            System.out.println(new IllegalArgumentException("balance cannot be less than zero"));
            return;
        }
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.currentBalance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println(new IllegalArgumentException("Deposit amount cannot be less than or equal to zero"));
            return;
        }

        this.currentBalance = currentBalance + depositAmount;
        System.out.println("your amount "+depositAmount+" is successfully deposited");
        System.out.println();
    }

    public void withdraw(double withdrawlAmount) throws InsufficientFundsException {
        if (withdrawlAmount <= 0) {
            System.out.println(new IllegalArgumentException("Deposit amount cannot be less than or equal to zero"));
            return;
        }
        if (withdrawlAmount > currentBalance) {
            System.out.println(new InsufficientFundsException("You don't have enough balance to withdraw this amount"));
            return;
        }
        currentBalance = currentBalance - withdrawlAmount;
        System.out.println("Your remaining account balance is: "+currentBalance);
    }

    public void showAccountInfo() {
        System.out.println("Below are your Account Details: ");
        System.out.println("------------------------------------------");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Your current balance:  " + currentBalance);
        System.out.println("-------------------------------------------");
    }
}
