package TestNG;

import org.testng.annotations.*;

public class BeforeAfter {
    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeGroups
    void beforeGroups(){
        System.out.println("Before Groups");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterTest
    void afterTest(){
        System.out.println("After Test");
    }

    @AfterGroups
    void afterGroups(){
        System.out.println("After Groups");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite");
    }

    @Test(groups = {"Regression"})
    void a(){
        System.out.println("void a() from 'BeforeAfter'");
    }

    @Test
    void b(){
        System.out.println("void b() from 'BeforeAfter'");
    }
}
