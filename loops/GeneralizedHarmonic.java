/* *****************************************************************************
 * Source: https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php
 * Takes two integer command-line arguments n and r and uses a for loop to
 * compute the nth generalized harmonic number of order r, defined by the
 * following formula:
 * H(n,r)=1/1er + 1/2er + ⋯ +1/ner.
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double h = 0;
        for (int i = 1; i <= n; i++) {
            h = h + 1 / Math.pow(i, r);
        }
        System.out.println(h);
    }
}
