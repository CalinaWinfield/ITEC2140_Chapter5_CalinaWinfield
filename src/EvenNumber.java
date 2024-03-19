import java.util.Scanner;

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
