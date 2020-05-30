/* *****************************************************************************
 * Source:
 * https://coursera.cs.princeton.edu/introcs/assignments/arrays/specification.php
 * "Takes an integer command-line argument n and prints an n-by-n pattern like
 * the ones below. Include two space characters between each + and - character."
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] s = new int[n];
        // Create Thue-Morse sequence of n bits
        for (int k = 0; k < n; k++) {
            int val = k;
            int bin = 0;
            // Convert nth to binary and sum digits
            while (val >= 1) {
                int r = val % 2;
                bin = bin + r;
                val = val / 2;
            }
            // Check if odd/even and add to sequence
            s[k] = bin % 2;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i] == s[j]) {
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
