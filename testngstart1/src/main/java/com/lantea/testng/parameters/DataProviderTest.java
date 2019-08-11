package com.lantea.testng.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void dataProviderTest(String name, int age) {
        System.out.println("name: " + name + ", age: " + age);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        Object[][] provider = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 14},
                {"wangwu", 16}
        };
        return  provider;
    }


    @Test(dataProvider = "data4Method")
    public void dataProviderForMethod1(String name, int age) {
        System.out.println("11111111name: " + name + ", age: " + age);
    }

    @Test(dataProvider = "data4Method")
    public void dataProviderForMethod2(String name, int age) {
        System.out.println("222222name: " + name + ", age: " + age);
    }


    @DataProvider(name = "data4Method")
    public Object[][] dataProvider4Mthod(Method method){
        Object[][] data = null;
        if (method.getName().equals("dataProviderForMethod1")) {
            data = new Object[][]{
                    {"zhangsan", 10},
                    {"lisi", 12}
            };
        } else if (method.getName().equals("dataProviderForMethod2")){
            data = new Object[][]{
                    {"wangwu", 14},
                    {"zhaoliu",16}
            };
        }

        return data;
    }

}
