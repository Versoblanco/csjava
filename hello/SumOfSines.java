/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *  Takes a double command-line argument t (in degrees) and prints the value of
 *  sin(2t) + sin(3t)
 **************************************************************************** */

public class SumOfSines {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double rad = Math.toRadians(t);
        double sum = Math.sin(2 * rad) + Math.sin(3 * rad);
        System.out.println(sum);
    }
}
