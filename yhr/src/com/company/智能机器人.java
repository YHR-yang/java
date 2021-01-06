package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class 智能机器人 {
    public static void main(String[] args) throws IOException {
        String question = URLEncoder.encode("呆货","UTF-8");
        URL url = new URL("http://api.jisuapi.com/iqa/query?appkey=62958a3a6ef3c56d&question=雷军是谁，详细的说");
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String test = br.readLine();
        System.out.println(test);
        br.close();
    }
}