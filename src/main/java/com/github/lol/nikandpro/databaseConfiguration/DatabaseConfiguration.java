package com.github.lol.nikandpro.databaseConfiguration;

import com.github.lol.nikandpro.Client.GivenPlayer;
import com.github.lol.nikandpro.model.activPlayer.*;
import com.github.lol.nikandpro.model.core.abilities.*;
import com.github.lol.nikandpro.model.core.rune.GeneralRunes;
import com.github.lol.nikandpro.model.core.rune.Rune;
//import com.github.lol.nikandpro.model.core.rune.PrimaryRuneTree;
//import com.github.lol.nikandpro.model.core.rune.SecondaryRuneTree;
import com.github.lol.nikandpro.model.game.Game;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class DatabaseConfiguration {

    public static ConnectionSource connectionSource;
    public static Dao<AbilitiesActivPlayer, Integer> abilActPlayerDao;
    public static Dao<Activeplayer, Integer> actPlayerDao;
    public static Dao<ChampionStats, Integer> champStatsDao;
    public static Dao<Player, Integer> playerDao;
    public static Dao<PlayerItem, Integer> playerItemDao;
    public static Dao<PlayerSummonerSpell, Integer> playerSummonerDao;
    public static Dao<RuneActivPlayer, Integer> runeActPlayerDao;
    public static Dao<RunePlayer, Integer> runePlayerDao;
    public static Dao<Scores, Integer> scoresDao;
    public static Dao<Abilities, Integer> abilDao;
    public static Dao<Passive, Integer> passiveDao;
    public static Dao<GeneralRunes, Integer> genRuneDao;
    public static Dao<Rune, Integer> runesDao;
    public static Dao<Game, Integer> gameDao;
    public static Dao<TimePoint, Integer> timePointDao;
    public static Dao<GivenPlayer, Integer> givenPlayerDao;


    static {
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:C:\\Users\\User\\Desktop\\Project lol\\БД\\lolBD.db");
            TableUtils.createTableIfNotExists(connectionSource, AbilitiesActivPlayer.class);
            TableUtils.createTableIfNotExists(connectionSource, Activeplayer.class);
            TableUtils.createTableIfNotExists(connectionSource, ChampionStats.class);
            TableUtils.createTableIfNotExists(connectionSource, Player.class);
            TableUtils.createTableIfNotExists(connectionSource, PlayerItem.class);
            TableUtils.createTableIfNotExists(connectionSource, PlayerSummonerSpell.class);
            TableUtils.createTableIfNotExists(connectionSource, RuneActivPlayer.class);
            TableUtils.createTableIfNotExists(connectionSource, RunePlayer.class);
            TableUtils.createTableIfNotExists(connectionSource, Scores.class);
            TableUtils.createTableIfNotExists(connectionSource, Abilities.class);
            TableUtils.createTableIfNotExists(connectionSource, Passive.class);
            TableUtils.createTableIfNotExists(connectionSource, GeneralRunes.class);
            TableUtils.createTableIfNotExists(connectionSource, Rune.class);
            TableUtils.createTableIfNotExists(connectionSource, Game.class);
            TableUtils.createTableIfNotExists(connectionSource, TimePoint.class);
            TableUtils.createTableIfNotExists(connectionSource, GivenPlayer.class);



            abilActPlayerDao = DaoManager.createDao(connectionSource, AbilitiesActivPlayer.class);
            actPlayerDao = DaoManager.createDao(connectionSource, Activeplayer.class);
            champStatsDao = DaoManager.createDao(connectionSource, ChampionStats.class);
            playerDao = DaoManager.createDao(connectionSource, Player.class);
            playerItemDao = DaoManager.createDao(connectionSource, PlayerItem.class);
            playerSummonerDao = DaoManager.createDao(connectionSource, PlayerSummonerSpell.class);
            runeActPlayerDao = DaoManager.createDao(connectionSource, RuneActivPlayer.class);
            runePlayerDao = DaoManager.createDao(connectionSource, RunePlayer.class);
            scoresDao = DaoManager.createDao(connectionSource, Scores.class);
            abilDao = DaoManager.createDao(connectionSource, Abilities.class);
            passiveDao = DaoManager.createDao(connectionSource, Passive.class);
            genRuneDao = DaoManager.createDao(connectionSource, GeneralRunes.class);
            runesDao = DaoManager.createDao(connectionSource, Rune.class);
            gameDao = DaoManager.createDao(connectionSource, Game.class);
            timePointDao = DaoManager.createDao(connectionSource, TimePoint.class);
            givenPlayerDao = DaoManager.createDao(connectionSource, GivenPlayer.class);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
