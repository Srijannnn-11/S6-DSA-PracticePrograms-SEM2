package CO2;
public class SumTo {
    static int sumTo(int n) {
        if (n == 0)
            return 0;                       // Base case
        return n + sumTo(n - 1);            // Recursive case
    }
    public static void main(String[] args) {
        System.out.println("sumTo(4) = " + sumTo(4));
    }
}


// Base case: sumTo(0) = 0
// Recursive case: sumTo(n) = n + sumTo(n - 1)