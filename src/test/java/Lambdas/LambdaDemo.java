package Lambdas;

import org.testng.annotations.Test;

public class LambdaDemo {

    @Test
    public void lambdaTest() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        Runnable runnable1 = () -> {
            System.out.println("hello");
            System.out.println("hello2");
        };
    }
}
