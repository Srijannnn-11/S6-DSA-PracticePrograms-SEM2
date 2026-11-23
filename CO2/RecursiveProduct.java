package CO2;
import java.util.Scanner;

public class RecursiveProduct {

    static long product(int n) {
        if (n == 0) {
            return 1; // Base case
        }
        return n * product(n - 1); // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Enter n from 0 to 20.");
        } else {
            System.out.println("Product = " + product(n));
        }

        sc.close();
    }
}
// Base case: 1! = 1(and 0! = 1)
// Recursive case: n! = n * fact(n - 1)
// In general: n! = n * (n - 1)!
