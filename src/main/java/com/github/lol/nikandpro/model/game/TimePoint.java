package com.github.lol.nikandpro.model.game;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "timePoint")
public class TimePoint {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(columnName = "game")
    private Game game;
    @DatabaseField(columnName = "timeGame")
    private float timeGame;

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

    public float getTimeGame() {
        return timeGame;
    }

    public void setTimeGame(float timeGame) {
        this.timeGame = timeGame;
    }
}
