package FunctionalInterfaces;

public class HelloWorldMain {
    public static void main(String args[]) {
        // Lambda Expression
        HelloWorld helloWorld = () -> System.out.println("Hello using Lambda Expression");
        helloWorld.sayHello();
    }
}
