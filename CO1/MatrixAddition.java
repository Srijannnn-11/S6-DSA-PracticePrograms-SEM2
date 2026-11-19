package CO1;
import java.util.Scanner; // Time: O(1), Space: O(1)

public class MatrixAddition { // Time: O(1), Space: O(1)

    public static void main(String[] args) { // Time: O(1), Space: O(1)

        Scanner sc = new Scanner(System.in); // Time: O(1), Space: O(1)

        System.out.println("Enter rows and columns:"); // Time: O(1), Space: O(1)

        int r = sc.nextInt(); // Time: O(1), Space: O(1)

        int c = sc.nextInt(); // Time: O(1), Space: O(1)

        int a[][] = new int[r][c]; // Time: O(r*c), Space: O(r*c)

        int b[][] = new int[r][c]; // Time: O(r*c), Space: O(r*c)

        int sum[][] = new int[r][c]; // Time: O(r*c), Space: O(r*c)

        System.out.println("Enter first matrix:"); // Time: O(1), Space: O(1)

        for (int i = 0; i < r; i++) { // Time: O(r), Space: O(1)

            for (int j = 0; j < c; j++) { // Time: O(c) per row, O(r*c) total, Space: O(1)

                a[i][j] = sc.nextInt(); // Time: O(1) per iteration, Space: O(1)
            }
        }

        System.out.println("Enter second matrix:"); // Time: O(1), Space: O(1)

        for (int i = 0; i < r; i++) { // Time: O(r), Space: O(1)

            for (int j = 0; j < c; j++) { // Time: O(c) per row, O(r*c) total, Space: O(1)

                b[i][j] = sc.nextInt(); // Time: O(1) per iteration, Space: O(1)
            }
        }

        for (int i = 0; i < r; i++) { // Time: O(r), Space: O(1)

            for (int j = 0; j < c; j++) { // Time: O(c) per row, O(r*c) total, Space: O(1)

                sum[i][j] = a[i][j] + b[i][j]; // Time: O(1) per iteration, Space: O(1)
            }
        }

        System.out.println("Sum of matrices:"); // Time: O(1), Space: O(1)

        for (int i = 0; i < r; i++) { // Time: O(r), Space: O(1)

            for (int j = 0; j < c; j++) { // Time: O(c) per row, O(r*c) total, Space: O(1)

                System.out.print(sum[i][j] + " "); // Time: O(1) per iteration, Space: O(1)
            }

            System.out.println(); // Time: O(1), Space: O(1)
        }
    }
}