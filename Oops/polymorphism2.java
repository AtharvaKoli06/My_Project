package Oops;

class Car {
    public void StartProcess() {
        System.out.println("Pull the Cars is button to start :( " + "Car");
    }
    public void IncreaseSpeed() {
        System.out.println("Cars Speed is 60Km per Hour :( " + "Car");
    }
}
class Lamborghini extends Car{
    public void StartProcess() {
        System.out.println("Enter the Car key Button to get started :( " + "Lamborghini");
    }
    public void IncreaseSpeed() {
        System.out.println("Cars Speed is 100Km per Hour :( " + "Lamborghini");
    }
}
class BMW extends Car{
    public void StartProcess() {
        System.out.println("Enter the Card in the cars starter point :(" + "BMW");
    }
    public void IncreaseSpeed() {
        System.out.println("Cars Speed is 150km per Hour :(" + "BMW");
    }
}
class Toyota extends Car {
    public void StartProcess() {
        System.out.println("Enter the key in the cars starter point :(" + "TOYOTA");
    }
    public void IncreaseSpeed() {
        System.out.println("Cars Speed is 290km per Hour :(" + "Toyota");
    }
}

class CarShowRoom  {
  public void poly(Car ref) {
      ref.StartProcess();
      ref.IncreaseSpeed();
      System.out.println("_____________________________________________________");
  }
}


public class polymorphism2 {
    public static void main(String[] args) {

        Lamborghini l = new Lamborghini();

        BMW bmw = new BMW();

        Toyota t = new Toyota();

        CarShowRoom csr = new CarShowRoom();
        csr.poly(l);
        csr.poly(bmw);
        csr.poly(t);

    }
}
