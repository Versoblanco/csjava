/* *****************************************************************************
 * Source:
 * https://coursera.cs.princeton.edu/introcs/assignments/io/specification.php
 * Takes a command-line integer m; reads a sequence of integers between 1 and m
 * from standard input; and prints the Shannon entropy to standard output, with
 * 4 digits after the decimal point.
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int count = 0;
        int[] x = new int[m]; // Frequencies
        double h = 0;
        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            count += 1;
            x[i - 1] += 1;
        }
        for (int i = 0; i < m; i++) {
            double p = ((double) x[i]) / count;
            if (p == 0) {
                h += 0;
            }
            else {
                h += -p * (Math.log(p) / Math.log(2));
            }
        }
        StdOut.printf("%.4f\n", h);
    }
}
