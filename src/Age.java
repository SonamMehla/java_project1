public class Age {
    public static void main(String[] args) {
        int age = 35;
        if(age<13){
            System.out.println("Child");
        } else if (age>=13 && age<=19) {
            System.out.println("Teenager");
        } else if (age>=20 && age <=59) {
            System.out.println("Adult");
        } else if (age>=60) {
            System.out.println("Senior");
        }
    }
}
