/* *****************************************************************************
 * Source:
 * https://coursera.cs.princeton.edu/introcs/assignments/arrays/specification.php
 *
 * "Takes two integer command-line arguments n and trials and performs the following
 * experiment, trials times:
 * Choose a birthday for the next person, uniformly at random between 0 and n−1.
 * Have that person enter the room.
 * If that person shares a birthday with someone else in the room, stop;
 * otherwise repeat.
 *
 * In each experiment, count the number of people that enter the room.
 * Print a table that summarizes the results (the count i, the number of times
 * that exactly i people enter the room, and the fraction of times that i or
 * fewer people enter the room) for each possible value of i from 1 until the
 * fraction reaches (or exceeds) 50%."
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]); // Number of days
        int trials = Integer.parseInt(args[1]);

        // Number of trials that the nth person is first to share a birthday
        int[] count = new int[n + 1];

        for (int trial = 0; trial < trials; trial++) {
            boolean[] room = new boolean[n];
            for (int i = 0; i < count.length; i++) {
                // Choose birthday
                int birthday = (int) (Math.random() * n);
                // Check if repeated
                if (room[birthday]) {
                    count[i] += 1;
                    break;
                }
                room[birthday] = true;
            }
        }

        // Display statistics
        double sum = 0;
        for (int i = 0; i < count.length; i++) {
            sum += count[i];
            double fraction = sum / trials;
            System.out.println(i + 1 + " " + count[i] + " " + fraction);
            if (fraction >= 0.5) {
                break;
            }

        }
    }
}
