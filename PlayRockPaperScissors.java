import java.util.Scanner;
public class PlayRockPaperScissors {
    public static int checkStatus() {
        String[] RPS = {"ROCK", "PAPER", "SCISSORS"};
        int randomRPS = (int) Math.floor(Math.random() * 3);
        return randomRPS;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Rock or Paper or Scissors: ");
        String status = scnr.next();
        System.out.println(checkStatus());
    }
}
