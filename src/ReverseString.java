import java.util.Scanner;
/**Class: ReverseString
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 14, 2024
 *
 * (#4 in HW)
 * Purpose - Create a method reverseString which takes a String as a
 * parameter and returns a String with all the characters reversed.
 */

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
