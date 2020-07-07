package com.github.lol.nikandpro.model.core.rune;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "runes")
public class Rune {
    @DatabaseField(columnName = "nameRune")
    private String nameRune;
    @DatabaseField(columnName = "displayName")
    private String displayName;
    @DatabaseField(id =true, columnName = "id")
    private int id;
    @DatabaseField(columnName = "rawDescription")
    private String rawDescription;
    @DatabaseField(columnName = "rawDisplayName")
    private String rawDisplayName;

    public Rune() {}

    public String getNameRune() {
        return nameRune;
    }

    public void setNameRune(String nameRune) {
        this.nameRune = nameRune;
    }

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
}
