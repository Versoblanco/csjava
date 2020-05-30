/* *****************************************************************************
 * Source:
 * https://coursera.cs.princeton.edu/introcs/assignments/arrays/specification.php
 * «Takes an integer command-line argument m, followed by a sequence of positive
 * integer command-line arguments a1,a2,…,an, and prints m random indices
 * (separated by whitespace), choosing each index i with probability
 * proportional to ai.»
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] s = new int[args.length];

        // Define cumulative sums
        for (int i = 1; i < s.length; i++) {
            s[i] = Integer.parseInt(args[i]) + s[i - 1];
        }

        for (int j = 0; j < m; j++) {
            // Pick random number uniformly
            double r = Math.random() * s[s.length - 1];
            // Find and show unique index
            for (int k = 1; k < s.length; k++) {
                if (r <= s[k]) {
                    System.out.print(k + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
