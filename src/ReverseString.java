import java.util.Scanner;

public class ReverseString{
    private Scanner input;
    private String str;
    public static void main(String[] args){
        ReverseString reversed = new ReverseString();
        reversed.input = new Scanner(System.in);
        reversed.reverseString();

    }

    public void reverseString(){
        //I copied and slightly changed this code from DayStringLoop.java class from Feb. 15th
        System.out.print("Enter a string: ");
        str = input.nextLine();

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }
}
