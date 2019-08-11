package com.lantea.testng.suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest() {
        System.out.println("登录成功！");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod 在方法执行之前");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod 在方法执行之后");
    }
}
