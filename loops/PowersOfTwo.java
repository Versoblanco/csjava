/* *****************************************************************************
 * Source: https://introcs.cs.princeton.edu/java/13flow/PowersOfTwo.java.html
 * Takes a command-line argument n and prints a table of the powers of 2 that
 * are less than or equal to 2^n.
 * Remarks: Only works if 0 <= n < 31 since 2^31 overflows an int.
 **************************************************************************** */

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int p2 = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " + p2);
            p2 = 2 * p2;
        }

    }
}
