package InterviewQuestions;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        int num = 56;
        System.out.println("The largest prime number of " + num + " is " + calculateLargestPrimeNumber(num));
    }

    public static long calculateLargestPrimeNumber(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        long largestPrime = 1;
        double sqrt = Math.sqrt(n);
        for (int i = 3; i < sqrt; i += 2) {
            while (n % i == 0) {
                n = n / i;
            }
        }
        if (n > 2) {
            largestPrime = n;
        }
        return largestPrime;
    }
}