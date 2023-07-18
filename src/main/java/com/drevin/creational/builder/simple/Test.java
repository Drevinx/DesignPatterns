package com.drevin.creational.builder.simple;

public class Test {

    public static void main(String[] args) {

        HttpClient httpClient = new HttpClient("GET", "https:/test.com",null,null,null,null);

        HttpClient.HttpClientBuilder httpClientBuilder = new HttpClient.HttpClientBuilder();
        httpClientBuilder.url("test.com");
        httpClient = httpClientBuilder.build();
        System.out.println(httpClient);
    }
}
