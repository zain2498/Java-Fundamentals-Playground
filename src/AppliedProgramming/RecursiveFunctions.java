package AppliedProgramming;

import java.util.Scanner;

public class RecursiveFunctions {
    private static Scanner scanner;

    public static int sumOfNum(int n) {

        if (n < 10) {
            return n;
        }
        System.out.println(n % 10);
        System.out.println(n / 10);
        return (n % 10) + sumOfNum(n / 10);
    }

    public static void revString(String word, int index) {
        if (index == 0) {
            return;
        }
        System.out.print(word.charAt(index - 1));
        revString(word, index - 1);
    }

    public static boolean isEven(int num) {
        if (num == 0) {
            System.out.print("if the value is even show:  ");
            return true;
        }
        return isOdd(num - 1);
    }

    public static boolean isOdd(int num) {
        if (num == 0) {
            System.out.print("if the value is odd show: ");
            return true;
        }
        return isEven(num - 1);
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        userSelection(scanner);
    }

    public static void userSelection(Scanner scanner) {
        int userInput;
        do {
            System.out.println("Please choose which operation you want to perform ?");
            System.out.println("Press 1 for the sum of digits");
            System.out.println("Press 2 for the word to get reverse");
            System.out.println("Press 3 to check if the number you entered is even or odd");
            System.out.println("Enter 0 to Exit.");
            System.out.println("Please select the above operation");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("please enter a number");
                    int num = scanner.nextInt();
                    System.out.println("The sum of digits are " + sumOfNum(num));
                    break;
                case 2:
                    System.out.println("Please enter any word to get reverse");
                    String word = scanner.next();
                    revString(word, word.length());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("enter a number to check if its even or odd ?");
                    int randomNumber = scanner.nextInt();
                    System.out.println(isEven(randomNumber));
                    break;
                case 0:
                    System.out.println("Exiting..GoodBye.");
                    break;
                default:
                    break;
            }
        } while (userInput != 0);
    }


}