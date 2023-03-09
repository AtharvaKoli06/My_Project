package Oops;

//class Aeroplane {
//    public void takeOff() {
//        System.out.println("The plane is ready to take Off :( ");
//    }
//    public void fly() {
//        System.out.println("The plan is flying :( ");
//    }
//}
abstract class Aeroplane {
    abstract public void takeOff();
    abstract public void fly();
    public void landing() { //inheritance method
        System.out.println("Aeroplane is Landing :(");
    }
}
class CargoPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("Cargo require longer runway:( ");
    }
    public void fly() {
        System.out.println("The CargoPlan is fly Now on Low height :( ");
    }
    public void Alert() { //Specialized method
        System.out.println("Alert...:():");
    }
}
class PassengerPlan extends Aeroplane{
    public void takeOff() {
        System.out.println("The PassengerPlane is ready to take Off :( ");
    }
    public void fly() {
        System.out.println("The PassengerPlan is fly Now on Maximum height :( ");
    }
}
class FighterPlan extends Aeroplane{
    public void takeOff() {
        System.out.println("The FighterPlan require small runway to take Off :( ");
    }
    public void fly() {
        System.out.println("The FighterPlan fly Now on higher height :( ");
    }
}
class Airport {
    public void poly(Aeroplane ref) {
        ref.takeOff();
        ref.fly();
        System.out.println("--------------------------------------");
    }
}
public class polymorphism1 {
    public static void main(String[] args) {

//        CargoPlane cp = new CargoPlane();

//        PassengerPlan pp = new PassengerPlan();

//        FighterPlan fp = new FighterPlan();

        //For abstraction
        Aeroplane ref1 = new CargoPlane();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();
        ((CargoPlane) ref1).Alert();//Down casting

        Aeroplane ref2 = new PassengerPlan();
        ref2.takeOff();
        ref2.fly();
        ref2.landing();
        //upper line are for abstraction


        //polymorphism
//        Airport a = new Airport();
//        a.poly(cp);
//        a.poly(pp);
//        a.poly(fp);


//       Aeroplane ref;
//       ref = cp;
//       ref.takeOff();
//       ref.fly();
//
//        System.out.println("__________________________________________________________________");
//
//       ref =pp;
//       ref.takeOff();
//       ref.fly();

    }
}
