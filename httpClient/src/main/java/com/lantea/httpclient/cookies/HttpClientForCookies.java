package com.lantea.httpclient.cookies;

import org.testng.annotations.BeforeMethod;

import java.util.Locale;
import java.util.ResourceBundle;

public class HttpClientForCookies {

    private String url;
    private ResourceBundle bundle;

    @BeforeMethod
    public void beforeTest() {
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    public void testHttpGet() {

    }

}
