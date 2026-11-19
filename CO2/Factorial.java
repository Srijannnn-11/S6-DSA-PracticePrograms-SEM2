package CO2;
public class Factorial {
    static long fact (int n) {
        if (n <= 1)                      
            return 1;                    // Base case
        return n * fact(n - 1);          // Recursive case
    }
    public static void main(String[] args) {
        System.out.println("5! = " + fact(5));
    }
}


// Base case: 1! = 1(and 0! = 1)
// Recursive case: n! = n * fact(n - 1)
// In general: n! = n * (n - 1)!
