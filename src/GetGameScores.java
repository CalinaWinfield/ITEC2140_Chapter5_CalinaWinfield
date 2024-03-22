import java.util.Scanner;
/**Class: GetGameScore
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 14, 2024
 *
 * (#7 in HW)
 * Purpose - allows users to enter their name and their high score for the game in two separate methods.
 * Allow the user to continue to enter users and scores until they do not enter a name.
 */

public class GetGameScores {
    private Scanner input;
    private String name;
    private int score;
    public static void main(String[] args) {
        GetGameScores nameScore = new GetGameScores();
        nameScore.input = new Scanner(System.in);

        while(true){                           //while loop added from help
            nameScore.getName();
            if(nameScore.name.isEmpty()){
                break;
            }
            nameScore.getScore();
            nameScore.printScore();
        }
    }

    public void getName(){
        System.out.print("Enter your name: ");
        name = input.nextLine();
    }

    public void getScore() {
        System.out.print("Enter your score: ");
        score = input.nextInt();
        input.nextLine();    //added from help
    }

    public void printScore(){
        System.out.println(name + ", " + score);
    }
}
