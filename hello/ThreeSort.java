/* *****************************************************************************
 * Assignment from: https://introcs.cs.princeton.edu/java/12types/
 * Three-sort. Write a program ThreeSort.java that takes three int values from
 * the command line and prints them in ascending order.
 * Use Math.min() and Math.max().
 **************************************************************************** */

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle = (a + b + c) - (max + min);
        System.out.println(min + " - " + middle + " - " + max);
    }
}
