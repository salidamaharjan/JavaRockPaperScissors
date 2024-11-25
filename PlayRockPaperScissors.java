import java.util.Scanner;
public class PlayRockPaperScissors {
    public static void randomStatus(String userInput) {
        String[] RPS = {"ROCK", "PAPER", "SCISSORS"};
        int randomNum = (int) Math.floor(Math.random() * 3);
        String RPSStatus = RPS[randomNum];
        System.out.print("Computer's Choice: " + RPSStatus);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Rock or Paper or Scissors: ");
        String userInput = scnr.next().toUpperCase();
        randomStatus(userInput);
    }
}
