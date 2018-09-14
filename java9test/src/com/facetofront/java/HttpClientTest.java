package com.facetofront.java;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;

public class HttpClientTest {

        public static void main(String[] args) {
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.baidu.com")).GET().build();
                HttpResponse<java.lang.String> response = null;
                response = client.send(req,HttpResponse.BodyHandler.asString());
                System.out.println(response.statusCode());
                System.out.println(response.version().name());
                System.out.println(response.body());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

}
