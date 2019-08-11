package com.lantea.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 2000)
    public void timeOut1() throws InterruptedException{
        Thread.sleep(1000);
        //System.out.println("未超时！！");
    }
    @Test(timeOut = 2000)
    public void timeOut2() throws InterruptedException{
        Thread.sleep(3000);
        //System.out.println("超时！！");
    }
}
