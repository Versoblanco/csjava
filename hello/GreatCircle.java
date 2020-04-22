/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
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
