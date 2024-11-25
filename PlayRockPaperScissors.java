import java.util.Scanner;
public class PlayRockPaperScissors {
    public static void checkStatus() {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter ROCK or PAPER or SCISSORS: ");
        String userChoice = scnr.next().toUpperCase();

        String[] choices = {"ROCK", "PAPER", "SCISSORS"};
        int randomNum = (int) Math.floor(Math.random() * 3);
        String compChoice = choices[randomNum];
        System.out.println("Computer's Choice: " + compChoice);

        while(userChoice.equals(compChoice)){
            System.out.print("It's a DRAW!! Enter ROCK or PAPER or SCISSORS: ");
            userChoice = scnr.next().toUpperCase();
            randomNum = (int) Math.floor(Math.random() * 3);
            compChoice = choices[randomNum];
            System.out.print("Computer's Choice: " + compChoice);
        }
        if((userChoice.equals("ROCK") && compChoice.equals("SCISSORS")) || (userChoice.equals("PAPER") && compChoice.equals("ROCK")) || (userChoice.equals("SCISSORS") && compChoice.equals("PAPER"))){
            System.out.println("YOU 🏆WIN!!");
        } else {
            System.out.println("YOU 🥶LOSE!!");
        }
    }

    public static void main(String[] args) {
       checkStatus();
    }
}
