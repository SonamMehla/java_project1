import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number :");
        int s = sc.nextInt();
        System.out.print("Enter ending number :");
        int e = sc.nextInt();
        int sum = 0;
        while (s <= e) {
            System.out.println(s);
            sum += s;
            s++;
        }
        System.out.println("Sum of all number = " + sum);

    }
}