package com.github.lol.nikandpro.model.ActivPlayer;

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
    private float abilityPower;
    @DatabaseField(columnName = "armor")
    private float armor;
    @DatabaseField(columnName = "attackDamage")
    private float attackDamage;
    @DatabaseField(columnName = "maxHealth")
    private float maxHealth;
    @DatabaseField(columnName = "moveSpeed")
    private float moveSpeed;

    public ChampionStats() {}

    public TimePoint getTimePoint() {
        return timePoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimePoint(TimePoint timePoint) {
        this.timePoint = timePoint;
    }

    public float getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(float abilityPower) {
        this.abilityPower = abilityPower;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
    }

    public float getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(float maxHealth) {
        this.maxHealth = maxHealth;
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(float moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
