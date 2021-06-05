package com.objectmaster;

public class Human {

    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void attack(Human human){
        human.health -= this.strength;
    }

    @Override
    public String toString(){
        return "Health: " + health +
                "\tStealth: " + stealth +
                "\tIntelligence: " + intelligence +
                "\tStrength: " + strength;
    }

}
