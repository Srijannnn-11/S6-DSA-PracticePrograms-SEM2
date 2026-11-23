package CO2;
import java.util.Scanner;

public class RecursiveReverseNumber {

    static long reversePositive(long n, long reversed) {
        if (n == 0) {
            return reversed; // Base case
        }
        return reversePositive(n / 10, reversed * 10 + n % 10); // Recursive step
    }

    static long reverseNumber(long n) {
        long sign = (n < 0) ? -1 : 1;
        long value = Math.abs(n);
        return sign * reversePositive(value, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();

        System.out.println("Reversed number = " + reverseNumber(n));
        sc.close();
    }
}