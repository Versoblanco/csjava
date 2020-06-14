/* *****************************************************************************
 * Source:
 * https://coursera.cs.princeton.edu/introcs/assignments/io/specification.php
 * Takes a command-line integer n and plots an n-by-n checkerboard pattern to
 * standard drawing. Color the squares blue and light gray, with the bottom-left
 * square blue.
 **************************************************************************** */

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if ((x + y) % 2 == 0) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                }
                else {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                }
                StdDraw.filledSquare((x + 0.5), (y + 0.5), 0.5);

            }
        }
    }
}
