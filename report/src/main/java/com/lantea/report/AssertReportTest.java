package com.lantea.report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertReportTest {

    @Test
    public void test1() {
        Assert.assertEquals(1,2);
    }

    @Test
    public void test222() {
        Assert.assertEquals("aaaaa","aaa");
    }

    @Test
    public void test333() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void test444() {
        Assert.assertEquals("ddddd","ddddd");
    }

    @Test
    public void logDemo() {
        Reporter.log("这个是extentreports的日志报告");
        throw new RuntimeException("这个是extentreports的运行时异常");
    }

}
