/* *****************************************************************************
 *  Find greatest common divisor of two integers
 **************************************************************************** */

public class GreatComDiv {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long m = Long.parseLong(args[1]);
        long gcd = 1;
        for (long i = 2; i <= Math.min(m, n); i++) {
            while ((n % i == 0) && (m % i == 0)) {
                gcd = gcd * i;
                n = n / i;
                m = m / i;
            }
        }
        System.out.println(gcd);
    }

}
