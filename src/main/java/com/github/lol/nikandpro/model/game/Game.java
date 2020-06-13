package com.github.lol.nikandpro.model.game;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "game")
public class Game {
    @DatabaseField(id = true, columnName = "id")
    private long id;
    @DatabaseField(columnName = "gameStatus")
    private String gameStatus;
    @DatabaseField(columnName = "gameMode")
    private String gameMode;

    public Game() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }
}
