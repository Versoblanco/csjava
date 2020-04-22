/* *****************************************************************************
 * Assignment specification from:
 * https://coursera.cs.princeton.edu/introcs/assignments/hello/specification.php
 * Write a program CMYKtoRGB.java that converts from CMYK format to RGB format
 * using these mathematical formulas:
 * white =1−black
 * red   =255×white×(1−cyan)
 * green =255×white×(1−magenta)
 * blue  = 255×white×(1−yellow)
 * Your program must take four double command-line arguments cyan, magenta,
 * yellow, and black; compute the corresponding RGB values, each rounded to the
 * nearest integer; and print the RGB values
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
