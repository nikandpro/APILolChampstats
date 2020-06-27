package com.github.lol.nikandpro.model.activPlayer;

import com.github.lol.nikandpro.model.core.abilities.*;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "abilities")
public class AbilitiesActivPlayer {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "player")
    private Activeplayer activeplayer;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "E")
    private E e;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "passive")
    private Passive passive;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "Q")
    private Q q;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "R")
    private R r;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "W")
    private W w;

    public AbilitiesActivPlayer() {
    }

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

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public Passive getPassive() {
        return passive;
    }

    public void setPassive(Passive passive) {
        this.passive = passive;
    }

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public W getW() {
        return w;
    }

    public void setW(W w) {
        this.w = w;
    }
}