import java.util.Scanner;

public class BankingSystemAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int pin =0;
        boolean pinSet = false;

        System.out.println("Welcome to RBC Banking System");

        System.out.print("Please set your PIN only 4 digit long :");
        pin = sc.nextInt();
        pinSet = true;

        int enterPin;
        int option;
        do{
            System.out.println("Please an option : \n1. Check Balance \n2. Deposit Money \n3. Withdraw Money \n4. Exit");
             option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter your PIN to check balance :");
                     enterPin = sc.nextInt();
                    if (enterPin==pin){
                        System.out.println("Your current balance is :" + balance);
                    }else {
                        System.out.println("Incorrect PIN. Access denied.");
                    }
                    break;

                case 2:
                    System.out.print("Enter PIN to Deposit Money :");
                     enterPin = sc.nextInt();
                     if (enterPin==pin){
                         System.out.print("Enter your deposit :");
                         double deposit = sc.nextDouble();
                         if(deposit>0){
                             balance += deposit;
                             System.out.println(deposit + " has been deposit to your account.");
                         }else {
                             System.out.println("Invalid amount... Try again.");
                         }
                     }else {
                         System.out.println("Incorrect PIN. Access denied");
                     }
                     break;
                case 3:
                    System.out.print("Enter PIN to withdraw money :");
                    enterPin = sc.nextInt();
                    if (enterPin==pin){
                        System.out.print("Enter amount to withdraw :");
                        double withdrawal = sc.nextDouble();
                        if (withdrawal>0 && withdrawal <=balance){
                            balance -= withdrawal;
                            System.out.println(withdrawal + " has been withdraw from your account");
                        } else if (withdrawal>balance) {
                            System.out.println("Error : Insufficient amount.");
                        }else {
                            System.out.println("Invalid amount...Please try again.");
                        }
                    }else {
                        System.out.println("Incorrect PIN . Access denied.");
                    }
                    break;
                case 4:
                    System.out.println("Exit. Thank you");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }while ( option !=4);

    }
}
