/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
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
