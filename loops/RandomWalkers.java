/* *****************************************************************************
 * Source: https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php
 * Takes two integer command-line arguments r and trials. In each of trials
 * independent experiments, simulate a random walk until the random walker is
 * at Manhattan distance r from the starting point. Print the average number of
 * steps.
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int s = 0;
            while (Math.abs(x) + Math.abs(y) != r) {
                double d = Math.random();
                if (d <= 0.25) y = y + 1;
                else if (d <= 0.5) y = y - 1;
                else if (d <= 0.75) x = x + 1;
                else if (d < 1) x = x - 1;
                s++;
            }
            totalSteps += s;
        }
        double average = (double) totalSteps / trials;

        System.out.println("average number of steps = " + average);
    }
}
