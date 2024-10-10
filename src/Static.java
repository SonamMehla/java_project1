public class Static {
    public  static void test(){
        System.out.println("This is test method...");
    }
    static {
        System.out.println("This is static block");
    }
    Static(){
        System.out.println("This is constructor..");
    }
    {
        System.out.println("This is instance block");
    }
    public void myMethod(){
        System.out.println("This is non static method");
    }
    static {
        System.out.println("This is second static block");
    }
}
class StaticMain{
    public static void main(String[] args) {
 //        new Static();
         Static s = new Static();
         s.myMethod();


    }
}
