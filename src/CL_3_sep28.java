import java.util.Scanner;

public class CL_3_sep28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input :");
        int num = sc .nextInt();
        int i=1;
        int factorial = 1;
        do{
            factorial *= i;
            i++;

        }while (i<=num);
        System.out.println(factorial);
    }
}
