package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

    @Parameters("example")
    @Test
    void a(String s){
        System.out.println(s);
    }

    @Parameters("example2")
    @Test
    void b(int s){
        System.out.println(s+1);
    }
}
