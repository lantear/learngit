package com.lantea.testng;

import org.testng.annotations.Test;

public class ExpectException {

    @Test(expectedExceptions = RuntimeException.class)
    public void testExcepion() {
        System.out.println("异常测试成功符合期望的异常");
        throw new RuntimeException();
    }
}
