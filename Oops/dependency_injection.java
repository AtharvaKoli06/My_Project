package Oops;

class Student {
    private Heart h;
    public Student (Heart h) {
        this.h = h;
    }
    public void call() {
        h.heartBeater();
    }
}
class Heart {
 public void heartBeater () {
     System.out.println("Heart is important :( ");
 }
}
//The Car2 is target class
class Car2 {
    private Engine e;
    public Car2(Engine e){
        this.e = e;
    }
    public void start() {
        e.engineStart();
    }
}
//The Engine is dependent object
class Engine {
    public void engineStart() {
        System.out.println("Car Started :)");
    }
}
public class dependency_injection {
    public static void main(String[] args) {

//        Heart h = new Heart();
//        Student s = new Student(h);
//        s.call();
        Engine e = new Engine();
        Car2 c2 = new Car2(e);//Constructor injections
        c2.start();



        //One object inject in another object it is call dependency injection
    }
}
