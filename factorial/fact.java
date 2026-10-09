public class Factorial {
    public static long factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        // Recursive step
        return (long) n * factorial(n - 1);
    }
}