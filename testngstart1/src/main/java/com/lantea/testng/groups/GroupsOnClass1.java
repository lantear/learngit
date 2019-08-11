package com.lantea.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1() {
        System.out.println("Student分组Class1111执行stu111");
    }

    public void stu2() {
        System.out.println("Student分组Class1111执行stu222");
    }
}
