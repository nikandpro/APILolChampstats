package com.github.lol.nikandpro.model.activPlayer;

import com.github.lol.nikandpro.model.core.SummonerSpell;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "player_SummonerSpells")
public class PlayerSummonerSpell {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "summonerSpell1")
    private SummonerSpell summonerSpell1;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "summonerSpell2")
    private SummonerSpell summonerSpell2;

    public PlayerSummonerSpell() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TimePoint getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(TimePoint timePoint) {
        this.timePoint = timePoint;
    }

    public SummonerSpell getSummonerSpell1() {
        return summonerSpell1;
    }

    public void setSummonerSpell1(SummonerSpell summonerSpell1) {
        this.summonerSpell1 = summonerSpell1;
    }

    public SummonerSpell getSummonerSpell2() {
        return summonerSpell2;
    }

    public void setSummonerSpell2(SummonerSpell summonerSpell2) {
        this.summonerSpell2 = summonerSpell2;
    }
}
