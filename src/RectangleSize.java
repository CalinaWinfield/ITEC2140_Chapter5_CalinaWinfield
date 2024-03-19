import java.util.Scanner;

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
