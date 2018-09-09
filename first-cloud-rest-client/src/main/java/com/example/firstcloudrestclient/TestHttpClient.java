package com.example.firstcloudrestclient;


import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class TestHttpClient {



    public static void main(String[] a) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        for(int i = 1 ; i<= 1000 ; i++){


            HttpGet httpGet = new HttpGet("http://localhost:9000/router");
            HttpResponse response = httpClient.execute(httpGet);

            System.out.println("第"+i+"次"+EntityUtils.toString(response.getEntity()));

        }

    }


}
