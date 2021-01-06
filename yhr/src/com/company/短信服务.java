package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class 短信服务 {
    public static void main(String[] args) throws IOException{
        URL url = new URL(" https://itdage.com/kkb/kkbsms?key=xzk&number=18936132062&code=WGN1314");
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
        String text = br.readLine();
        System.out.println(text);
        br.close();
    }
}
