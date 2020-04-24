/* *****************************************************************************
 * From book Computer Science: An Interdisciplinary Approach, via Coursera:
 * https://www.coursera.org/learn/cs-programming-java
 * 1.2.30 Uniform random numbers. Write a program that prints five uniform
 * random numbers between 0 and 1, their average value, and their minimum and
 * maximum values. Use Math.random(), Math.min(), and Math.max().
 **************************************************************************** */

public class UniformRandomNumbers {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double maxABCD = Math.max(Math.max(a, b), Math.max(c, d));
        double max = Math.max(maxABCD, e);
        double minABCD = Math.min(Math.min(a, b), Math.min(c, d));
        double min = Math.min(minABCD, e);
        double average = (a + b + c + d + e) / 5;
        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Average = " + average);

    }
}
