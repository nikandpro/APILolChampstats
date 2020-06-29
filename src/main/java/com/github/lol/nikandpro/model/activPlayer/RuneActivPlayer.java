package com.github.lol.nikandpro.model.activPlayer;

import com.github.lol.nikandpro.model.core.rune.Rune;
//import com.github.lol.nikandpro.model.core.rune.PrimaryRuneTree;
//import com.github.lol.nikandpro.model.core.rune.SecondaryRuneTree;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "fullRunes")
public class RuneActivPlayer {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "keystone")
    private Rune keystone;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "primaryRuneTree")
    private Rune primaryRuneTree;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "secondaryRuneTree")
    private Rune secondaryRuneTree;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "activeplayer")
    private Activeplayer activeplayer;

    public RuneActivPlayer() {}

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

    public Rune getPrimaryRuneTree() {
        return primaryRuneTree;
    }

    public void setPrimaryRuneTree(Rune primaryRuneTree) {
        this.primaryRuneTree = primaryRuneTree;
    }

    public Rune getSecondaryRuneTree() {
        return secondaryRuneTree;
    }

    public void setSecondaryRuneTree(Rune secondaryRuneTree) {
        this.secondaryRuneTree = secondaryRuneTree;
    }

    public Activeplayer getActiveplayer() {
        return activeplayer;
    }

    public void setActiveplayer(Activeplayer activeplayer) {
        this.activeplayer = activeplayer;
    }
}
