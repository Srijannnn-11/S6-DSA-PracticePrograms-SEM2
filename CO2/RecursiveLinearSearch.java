package CO2;

import java.util.Scanner;

public class RecursiveLinearSearch {
    static int search(int[] a, int index, int key) {
        if (index == a.length) {
            return -1; // Not found
        }
        if (a[index] == key) {
            return index; // Found
        }
        return search(a, index + 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid array size.");
        } else {
            int[] a = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.print("Enter key to search: ");
            int key = sc.nextInt();
            int index = search(a, 0, key);

            if (index == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index " + index);
            }
        }
        sc.close();
    }
}
