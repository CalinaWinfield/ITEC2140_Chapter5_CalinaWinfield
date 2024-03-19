import java.util.Scanner;

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
