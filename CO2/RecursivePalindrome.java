package CO2;

import java.util.Scanner;

public class RecursivePalindrome {

    static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true; // Base case
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1); // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String cleaned = input.replace(" ", "").toLowerCase();
        boolean result = isPalindrome(cleaned, 0, cleaned.length() - 1);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
