// Rock-Paper-Scissors is a game played between a minimum of two players. Each player can
// choose either rock, paper, or scissors. Here the game is played between a user and a
// computer. Based on the rules, either a player or a computer will win. Show the stats of
// player and computer win in a tabular format across multiple games. Also, show the winning
// percentage between the player and the computer.
// Hint =&gt;
// a. The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins
// (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
// b. Create a Method to find the Computer Choice using the Math.random
// c. Create a Method to find the winner between the user and the computer
// d. Create a Method to find the average and percentage of wins for the user and the
// computer and return a String 2D array
// e. Create a Method to display the results of every game and also display the average and
// percentage wins
// f. In the main take user input for the number of games and call methods to display results

import java.util.Scanner;
public class L2Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int games = scanner.nextInt();
        int userWins = 0, computerWins = 0;
        if (games <= 0) {
            System.out.println("Number of games must be positive.");
            return;
        }
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            int result = determineWinner(userChoice, computerChoice);
            if (result == 1) userWins++;
            else if (result == -1) computerWins++;
        }

        System.out.println("Player wins: " + userWins);
        System.out.println("Computer wins: " + computerWins);
        scanner.close();
    }

    private static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    private static int determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            System.out.println("Result: tie");
            return 0;
        }
        if (userChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("Result: player wins");
                return 1;
            }
            System.out.println("Result: computer wins");
            return -1;
        }
        if (userChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                System.out.println("Result: player wins");
                return 1;
            }
            System.out.println("Result: computer wins");
            return -1;
        }
        if (userChoice.equals("scissors")) {
            if (computerChoice.equals("paper")) {
                System.out.println("Result: player wins");
                return 1;
            }
            System.out.println("Result: computer wins");
            return -1;
        }
        System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
        return 0;
    }
}
