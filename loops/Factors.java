/* *****************************************************************************
 * Sources: https://introcs.cs.princeton.edu/java/13flow
 * https://introcs.cs.princeton.edu/java/13flow/Factors.java.html
 * Takes an integer command-line argument n and prints its prime factorization.
 **************************************************************************** */

public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
        else {
            System.out.println();
        }
    }
}
