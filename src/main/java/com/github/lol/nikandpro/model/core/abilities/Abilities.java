package com.github.lol.nikandpro.model.core.abilities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Abilities")
public class Abilities {
    @DatabaseField(columnName = "nameAbility")
    private String nameAb;
    @DatabaseField(columnName = "abilityLevel")
    private int abilityLevel;
    @DatabaseField(columnName = "displayName")
    private String displayName;
    @DatabaseField(id = true, columnName = "id_letter_Ability")
    private String id;
    @DatabaseField(columnName = "rawDescription")
    private String rawDescription;
    @DatabaseField(columnName = "rawDisplayName")
    private String rawDisplayName;

    public Abilities() {}

    public String getNameAb() {
        return nameAb;
    }

    public void setNameAb(String nameAb) {
        this.nameAb = nameAb;
    }

    public int getAbilityLevel() {
        return abilityLevel;
    }

    public void setAbilityLevel(int abilityLevel) {
        this.abilityLevel = abilityLevel;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
