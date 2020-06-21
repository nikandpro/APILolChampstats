package com.github.lol.nikandpro.model.apiLol.liveClient;



import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class UrlRequest {

    public static String getJsonActiv(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet request = new HttpGet(url);
            //add request headers
            //request.addHeader("custom-key", "mkyong");
            //request.addHeader(HttpHeaders.USER_AGENT, "Googlebot");

            CloseableHttpResponse response = httpClient.execute(request);

            try {

                // Get HttpResponse Status
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    // return it as a String
                    return EntityUtils.toString(entity);
                } else {
                    throw new RuntimeException();
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }

    }

    public static String getJsonPlayer(String url, String summonersName) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet request = new HttpGet(url+summonersName);
            CloseableHttpResponse response = httpClient.execute(request);

            try {

                // Get HttpResponse Status
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String result = EntityUtils.toString(entity);
                    System.out.println(result);
                    return result;
                } else return null;

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
    }

    public static void checkStatusPlayer(String summonerName) {}


}
