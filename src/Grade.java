public class Grade {
    public static void main(String[] args) {
        float grade = 87.0f;
        if(grade>=90){
            System.out.println("Your grade is A");
        }
        else if (grade>=80 && grade <=89) {
            System.out.println("Your grade is B");
        }
        else if (grade>=70 && grade <= 79) {
            System.out.println("Your grade is c");
        }
        else if (grade>=60 && grade <=69) {
            System.out.println("Your grade is d");
        }
        else{
            System.out.println("you are fail");
        }

    }
}
