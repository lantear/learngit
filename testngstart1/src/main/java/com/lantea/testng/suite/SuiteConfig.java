package com.lantea.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite 开始运行");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite 运行结束");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test 在testcase执行之前");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test 在testcase执行之后");
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
