/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        double white = 1.0 - black;
        double scale = 255.0 * white;
        int red = (int) Math.round(scale * (1.0 - cyan));
        int green = (int) Math.round(scale * (1.0 - magenta));
        int blue = (int) Math.round(scale * (1.0 - yellow));
        String output = ""
                + "red   = " + red + "\n"
                + "green = " + green + "\n"
                + "blue  = " + blue;
        System.out.println(output);

    }
}
