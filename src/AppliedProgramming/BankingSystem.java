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
        if (accountNumber <= 0) {
            System.out.println("Error creating bank account: " + new IllegalArgumentException("Please enter a valid account number in order to open your bank account"));
            return null;
        }
        System.out.println("2.Please enter your Account Name");
        String accountName = userInput.next();
        String noSpecialCharacterAllowed = "^[a-zA-Z\\s]+$";
        if (!accountName.matches(noSpecialCharacterAllowed)) {
            System.out.println("Error creating bank account: " + new IllegalArgumentException("You cannot add special character in your name, Please enter your name as per CNIC"));
            return null;
        } else if (accountName.isEmpty()) {
            System.out.println("Error creating bank account: " + new IllegalArgumentException("Please enter your name as per CNIC to open up your bank account"));
            return null;
        }
        System.out.println("3.Please enter your current balance");
        double currBalance = userInput.nextDouble();
        if (currBalance <= 0) {
            System.out.println("Error creating bank account: " + new InsufficientFundsException("Please make sure that the initial amount you have added should be greater than zero in order to open your bank account"));
            return null;
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
}