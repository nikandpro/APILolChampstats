package com.github.lol.nikandpro.model.apiLol.liveClient;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.lol.nikandpro.Client.GivenPlayer;
import com.github.lol.nikandpro.ObjectMapperFactory;
import com.github.lol.nikandpro.databaseConfiguration.DatabaseConfiguration;
import com.github.lol.nikandpro.model.controller.RecordController;
import com.github.lol.nikandpro.model.game.Game;
import com.github.lol.nikandpro.model.game.TimePoint;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.sql.SQLException;

public class LiveHandle {

    public static void recordGame(GivenPlayer givenPlayer, Game game) throws IOException, SQLException, InterruptedException {
        while (!getJsonStatus(RequestCONST.GAME_STATS)) {
            Thread.sleep(2000);
            System.out.println("wait");
        }
        String json = getJsonActiv(RequestCONST.GAME_STATS);
        System.out.println("nice request");
        TimePoint timePoint = new TimePoint();
        timePoint = recordTimePoint(json, timePoint);
        timePoint.setGame(game);
        DatabaseConfiguration.timePointDao.create(timePoint);
        RecordController.recordActivPlayer(timePoint);
    }

    private static TimePoint recordTimePoint(String json, TimePoint timePoint) throws IOException {
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(TimePoint.class);
        timePoint = obMap.readValue(json, TimePoint.class);
        System.out.println("successTimePoint");
        return timePoint;
    }



    public static String getJsonActiv(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet request = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(request);

            try {

                System.out.println(response.getProtocolVersion());
                System.out.println(response.getStatusLine().getStatusCode());
                System.out.println(response.getStatusLine().getReasonPhrase());
                System.out.println(response.getStatusLine().toString());

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String json = EntityUtils.toString(entity);
                    System.out.println(json);
                    return json;
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

    private static boolean getJsonStatus(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet request = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                if (response.getStatusLine().getStatusCode()==200) {
                    return true;
                } if (response.getStatusLine().getStatusCode()==404)  {
                    return false;
                } else {
                    System.out.println("error activ Request status");
                    throw new RuntimeException();
                }
            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
    }

    /*public static String getJsonPlayer(String url, String summonersName) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet request = new HttpGet(url+summonersName);
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
    }*/

    public static void checkStatusPlayer(String summonerName) {}


}
