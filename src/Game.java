import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*****Rock-Paper-Scissor******");
        int rounds;
        System.out.print("How many rounds you want to play : ");
        rounds = sc.nextInt();
        for (int i = 1; i <= rounds; i++) {

            System.out.println("Enter \n0 for Rock \n1 for Paper \n2 for Scissor");
            System.out.print("Enter your input :");
            int userInput = sc.nextInt();

            Random rd = new Random();
            int computerInput = rd.nextInt(3);


            if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                    || userInput == 2 && computerInput == 1) {
                System.out.println("You win");
            } else if (userInput == computerInput) {
                System.out.println("Draw");
            } else {
                System.out.println("Computer win");
            }

            if (computerInput == 0) {
                System.out.println("Computer choice : Rock");
            } else if (computerInput == 1) {
                System.out.println("Computer choice : Paper");
            } else if (computerInput == 2) {
                System.out.println("Computer choice : Scissor");
            }
        }


        }
    }


