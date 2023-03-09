package Oops;
class parent {
    int age = 19;
    parent() {
        System.out.println("Parent class Constructor call :( ");
    }
    void message() {
        System.out.println("This is the parent class method :(" + age);
    }

}
class child extends parent{
    child() {
//        super();
        System.out.println("Printing the super method :(");
    }
    void disp() {
        System.out.println("The age is :( " + age);
    }
}
public class Inheritance {
    public static void main(String[] args) {
     child c = new child();
     c.message();
     c.disp();
    }
}
