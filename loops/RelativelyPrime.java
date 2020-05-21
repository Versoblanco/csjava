/* *****************************************************************************
 * Via Coursera
 * From from book Computer Science: An Interdisciplinary Approach
 * 1.3.31 Write a program RelativelyPrime that takes an integer command-line
 * argument n and prints an n-by-n table such that there is an * in row i and
 * column j if the gcd of i and j is 1 (i and j are relatively prime) and a
 * space in that position otherwise.
 **************************************************************************** */

public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int gcd = 1;
                for (int f = 2; f <= Math.min(i, j); f++) {
                    int a = i;
                    int b = j;
                    while ((a % f == 0) && (b % f == 0)) {
                        gcd = gcd * f;
                        a = a / f;
                        b = b / f;
                    }
                }
                if (gcd == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
