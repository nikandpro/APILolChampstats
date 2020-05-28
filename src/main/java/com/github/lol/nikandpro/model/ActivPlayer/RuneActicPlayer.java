package com.github.lol.nikandpro.model.ActivPlayer;

import com.github.lol.nikandpro.model.Core.rune.GeneralRunes;
import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "fullRunes")
public class RuneActicPlayer {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "rune")
    private GeneralRunes rune;
    @DatabaseField(foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "activeplayer")
    private Activeplayer activeplayer;
}
