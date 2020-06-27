package com.github.lol.nikandpro.model.activPlayer;

import com.github.lol.nikandpro.model.game.TimePoint;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "championStats")
public class ChampionStats {
    @DatabaseField(generatedId = true, columnName = "id")
    private int id;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, columnName = "timePoint")
    private TimePoint timePoint;
    @DatabaseField(columnName = "abilityPower")
    private double abilityPower;
    @DatabaseField(columnName = "armor")
    private double armor;
    @DatabaseField(columnName = "attackDamage")
    private double attackDamage;
    @DatabaseField(columnName = "maxHealth")
    private double maxHealth;
    @DatabaseField(columnName = "moveSpeed")
    private double moveSpeed;

    public ChampionStats() {}

    public TimePoint getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(TimePoint timePoint) {
        this.timePoint = timePoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(double abilityPower) {
        this.abilityPower = abilityPower;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
