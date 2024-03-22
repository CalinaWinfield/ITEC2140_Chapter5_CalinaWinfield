import java.util.Scanner;
/**Class: RectangleSize
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 14, 2024
 *
 * (#8 in HW)
 * Purpose - allow the user to input a length and width of a rectangle for the area of it to be calculated
 * through one method, and another method to determine if it is larger or smaller than 300.
 */

public class RectangleSize {
    private Scanner input;
    private int length, width;


    //I copied this code from March 14th's lecture/class Rectangle.java
    public static void main(String[] args){
        RectangleSize rectangle = new RectangleSize();
        rectangle.input = new Scanner(System.in);

        rectangle.getSides();

        int area = rectangle.getArea(rectangle.length, rectangle.width);
        System.out.println("Area value is: " + area);

        boolean large = rectangle.isLarge(area);
        rectangle.printStatus(large);

    }

    public void getSides(){
        System.out.print("Enter length: ");
        length = input.nextInt();
        System.out.print("Enter width: ");
        width = input.nextInt();
    }

    public int getArea(int length, int width){
        return length * width;
    }

    public boolean isLarge(int area){

        boolean large;
        if(area > 300){
            large = true;
        }
        else{
            large = false;
        }
        return large;
    }

    public void printStatus(boolean large){
        if(large){
            System.out.println("This is a large rectangle.");
        }
        else{
            System.out.println("This is a small rectangle.");
        }
    }
}
