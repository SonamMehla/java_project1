import java.util.Scanner;

public class Lotery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****Welcome to Niagara Falls Casino****");
        int luckyNumber = 45;
        for (int i=1;i<=3;i++) {
            System.out.print("Enter the number :");
            int number = sc.nextInt();

            if (luckyNumber == number) {
                System.out.println("You win ");
                break;
            } else if (luckyNumber != number) {
                System.out.println("You lose ...");
                System.out.println("Please try again..");
            }
        }
    }
}
