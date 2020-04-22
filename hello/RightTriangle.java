/* *****************************************************************************
 * Assignment specification from:
 * https://coursera.cs.princeton.edu/introcs/assignments/hello/specification.php
 * Write a program RightTriangle that takes three int command-line arguments and
 * determines whether they constitute the side lengths of some right triangle.
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isPositive = (a > 0) && (b > 0) && (c > 0);
        boolean isSquares = ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
                || ((Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2))
                || ((Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2));
        boolean isRightTriangle = isPositive && isSquares;
        System.out.println(isRightTriangle);
    }
}
