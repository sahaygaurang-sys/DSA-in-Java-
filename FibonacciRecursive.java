public class FibonacciRecursive {

    // Returns nth Fibonacci number (0-based index)
    // fib(0) = 0, fib(1) = 1, fib(2) = 1, fib(3) = 2, ...
    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n == 0) {        // base case 1
            return 0;
        } else if (n == 1) { // base case 2
            return 1;
        } else {             // recursive case
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // change this to test other values

        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
