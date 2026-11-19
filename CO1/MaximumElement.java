package CO1;
import java.util.Scanner; // Time: O(1), Space: O(1)

public class MaximumElement { // Time: O(1), Space: O(1)

    public static void main(String[] args) { // Time: O(1), Space: O(1)

        Scanner sc = new Scanner(System.in); // Time: O(1), Space: O(1)

        System.out.println("Enter number of elements:"); // Time: O(1), Space: O(1)

        int n = sc.nextInt(); // Time: O(1), Space: O(1)

        int arr[] = new int[n]; // Time: O(n), Space: O(n)

        System.out.println("Enter array elements:"); // Time: O(1), Space: O(1)

        for (int i = 0; i < n; i++) { // Time: O(n), Space: O(1)

            arr[i] = sc.nextInt(); // Time: O(1) per iteration, Space: O(1)
        }

        int max = arr[0]; // Time: O(1), Space: O(1)

        for (int i = 1; i < n; i++) { // Time: O(n), Space: O(1)

            if (arr[i] > max) { // Time: O(1) per iteration, Space: O(1)

                max = arr[i]; // Time: O(1), Space: O(1)
            }
        }

        System.out.println("Maximum element = " + max); // Time: O(1), Space: O(1)
    }
}