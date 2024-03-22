import java.util.Scanner;
/**Class: EvenNumber
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 14, 2024
 *
 * (#3 in HW)
 * Purpose - asks the user to enter a number, which will be passed through one method to
 * determine if it's an even number, and another method to print out whether it is or not.
 */

public class EvenNumber {
    private Scanner input;
    private int number;

    public static void main(String[] args) {
        EvenNumber evenNum1 = new EvenNumber();
        evenNum1.input = new Scanner(System.in);

        evenNum1.getNumber();
        evenNum1.isEven(evenNum1.number);

        boolean even = evenNum1.isEven(evenNum1.number);
        evenNum1.printEven(even);

    }

    //took code from Exercise1 in Chapter 4's homework, and broke it up and changed it to fit this program
    public void getNumber(){
        System.out.print("Enter an integer: ");
        number = input.nextInt();
    }

    public boolean isEven(int number){
        boolean even;
        if(number % 2 == 0){
            even = true;
        }
        else{
            even = false;
        }
        return even;
    }

    public void printEven(boolean even) {
        if(even) {
            System.out.println("The number is even.");
        }
        else {
            System.out.print("The number is odd.");
        }
    }
}
