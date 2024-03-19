import java.util.Scanner;

public class IsPalindrome{
    private Scanner input;
    private String str;

    public static void main(String[] args){
        IsPalindrome userInput = new IsPalindrome();
        userInput.input = new Scanner(System.in);
        userInput.getString();
        boolean palindrome = userInput.isPalindrome(userInput.str);
        userInput.printStatus(palindrome);
    }

    //I copied these methods as pieces from the class Palindrome1 on Feb. 22nd
    public void getString(){
        System.out.print("Enter a string: ");
        str = input.nextLine();
    }

    public static boolean isPalindrome(String str){
        int low = 0;
        int high = str.length() - 1;

        while(low < high){
            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public void printStatus(boolean isPalindrome){
        if(isPalindrome){
            System.out.println(str + " is a palindrome.");
        }
        else{
            System.out.println(str + " is not a palindrome.");
        }
    }
}
