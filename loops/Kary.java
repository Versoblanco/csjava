/* *****************************************************************************
 * 1.3.21 Write a program Kary that takes two integer command line arguments i
 * and k and converts i to base k. Assume that i is an integer in Java’s long
 * data type and that k is an integer between 2 and 16. For bases greater than
 * 10, use the letters A through F to represent the 11th through 16th digits,
 * respectively.
 **************************************************************************** */

public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        String iBasek = "";
        do {
            int r = (int) (i % k);
            switch (r) {
                case 10:
                    iBasek = 'A' + iBasek;
                    break;
                case 11:
                    iBasek = 'B' + iBasek;
                    break;
                case 12:
                    iBasek = 'C' + iBasek;
                    break;
                case 13:
                    iBasek = 'D' + iBasek;
                    break;
                case 14:
                    iBasek = 'E' + iBasek;
                    break;
                case 15:
                    iBasek = 'F' + iBasek;
                    break;
                default:
                    iBasek = r + iBasek;
                    break;
            }

            i = i / k;
        } while (i >= 1);

        System.out.println(iBasek);
    }
}
