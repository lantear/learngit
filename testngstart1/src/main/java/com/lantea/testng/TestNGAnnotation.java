package com.lantea.testng;

import org.testng.annotations.*;

public class TestNGAnnotation {

    @Test
    public void testCase1(){
        System.out.println("test hello world!");
    }

    @Test
    public void testCase2() {
        System.out.println("test case2 执行成功。。。");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod测试case运行之前执行");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod测试cases运行之后执行");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass运行之前执行");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass运行之后执行");
    }
}
