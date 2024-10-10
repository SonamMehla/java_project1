import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press\n1 for english \n2 for french");
        if(sc.nextInt()==1){
            System.out.println("Press \n1 for Internet \n2 for Mobile \n3 to go back to main menu");
            int input1 = sc.nextInt();
            switch (input1){
                case 1:
                    System.out.println("You selected Internet \nPress \n1 for Billing \n2 for Account info \n3 for payment method " +
                            "\n4 for technical support");
                    int inputi2 = sc.nextInt();
                    switch (inputi2){
                        case 1 :
                            System.out.println("Here are your billing details");
                            break;
                            case 2 :
                            System.out.println("Here are your Account info");
                            break;
                            case 3 :
                            System.out.println("Here are your payment method");
                            break;
                        case 4:
                            System.out.println("Press \n1 to talk to agent \n2 to talk to our automated chatbot");
                            int inputi3 = sc.nextInt();
                            if(inputi3==1){
                                System.out.println("Your wait time is 200 mins");
                            } else if (inputi3==2) {
                                System.out.println("Please type your message");
                            }else {
                                System.out.println("Invalid option");
                            }
                            break;
                        case 5:
                            System.out.println("going back to main menu");
                            break;
                        default:
                            System.out.println("Invalid options");
                    }
                    break;
                case 2:
                    System.out.println("You selected Mobile \nPress \n1 for Billing \n2 for Account info \n3 for payment method " +
                            "\n4 for technical support");
                    int inputj2 = sc.nextInt();
                    switch (inputj2){
                        case 1 :
                            System.out.println("Here are your billing details");
                            break;
                        case 2 :
                            System.out.println("Here are your Account info");
                            break;
                        case 3 :
                            System.out.println("Here are your payment method");
                            break;
                        case 4:
                            System.out.println("Press \n1 to talk to agent \n2 to talk to our automated chatbot");
                            int inputj3 = sc.nextInt();
                            if(inputj3==1){
                                System.out.println("Your wait time is 200 mins");
                            } else if (inputj3==2) {
                                System.out.println("Please type your message");
                            }else {
                                System.out.println("Invalid option");
                            }
                            break;
                        case 5:
                            System.out.println("going back to main menu");
                            break;
                        default:
                            System.out.println("Invalid options");
                    }
                    break;
                case 3:
                    System.out.println("Main menu");
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }
    }
}
