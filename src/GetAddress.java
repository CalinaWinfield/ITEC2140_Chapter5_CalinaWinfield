import java.util.Scanner;

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
