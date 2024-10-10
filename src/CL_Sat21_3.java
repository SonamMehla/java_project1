public class CL_Sat21_3 {
    public static void main(String[] args) {
        int x = 10;
        int year = 2000;
        int age =18;

        // que1

        if(x%2 == 0){
            System.out.println("x is an even number");
        }
        else{
            System.out.println("x is not an odd number");
        }

        // que2

        if(x>0){
            System.out.println("x is positive  number");
        }
        else{
            System.out.println(" x is negative number");
        }

        // que3

        if(year%400 ==0){
            System.out.println( "year is leap year");
        }
        else{
            System.out.println("Year is not leap year");
        }

        // que4

        if(age>=18){
            System.out.println("You are eligible to drive");
        }
        else{
            System.out.println("you are not eligible to drive");
        }


    }
}
