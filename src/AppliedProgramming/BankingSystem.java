package AppliedProgramming;

import java.util.Scanner;

public class BankingSystem {
    private static Scanner scanner;

    public static void main(String[] args) {
        try {
            scanner = new Scanner(System.in);
            boolean isAccountCreating = true;
            while (isAccountCreating) {
                BankAccount bankAccountCreated = createUserAccount(scanner);
                if (bankAccountCreated != null) {
                    System.out.println("Congratulations!!");
                    System.out.println("Your bank account is successfully created");
                    userOperation(scanner, bankAccountCreated);
                    isAccountCreating = false;
                } else {
                    System.out.println("We are very sorry, but the information you have provided is not valid and we are not able to open your bank account\n");
                }
            }
        } catch (Exception exception) {
            System.out.println("ERROR: Something went wrong, please try again later, Thanks for your cooperation ");
            return;
        } finally {
            scanner.close();
        }
    }

    private static BankAccount createUserAccount(Scanner userInput) {
        BankAccount bankAccount = null;
        System.out.println("\nTo Create a bank account you have to enter the following details:\n");
        System.out.println("1.Please enter your account number");
        int accountNumber = userInput.nextInt();
        boolean valid = isAccountNumberValid(accountNumber);
        while (!valid){
            System.out.println("1.Please enter your account number");
             accountNumber = userInput.nextInt();
             valid = isAccountNumberValid(accountNumber);
        }
        System.out.println("2.Please enter your Account Name");
        String accountName = userInput.next();
        valid = isAccountHolderNameValid(accountName);
        while (!valid){
            System.out.println("2.Please enter your Account Name");
            accountName = userInput.next();
            valid = isAccountHolderNameValid(accountName);
        }
        System.out.println("3.Please enter your current balance");
        double currBalance = userInput.nextDouble();
        valid = isAccountBalanceValid(currBalance);
        while (!valid){
            System.out.println("3.Please enter your current balance");
            currBalance = userInput.nextDouble();
            valid = isAccountBalanceValid(currBalance);
        }

        bankAccount = new BankAccount(accountNumber, accountName, currBalance);
        return bankAccount;
    }

    private static void userOperation(Scanner operation, BankAccount bankAccount) throws InsufficientFundsException {
        System.out.println("Welcome to Islamic Banking");
        System.out.println("\nYou can perform the following operations\n");
        while (true) {
            System.out.println("Press 1 Account Details");
            System.out.println("Press 2 for Cash Withdrawal");
            System.out.println("Press 3 for Cash Deposit");
            System.out.println("Press 4 to exit.");

            int userChoice = operation.nextInt();
            switch (userChoice) {
                case 1:
                    bankAccount.showAccountInfo();
                    break;
                case 2:
                    System.out.println("Please enter amount you want to withdraw");
                    double withdrawalAmount = operation.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Please enter amount you want to depost");
                    double depostedAmount = operation.nextDouble();
                    bankAccount.deposit(depostedAmount);
                    break;
                case 4:
                    System.out.println("Thank You for using our banking");
                    return;
                default:
                    System.out.println("Please enter a valid amount to proceed.");
            }
        }
    }

   public static boolean isAccountNumberValid(int accountNumber){
        if (accountNumber <= 0) {
            System.out.println("Error creating bank account: " + new IllegalArgumentException("Please enter a valid account number in order to open your bank account"));
            return false;
        }else if (accountNumber < 10 || accountNumber < 100 || accountNumber < 1000 || accountNumber < 10000 || accountNumber < 100000){
            System.out.println("Error creating bank account: " + new IllegalArgumentException("Please enter a valid account number of more than 6 digits, in order to open your bank account"));
            return false;
        }
        return true;
    }
    public static boolean isAccountHolderNameValid(String accountName){
        String noSpecialCharacterAllowed = "^[a-zA-Z\\s]+$";
        if (!accountName.matches(noSpecialCharacterAllowed)) {
            System.out.println("Error creating bank account: " + new IllegalArgumentException("You cannot add special character in your name, Please enter your name as per CNIC"));
            return false;
        } else if (accountName.isEmpty()) {
            System.out.println("Error creating bank account: " + new IllegalArgumentException("Please enter your name as per CNIC to open up your bank account"));
            return false;
        } else if (accountName.length()<3) {
            System.out.println("Error creating bank account: "+ new IllegalArgumentException("Please enter a valid name as per your CNIC to meet the government laws"));
            return false;
        }
        return true;
    }
    public static boolean isAccountBalanceValid(double balanceAmount){
        if (balanceAmount <= 0 || balanceAmount < 500) {
            System.out.println("Error creating bank account: " + new InsufficientFundsException("Please make sure that the initial amount you have added should be greater than zero in order to open your bank account"));
            return false;
        }
        return true;
    }
}