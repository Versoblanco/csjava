/* *****************************************************************************
 * Source: https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php
 * Takes an integer command-line argument r and simulates the motion of a random
 * walk until the random walker is at Manhattan distance r from the starting
 * point. Print the coordinates at each step of the walk (including the starting
 * and ending points), treating the starting point as (0, 0). Also, print the
 * total number of steps taken.
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int s = 0;
        System.out.println("(" + x + ", " + y + ")");
        while (Math.abs(x) + Math.abs(y) != r) {
            double d = Math.random();
            if (d <= 0.25) y = y + 1;
            else if (d <= 0.5) y = y - 1;
            else if (d <= 0.75) x = x + 1;
            else if (d < 1) x = x - 1;
            System.out.println("(" + x + ", " + y + ")");
            s++;
        }
        System.out.println("Steps = " + s);

    }
}
