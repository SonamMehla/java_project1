import java.util.Scanner;

public class CL4_sep28 {
    public static void main(String[] args) {
        char choice;
        do{
        Scanner sc = new Scanner(System.in);

        System.out.println("+, - , *, /, %");
        System.out.println("Choice the operator :");
        char op = sc.next().charAt(0);
        System.out.println("Enter the first num :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second num :");
        int num2 = sc.nextInt();

            if(op== '+'){
                System.out.println(num1 + "+" + num2 + "=" + num1+num2);
            }
            else if(op== '*'){
                System.out.println(num1 + "*" + num2 + "=" + num1*num2);
            }
            else if(op== '/'){
                System.out.println(num1 + "/" + num2 + "=" + num1/num2);
            }
            else if(op== '%'){
                System.out.println(num1 + "%" + num2 + "=" + num1%num2);
            }

            System.out.println("Do yoy want to continue ..Press y for yes and n for no");
            choice = sc.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');
    }
}
