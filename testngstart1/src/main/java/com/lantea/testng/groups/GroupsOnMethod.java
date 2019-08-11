package com.lantea.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("Server组方法1开始执行");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("Server组方法2开始执行");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("Client端方法3开始执行");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("Client端方法4开始执行");
    }

    @BeforeGroups("server")
    public void beforeGroupOnServer() {
        System.out.println("BeforeGroup服务端Server执行开始。。");
    }

    @AfterGroups("server")
    public void afterGroupOnServer() {
        System.out.println("AfterGroup服务端Server执行结束。。");
    }
    @BeforeGroups("client")
    public void beforeGroupOnClient() {
        System.out.println("BeforeGroup服务端Client执行开始。。");
    }

    @AfterGroups("client")
    public void afterGroupOnClient() {
        System.out.println("AfterGroup服务端Client执行结束。。");
    }


}
