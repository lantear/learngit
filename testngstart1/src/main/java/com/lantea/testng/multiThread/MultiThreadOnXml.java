package com.lantea.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    /*@Test(invocationCount = 10, threadPoolSize = 3)
    public void test1() {
        System.out.println("aaaaa");
        System.out.printf("Thread Id: %s\n", Thread.currentThread().getId());
    }*/


    @Test
    public void test1() {
        System.out.println("111");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.println("111");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.println("111");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }
}
