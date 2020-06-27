package com.github.lol.nikandpro.model.activPlayer;

import com.github.lol.nikandpro.model.core.rune.Rune;
import com.github.lol.nikandpro.model.core.rune.PrimaryRuneTree;
import com.github.lol.nikandpro.model.core.rune.SecondaryRuneTree;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "runes")
public class RunePlayer {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "keystone")
    private Rune keystone;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "primaryRuneTree")
    private PrimaryRuneTree primaryRuneTree;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "secondaryRuneTree")
    private SecondaryRuneTree secondaryRuneTree;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "player")
    private Player player;

    public RunePlayer() {}

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

    public Rune getKeystone() {
        return keystone;
    }

    public void setKeystone(Rune keystone) {
        this.keystone = keystone;
    }

    public PrimaryRuneTree getPrimaryRuneTree() {
        return primaryRuneTree;
    }

    public void setPrimaryRuneTree(PrimaryRuneTree primaryRuneTree) {
        this.primaryRuneTree = primaryRuneTree;
    }

    public SecondaryRuneTree getSecondaryRuneTree() {
        return secondaryRuneTree;
    }

    public void setSecondaryRuneTree(SecondaryRuneTree secondaryRuneTree) {
        this.secondaryRuneTree = secondaryRuneTree;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
