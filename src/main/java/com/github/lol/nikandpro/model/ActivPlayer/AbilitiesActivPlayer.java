package com.github.lol.nikandpro.model.ActivPlayer;

import com.github.lol.nikandpro.model.Core.abilities.*;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "abilities_activplayer")
public class AbilitiesActivPlayer {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "player")
    private Player player;
    @DatabaseField(columnName = "E")
    private E e;
    @DatabaseField(columnName = "passive")
    private Passive passive;
    @DatabaseField(columnName = "Q")
    private Q q;
    @DatabaseField(columnName = "R")
    private R r;
    @DatabaseField(columnName = "W")
    private W w;

    public AbilitiesActivPlayer() {
    }
}