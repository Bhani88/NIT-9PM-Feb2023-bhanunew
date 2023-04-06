package TestNG;

import org.testng.annotations.Test;

public class sample {
    @Test(priority = 1)
    void a(){
        System.out.println("Hello World");
    }

    @Test(priority = 1)
    void b(){
        System.out.println("Hi There!!!");
    }

    @Test(priority = 0)
    void c(){
        System.out.println("How are you?");
    }
}
