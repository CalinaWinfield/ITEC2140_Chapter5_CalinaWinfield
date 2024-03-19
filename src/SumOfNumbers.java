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
