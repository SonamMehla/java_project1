public class MainClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Lincoln";
        car.model = "M2022";
        car.price = 95498;

        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.price);
    }
}
