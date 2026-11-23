package CO2;

import java.util.Scanner;

public class RecursiveDigitSum {

    static int sumDigits(long n) {
        if (n >= -9 && n <= 9) {
            return (int) Math.abs(n); // Base case
        }
        return (int) (Math.abs(n % 10) + sumDigits(n / 10)); // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();

        System.out.println("Sum of digits = " + sumDigits(n));
        sc.close();
    }
}
