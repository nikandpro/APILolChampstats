package com.github.lol.nikandpro.model.apiLol.apiKey;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.eclipse.jetty.io.RuntimeIOException;

import java.io.IOException;

public class Summoner {
    public static void getJsonActiv() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {

            HttpGet request = new HttpGet("https://ru.api.riotgames.com/lol/summoner/v4/summoners/by-name/NullDeath?api_key=RGAPI-169eefbc-f15f-4e63-99e9-a25689abba2f");
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String result = EntityUtils.toString(entity);
                    System.out.println(result);
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }

    }
}