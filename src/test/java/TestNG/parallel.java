package TestNG;

import org.testng.annotations.Test;

public class parallel {
    @Test
    void a() throws Exception{
        Thread.sleep(5000);
        System.out.println("Hello World");
    }

    @Test
    void b() throws Exception{
        Thread.sleep(6000);
        System.out.println("Hi There!!!");
    }

    @Test
    void c() throws Exception{
        Thread.sleep(3000);
        System.out.println("How are you?");
    }

    @Test
    void d() throws Exception{
        Thread.sleep(3000);
        System.out.println("Good Evening");
    }

    @Test
    void e() throws Exception{
        Thread.sleep(3000);
        System.out.println("Good Night");
    }
}
