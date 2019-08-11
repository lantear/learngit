package com.lantea.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters(value = {"name", "age"})
    public void parameterMethod1(String name, int age) {
        System.out.println("name:" + name + ", age:" + age);
    }
}
