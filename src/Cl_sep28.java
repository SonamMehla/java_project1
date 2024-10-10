import java.util.Scanner;

public class Cl_sep28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int num = sc.nextInt();
        int i=1;
        int sum =0;
        do{
           sum += i;
            i++;
        }while (i<=num);
        System.out.println(sum);
    }
}
