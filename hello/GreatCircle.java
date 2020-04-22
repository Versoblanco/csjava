/* *****************************************************************************
 * Assignment specification from:
 * https://coursera.cs.princeton.edu/introcs/assignments/hello/specification.php
 * Write a program GreatCircle.java that takes four double command-line arguments
 * x1, y1, x2, and y2—the latitude and longitude (in degrees) of two points on
 * the surface of the earth—and prints the great-circle distance (in kilometers)
 * between them. Use the following Haversine formula
 * [...]
 * where r=6,371.0 is the mean radius of the Earth (in kilometers).
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double cosX1 = Math.cos(x1);
        double cosX2 = Math.cos(x2);
        double distance = 2 * r * Math.asin(Math.sqrt(
                Math.pow(Math.sin(deltaX / 2), 2)
                        + cosX1 * cosX2
                        * Math.pow(Math.sin(deltaY / 2), 2)));
        System.out.println(distance + " kilometers");
    }
}
