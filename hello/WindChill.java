/* *****************************************************************************
 * Assignment from: https://introcs.cs.princeton.edu/java/12types/
 * Wind chill. Given the temperature t (in Fahrenheit) and the wind speed v
 * (in miles per hour), the National Weather Service defines the wind chill to be:
 * w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v0.16
 * Write a program WindChill.java that takes two double command-line arguments
 * t and v and prints the wind chill. Use Math.pow(a, b) to compute ab.
 * Note: the formula is not valid if t is larger than 50 in absolute value or
 * if v is larger than 120 or less than 3 (you may assume that the values you
 * get are in that range).
 **************************************************************************** */

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println(w);
    }
}
