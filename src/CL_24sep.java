import java.util.Scanner;

public class CL_24sep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        int input = sc.nextInt();

        switch (input){
            case 1 :
                System.out.println("Press 1 for Internet");
                int n1 = sc.nextInt();
                switch (n1){
                    case 1:
                        System.out.println("Press 1 for Billing");
                        break;
                    case 2:
                        System.out.println("Press 2 for Account info");
                        break;
                    case 3:
                        System.out.println("Press 3 for Payment Arrangement");
                        break;
                    case 4:
                        System.out.println("Press 4 for Technical Support");

                        System.out.println("Choice option");
                        int op = sc.nextInt();
                        if(op==1){
                            System.out.println("Go for agent");
                            System.out.println("Choice b/w 1 & 2");
                            int ch = sc.nextInt();
                            if (ch==1)
                                System.out.println("Your wait time is 200 minute");

                        } else if (op==2) {
                            System.out.println("Go for AI");
                        }else {
                            System.out.println("Invalid input");
                }
                        break;

                }
                break;
            case 2:
                System.out.println("Press 2 for Mobile");
                int n2 = sc.nextInt();

                switch (n2) {
                    case 1:
                        System.out.println("Press 1 for Billing");
                        break;
                    case 2:
                        System.out.println("Press 2 for Account info");
                        break;
                    case 3:
                        System.out.println("Press 3 for Payment Arrangement");
                        break;
                    case 4:
                        System.out.println("Press 4 for Technical Support");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Input...");
        }
    }
}
