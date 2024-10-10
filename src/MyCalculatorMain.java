import java.util.Scanner;

public class MyCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();
        int choice;
        do {
            System.out.println("****************");
            System.out.println("*****Welcome to calculator*******");
            System.out.println("*******************");
            System.out.println("Choice any option");
            System.out.println("1. for Addition");
            System.out.println("2. for Subtraction");
            System.out.println("3. for Multiplication");
            System.out.println("4. for Division");
            System.out.println("5. for Module");
             choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number :");
                    int n1 = sc.nextInt();
                    System.out.print("Enter second number :");
                    int n2 = sc.nextInt();
                    System.out.println("The sum is : " + myCalculator.sum(n1, n2));
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while (choice!=0);

    }
}
