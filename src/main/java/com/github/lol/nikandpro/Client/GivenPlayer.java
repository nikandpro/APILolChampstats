package com.github.lol.nikandpro.Client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "GivenPlayers")
public class GivenPlayer {
    @DatabaseField(id = true, columnName = "id")
    private String id;
    @DatabaseField(columnName = "summonerLevel")
    private int summonerLevel;
    @DatabaseField(columnName = "name")
    private String name;
    @DatabaseField(columnName = "region")
    private Region region;

    public static Region staticRegion;

    public GivenPlayer() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
