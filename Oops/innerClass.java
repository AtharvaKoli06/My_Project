package Oops;
//three types of inner class are member, static and anonymous
class A {
    int age = 19;
    String name = "Atharva";
    Address add;
    static class Address extends A {
        String city = "Mumbai";
        String state = "Maharashtra";
        int pincode = 401302;
        String areaName = "Arnala Grampanchayat near, virar";
        public void Addresss() {System.out.println(areaName + " " + city + " " + pincode + " " + state + " " + age + " " + name);}
    }
    public void show() {
        System.out.println("In Show:(");
    }
    static class B { public void display() {
          System.out.println("In display :) ");
       }}
}
public class innerClass {
    public static void main(String[] args) {
        //For default inner class
//        A obj = new A();
//        A.B obj1 = obj.new B();
//        obj.show();
//        obj1.display();

//        For static inner class
//        A obj = new A();
//        A.B obj1 = new A.B();
//        obj.show();
//        obj1.display();

        A.Address obj = new A.Address();
        obj.Addresss();




    }
}
