/* *****************************************************************************
 *
 **************************************************************************** */

public class Sqroot {
    public static void main(String[] args) {
        double arg = Double.parseDouble(args[0]);
        double margin = 1.0E-15;
        double t = arg;
        while (Math.abs(t - arg / t) > t * margin) {
            t = (t + arg / t) / 2;
        }
        System.out.println(t);
    }
}
