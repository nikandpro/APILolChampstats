package com.github.lol.nikandpro.model.core.rune;

import com.github.lol.nikandpro.model.activPlayer.RuneActivPlayer;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "generalRunes")
public class GeneralRunes implements Rune {
    @DatabaseField(columnName = "displayName")
    private String displayName;
    @DatabaseField(id =true, columnName = "id")
    private int id;
    @DatabaseField(columnName = "rawDescription")
    private String rawDescription;
    @DatabaseField(columnName = "rawDisplayName")
    private String rawDisplayName;
    @DatabaseField(columnName = "runeActivPlayer")
    private RuneActivPlayer runeActicPlayer;

    public GeneralRunes() {}

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRawDescription() {
        return rawDescription;
    }

    public void setRawDescription(String rawDescription) {
        this.rawDescription = rawDescription;
    }

    public String getRawDisplayName() {
        return rawDisplayName;
    }

    public void setRawDisplayName(String rawDisplayName) {
        this.rawDisplayName = rawDisplayName;
    }

    public RuneActivPlayer getRuneActicPlayer() {
        return runeActicPlayer;
    }

    public void setRuneActicPlayer(RuneActivPlayer runeActicPlayer) {
        this.runeActicPlayer = runeActicPlayer;
    }
}