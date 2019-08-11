package com.lantea.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1() {
        System.out.println("Student分组Class2222执行stu111");
    }

    public void stu2() {
        System.out.println("Student分组Class2222执行stu222");
    }
}
