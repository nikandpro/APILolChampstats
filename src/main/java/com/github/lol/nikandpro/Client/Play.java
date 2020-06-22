package com.github.lol.nikandpro.Client;

import com.github.lol.nikandpro.model.apiLol.apiKey.ClientCONST;
import com.github.lol.nikandpro.model.apiLol.apiKey.ClientHandle;
import com.github.lol.nikandpro.model.apiLol.liveClient.LiveHandle;
import com.github.lol.nikandpro.model.game.Game;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Play {
    public void gamePlay() throws IOException, SQLException, InterruptedException {
        System.out.println("start");
        GivenPlayer givenPlayer = new GivenPlayer();
        interf(givenPlayer);
        givenPlayer = ClientHandle.seeID(givenPlayer);
        while (!ClientHandle.checkStartGame(ClientCONST.SPECTATOR, givenPlayer)) {
          Thread.sleep(2000);
          System.out.println("no");
        }
        System.out.println("yes");
        Game game = new Game();
        game = ClientHandle.gameStart(game, givenPlayer);
        while (ClientHandle.checkStartGame(ClientCONST.SPECTATOR, givenPlayer)) {
            System.out.println("record");
            LiveHandle.recordGame(givenPlayer, game);
            System.out.println("ok");
            Thread.sleep(2000);
        }

    }


    /*public static void deserializeExample(String json) throws IOException, SQLException {
        Scores scores = new Scores();
        System.out.println(json);
        SimpleModule sm = new SimpleModule();
        ObjectMapper om = new ObjectMapper();
        sm.addDeserializer(Scores.class, new ScoresDeserialize());
        ObjectMapper obMap = om.registerModule(sm);
        scores = obMap.readValue(json, Scores.class);
        System.out.println(scores.toString());
        DatabaseConfiguration.scoresDao.create(scores);
    }*/





    private static void interf(GivenPlayer givenPlayer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите nikname: ");
        String name = sc.nextLine();
        givenPlayer.setName(name);
        System.out.println("Выберите регион ru, eun1: ");
        givenPlayer.setRegion(Region.valueOf(sc.nextLine()));
        GivenPlayer.staticRegion=givenPlayer.getRegion();
    }
}
