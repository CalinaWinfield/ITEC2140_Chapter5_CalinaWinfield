import java.util.Scanner;
/**Class: GetAddress
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 14, 2024
 *
 * (#6 in HW)
 * Purpose - create a class with instance variables to hold the name, street
 * address, city, and state for a user using nameAddress and cityState methods.
 */

public class GetAddress {
    private Scanner keyboard;
    public static void main(String[] args) {
        GetAddress rsObject = new GetAddress();
        rsObject.keyboard = new Scanner(System.in);
        String str = rsObject.nameAddress() + rsObject.cityState();
        System.out.print(str);

    }

    public String nameAddress(){
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter your address: ");
        String address = keyboard.nextLine();
        return name + "\n" + address + "\n";
    }

    public String cityState(){
        System.out.print("Enter your city: ");
        String city = keyboard.nextLine();
        System.out.print("Enter your state: ");
        String state = keyboard.nextLine();
        return city + ", " + state;
    }
}
