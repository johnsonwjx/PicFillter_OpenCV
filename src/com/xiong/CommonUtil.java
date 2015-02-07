package com.xiong;


import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;

/**
 * Created by xiong on 14-7-1.
 */
public class CommonUtil {
    public static boolean StringEmpty(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().length() == 0;
    }

    public static HttpClient getHttpClient(String cookieStr) {
        if (StringEmpty(cookieStr)) {
            return null;
        }
        String[] arr = cookieStr.split(";");
        if (arr.length <= 0) {
            return null;
        }
        BasicCookieStore cookieStore = new BasicCookieStore();
        for (String temp : arr) {
            int index = temp.indexOf("=");
            String key = temp.substring(0, index);
            String value = temp.substring(index + 1);
            BasicClientCookie cookie = new BasicClientCookie(key, value);
            cookie.setDomain("soufun.com");
            cookie.setPath("/");
            cookieStore.addCookie(cookie);
        }
        HttpClient client = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        return client;
    }
}
