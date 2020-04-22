/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *  Prints the sum of two random integers between 1 and 6
 **************************************************************************** */

public class SumOfTwoDice {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        int sides = 6;
        int diceA = 1 + (int) (sides * a);
        int diceB = 1 + (int) (sides * b);
        int sumDices = diceA + diceB;
        System.out.println(diceA + " + " + diceB + " = " + sumDices);
    }
}
