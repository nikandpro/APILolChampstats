package com.github.lol.nikandpro.model.game;

import com.github.lol.nikandpro.Client.Region;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "GivenPlayers")
public class GivenPlayer {
    @DatabaseField(id = true, columnName = "id")
    private String id;
    @DatabaseField(id = true, columnName = "accountID")
    private String accountId;
    @DatabaseField(columnName = "name")
    private String name;
    @DatabaseField(columnName = "region")
    private Region region;

    public GivenPlayer() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
