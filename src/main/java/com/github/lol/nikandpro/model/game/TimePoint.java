package com.github.lol.nikandpro.model.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "timePoint")
public class TimePoint {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "game")
    private Game game;
    @DatabaseField(columnName = "gameTime")
    private double gameTime;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public String gameMode;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public String mapName;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public String mapNumber;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public String mapTerrain;

    public TimePoint() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public double getGameTime() {
        return gameTime;
    }

    public void setGameTime(double gameTime) {
        this.gameTime = gameTime;
    }
}
