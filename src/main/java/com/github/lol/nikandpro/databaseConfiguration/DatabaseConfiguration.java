package com.github.lol.nikandpro.databaseConfiguration;

import com.github.lol.nikandpro.model.ActivPlayer.Player;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class DatabaseConfiguration {

    public static ConnectionSource connectionSource;
    public static Dao<Player, Integer> playerDao;

    static {
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:C:\\Users\\User\\Desktop\\Project lol\\БД\\LolUserDB.db");
            TableUtils.createTableIfNotExists(connectionSource, Player.class);

            playerDao = DaoManager.createDao(connectionSource, Player.class);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
