import java.util.Scanner;
/**Class: GetUserInput
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 14, 2024
 *
 * (#2 in HW)
 * Purpose - allows the user to enter a String and returns this
 * value to be printed using your printString method defined above.
 */

public class GetUserInput{
    private Scanner input;
    private String userInput;
    public static void main(String[] args){
        GetUserInput keyboard = new GetUserInput();
        keyboard.input = new Scanner(System.in);

        keyboard.getInput();
        keyboard.printString(keyboard.userInput);

    }

    public void getInput(){
        System.out.print("Enter a string: ");
        userInput = input.nextLine();
    }

    public void printString(String userInput){
        System.out.println(userInput);
    }
}
