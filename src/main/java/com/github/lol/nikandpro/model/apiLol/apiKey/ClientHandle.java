package com.github.lol.nikandpro.model.apiLol.apiKey;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.lol.nikandpro.Client.GivenPlayer;
import com.github.lol.nikandpro.Client.Key;
import com.github.lol.nikandpro.Client.Region;
import com.github.lol.nikandpro.ObjectMapperFactory;
import com.github.lol.nikandpro.databaseConfiguration.DatabaseConfiguration;
import com.github.lol.nikandpro.model.apiLol.liveClient.RequestCONST;
import com.github.lol.nikandpro.model.game.Game;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.sql.SQLException;

public class ClientHandle {

    public static GivenPlayer seeID(GivenPlayer givenPlayer) throws IOException, SQLException {
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(GivenPlayer.class);
        System.out.println("startSeeID");
        givenPlayer = obMap.readValue(getJsonClient(ClientCONST.SUMMONER, givenPlayer, givenPlayer.getName()), GivenPlayer.class);
        System.out.println("successRecordGivenPlayer");
        if (!checkDB(givenPlayer.getId())) {
            System.out.println("noInDB");
            DatabaseConfiguration.givenPlayerDao.create(givenPlayer);
        } else System.out.println("haveInDB");
        System.out.println(givenPlayer.getId());
        System.out.println("finishedSeeID");
        return givenPlayer;
    }

    public static Game gameStart(Game game, GivenPlayer givenPlayer) throws IOException, SQLException, InterruptedException {
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(Game.class);
        System.out.println("gameStart");
        while (!checkStartGame(ClientCONST.SPECTATOR, givenPlayer)) {
            Thread.sleep(1000);
        }
        game = obMap.readValue(getJsonClient(ClientCONST.SPECTATOR, givenPlayer, givenPlayer.getId()), Game.class);
        System.out.println("successRecordGameStart");
        DatabaseConfiguration.gameDao.create(game);
        System.out.println("finishedGameStart");
        return game;
    }

    public static String  getJsonClient(String url, GivenPlayer givenPlayer, String value) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            String json1 = link(givenPlayer.getRegion(), url, value);
            System.out.println(json1);
            HttpGet request = new HttpGet(json1);
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                if (response.getStatusLine().getStatusCode()==403) {
                    System.out.println("expired key");
                    throw new RuntimeException();
                }
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String json = EntityUtils.toString(entity);
                    System.out.println("intity="+json);
                    return json;
                } else {
                    System.out.println("error Json");
                    throw new RuntimeException();
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }

    }


    public static boolean checkStartGame(String clientConst, GivenPlayer givenPlayer) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            System.out.println("checkStartGame");
            HttpGet request = new HttpGet(link(givenPlayer.getRegion(), clientConst, givenPlayer.getId()));
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                if (response.getStatusLine().getStatusCode()==200) {
                    return true;
                } if (response.getStatusLine().getStatusCode()==404)  {
                    return false;
                } if (response.getStatusLine().getStatusCode()==403)  {
                    System.out.println("error Key");
                    throw new RuntimeException();
                } else {
                    System.out.println("error Request");
                    throw new RuntimeException();
                }


            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
    }

    private static boolean checkDB(String id) throws SQLException {
        boolean bol=false;
        System.out.println("--------------------");
        for (GivenPlayer gv: DatabaseConfiguration.givenPlayerDao.queryForAll()) {
            if (gv.getId().equals(id)) {
                bol=true;
            }
        }
        System.out.println("--------------------");
        System.out.println(bol);
        return bol;
    }



    private static String link(Region region, String clientCONST, String name) {
        return "https://"+region+clientCONST+name+"?api_key=" + Key.api_key;
    }

}
