package tests;

import org.testng.annotations.Test;

public class WebTests {

    @Test(priority = 1)
    public void webTest1(){
        System.out.println("In web test 1 method");
    }

    @Test(priority = 2)
    public void webTest2(){
        System.out.println("In web test 2 method");
    }
}

