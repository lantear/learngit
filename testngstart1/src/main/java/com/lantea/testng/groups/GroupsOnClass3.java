package com.lantea.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1() {
        System.out.println("class333分组teacher，方法teacher1执行");
    }
    public void teacher2() {
        System.out.println("class333分组teacher，方法teacher2执行");
    }
}
