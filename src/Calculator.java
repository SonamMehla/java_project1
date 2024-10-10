import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("Welcome to my calculator");
        System.out.println("********************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modules");

        System.out.println("Choice any number between 1 to 5");
        int choice = obj.nextInt();

        System.out.println("Enter first number :");
        int num1 = obj.nextInt();

        System.out.println("Enter second number :");
        int num2 = obj.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

       if (choice ==1) {
           System.out.println("The Addition of num1 and num2 = " + sum);
       } else if (choice ==2) {
           System.out.println("The Subtraction of num1 and num2 = " + sub);
       }
       else if (choice ==3) {
           System.out.println("The Multiplication of num1 and num2 = " + mul);
       }
       else if (choice ==4) {
           System.out.println("The Division of num1 and num2 = " + div);
       }
       else if (choice ==5) {
           System.out.println("The Modules of num1 and num2 = " + mod);
       }
       else{
           System.out.println("Wrong input .... Choice b/w 1 to 5");
       }
       
    }
}
