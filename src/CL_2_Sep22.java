import java.util.Scanner;

public class CL_2_Sep22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input :");
        int num = sc .nextInt();
        int i = 1;
        do{
            System.out.println(num + "x" + i + "=" + num*i);
            i++;
        }while (i<=10);
    }
}
