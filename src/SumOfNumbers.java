/**Class: SumOfNumbers
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 14, 2024
 *
 * (#1 in HW)
 * Purpose - Create a method sum that takes two parameters, both integers. Create another method
 * sum that takes two parameters, both doubles. In both methods, return the sum of both parameters.
 *
 */

public class SumOfNumbers {
    public static void main(String[] args) {
        SumOfNumbers sumNum = new SumOfNumbers();

        int intSum = sumNum.sum(7, 10);
        System.out.println("Sum of the integers: " + intSum);

        double doubleSum = sumNum.sum(4.9, 11.5);
        System.out.println("Sum of the doubles: " + doubleSum);
    }

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public double sum(double num1, double num2){
        return num1 + num2;
    }
}
