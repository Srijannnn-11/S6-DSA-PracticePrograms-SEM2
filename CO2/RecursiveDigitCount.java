package CO2;
import java.util.Scanner;

public class RecursiveDigitCount {

    static int countDigits(long n) {
        if (n >= -9 && n <= 9) {
            return 1; // Base case
        }
        return 1 + countDigits(n / 10); // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();

        System.out.println("Digit count = " + countDigits(n));
        sc.close();
    }
}


// Base case: sumTo(0) = 0
// Recursive case: sumTo(n) = n + sumTo(n - 1)