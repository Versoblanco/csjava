/* *****************************************************************************
 * Source:
 * https://coursera.cs.princeton.edu/introcs/assignments/arrays/specification.php
 *
 * Takes three integer command-line arguments m, n, and k and prints an m-by-n
 * grid of cells with k mines, using asterisks for mines and integers for the
 * neighboring mine counts (with two space characters between each cell).
 * To do so,
 *   -Generate an m-by-n grid of cells, with exactly k of the mn cells containing
 *    mines, uniformly at random.
 *   -For each cell not containing a mine, count the number of neighboring mines
 *    (above, below, left, right, or diagonal).
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] grid = new int[m][n];

        // Add mines uniformly at random
        int i = 0;
        while (i < k && i < (m * n)) {
            int rRow = (int) (Math.random() * m);
            int rCol = (int) (Math.random() * n);
            if (grid[rRow][rCol] != 9) {
                grid[rRow][rCol] = 9;
                i += 1;
            }
        }

        // Check surrounding cells and count mines
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] < 9) {

                    int above = row - 1;
                    int below = row + 1;
                    int left = col - 1;
                    int right = col + 1;
                    boolean rowAbove = above >= 0;
                    boolean rowBelow = below < m;
                    boolean colLeft = left >= 0;
                    boolean colRight = right < n;
                    int mines = 0;

                    // Check if cell inside grid limits before counting
                    if (rowAbove && colLeft && grid[above][left] > 8) {
                        mines += 1;
                    }
                    if (rowAbove && grid[above][col] > 8) {
                        mines += 1;
                    }
                    if (rowAbove && colRight && grid[above][right] > 8) {
                        mines += 1;
                    }
                    if (colLeft && grid[row][left] > 8) {
                        mines += 1;
                    }
                    if (colRight && grid[row][right] > 8) {
                        mines += 1;
                    }
                    if (rowBelow && colLeft && grid[below][left] > 8) {
                        mines += 1;
                    }
                    if (rowBelow && grid[below][col] > 8) {
                        mines += 1;
                    }
                    if (rowBelow && colRight && grid[below][right] > 8) {
                        mines += 1;
                    }
                    grid[row][col] = mines;
                }
            }
        }

        // Display grid
        for (
                int row = 0;
                row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] > 8) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print(grid[row][col] + "  ");
                }
            }
            System.out.println();
        }
    }
}
