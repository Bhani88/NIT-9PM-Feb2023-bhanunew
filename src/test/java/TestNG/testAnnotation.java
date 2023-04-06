package TestNG;

import org.testng.annotations.Test;

public class testAnnotation {
    @Test
    void a(){
        System.out.println("void a() from 'testAnnotation'");
    }

    @Test(enabled = false)
    void b(){
        System.out.println("void b() from 'testAnnotation'");
    }

    @Test
    void c(){
        System.out.println("void c() from 'testAnnotation'");
    }

    @Test(timeOut = 1000)
    void d() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("void d() from 'testAnnotation'");
    }

    @Test(groups = {"Regression"})
    void e(){
        System.out.println("void e() from 'testAnnotation'");
    }

    @Test(groups = {"Regression","Sanity"})
    void f(){
        System.out.println("void f() from 'testAnnotation'");
    }

    @Test(dependsOnGroups = {"Regression"})
    void g(){
        System.out.println("void g() from 'testAnnotation'");
    }

    @Test(dependsOnMethods = "d",  alwaysRun = true)
    void h(){
        System.out.println("void h() from 'testAnnotation'");
    }
}
