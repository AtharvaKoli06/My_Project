package Oops;

interface Car1 {
    void drive();
}
//class wagonR implements Car1{
//    @Override
//    public void drive() {
//        System.out.println("Driving.....!!!");
//    }
//}
public class innerClass_anonymous {
    public static void main(String[] args) {
//        Car1 obj = () -> System.out.println("Driving...!");//Lambda expression
//anonymous inner class
        Car1 obj = new Car1() {
            @Override
            public void drive() {
                System.out.println("Driving...!");
            }
        };
        obj.drive();
    }
}
