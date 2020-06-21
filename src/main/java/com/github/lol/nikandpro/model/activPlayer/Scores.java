package com.github.lol.nikandpro.model.activPlayer;

import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "scores")
public class Scores {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    //@DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    //private TimePoint timePoint;
    @DatabaseField(columnName = "assists")
    private int assists;
    @DatabaseField(columnName = "creepScore")
    private int creepScore;
    @DatabaseField(columnName = "deaths")
    private int deaths;
    @DatabaseField(columnName = "kills")
    private int kill;
    @DatabaseField(columnName = "wardScore")
    private float wardScore;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "player")
    private Player player;

    public Scores() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public TimePoint getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(TimePoint timePoint) {
        this.timePoint = timePoint;
    }*/

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getCreepScore() {
        return creepScore;
    }

    public void setCreepScore(int creepScore) {
        this.creepScore = creepScore;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public float getWardScore() {
        return wardScore;
    }

    public void setWardScore(float wardScore) {
        this.wardScore = wardScore;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
