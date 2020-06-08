package com.github.lol.nikandpro.model.core;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "summonerSpell")
public class SummonerSpell {
    @DatabaseField(id = true, columnName = "displayName")
    private String displayName;
    @DatabaseField(columnName = "rawDescription")
    private String rawDescription;
    @DatabaseField(columnName = "rawDisplayName")
    private String rawDisplayName;

    public SummonerSpell() {}

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
