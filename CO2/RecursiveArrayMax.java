package CO2;

import java.util.Scanner;

public class RecursiveArrayMax {
    static int maximum(int[] a, int index) {
        if (index == a.length - 1) {
            return a[index]; // Base case
        }

        int maxRest = maximum(a, index + 1);
        return Math.max(a[index], maxRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] a = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Maximum = " + maximum(a, 0));
        }
        sc.close();
    }
}
