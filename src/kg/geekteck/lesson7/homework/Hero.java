package kg.geekteck.lesson7.homework;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typeOfDefence;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfDefence() {
        return typeOfDefence;
    }

    public void setTypeOfDefence(String typeOfDefence) {
        this.typeOfDefence = typeOfDefence;
    }


}

