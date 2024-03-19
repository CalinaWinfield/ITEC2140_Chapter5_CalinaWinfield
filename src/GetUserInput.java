import java.util.Scanner;

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
