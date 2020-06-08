package com.github.lol.nikandpro.model.activPlayer;

import com.github.lol.nikandpro.model.core.rune.Keystone;
import com.github.lol.nikandpro.model.core.rune.PrimaryRuneTree;
import com.github.lol.nikandpro.model.core.rune.SecondaryRuneTree;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "fullRunes")
public class RuneActivPlayer {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "keystone")
    private Keystone keystone;
    @DatabaseField(foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "primaryRuneTree")
    private PrimaryRuneTree primaryRuneTree;
    @DatabaseField(foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "secondaryRuneTree")
    private SecondaryRuneTree secondaryRuneTree;
    @DatabaseField(foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "activeplayer")
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

    public Keystone getKeystone() {
        return keystone;
    }

    public void setKeystone(Keystone keystone) {
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

    public Activeplayer getActiveplayer() {
        return activeplayer;
    }

    public void setActiveplayer(Activeplayer activeplayer) {
        this.activeplayer = activeplayer;
    }
}
