import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number :");
        int s = sc.nextInt();
        System.out.println("Enter ending number :");
        int e = sc.nextInt();
        while (s<=e){
            System.out.println(s);
            s++;
        }
    }
}
