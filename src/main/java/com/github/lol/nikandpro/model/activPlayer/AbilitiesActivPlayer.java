package com.github.lol.nikandpro.model.activPlayer;

import com.github.lol.nikandpro.model.core.abilities.*;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "abilitiesActPl")
public class AbilitiesActivPlayer {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "player")
    private Activeplayer activeplayer;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "E")
    private Abilities e;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "Q")
    private Abilities q;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "R")
    private Abilities r;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "W")
    private Abilities w;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "passive")
    private Passive passive;


    public AbilitiesActivPlayer() {}

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

    public Activeplayer getActiveplayer() {
        return activeplayer;
    }

    public void setActiveplayer(Activeplayer activeplayer) {
        this.activeplayer = activeplayer;
    }

    public Abilities getE() {
        return e;
    }

    public void setE(Abilities e) {
        this.e = e;
    }

    public Abilities getQ() {
        return q;
    }

    public void setQ(Abilities q) {
        this.q = q;
    }

    public Abilities getR() {
        return r;
    }

    public void setR(Abilities r) {
        this.r = r;
    }

    public Abilities getW() {
        return w;
    }

    public void setW(Abilities w) {
        this.w = w;
    }

    public Passive getPassive() {
        return passive;
    }

    public void setPassive(Passive passive) {
        this.passive = passive;
    }
}