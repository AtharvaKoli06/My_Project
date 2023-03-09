package Oops;

interface Computer{
     void compileCode();
}
interface message {
    void disp();
}
class Laptop implements Computer {
     public void compileCode() {
         System.out.println("Ypu got 5 error:(");
     }
}
class Desktop implements Computer{
    public void compileCode() {
        System.out.println("Ypu got 5 error:( Faster");
    }
}
class Developer {
    public void buildApp(Computer obj) {
        System.out.println("Building App :(");
        obj.compileCode();
    }
}
public class Interface {
    public static void main(String[] args) {
        Computer obj = new Desktop();
        Computer obj1 = new Laptop();
        Developer dev = new Developer();
//        dev.buildApp(obj);
//        dev.buildApp(obj1);

            message m = () -> {
                System.out.println("Hello world");
           };
            m.disp();

    }
}
